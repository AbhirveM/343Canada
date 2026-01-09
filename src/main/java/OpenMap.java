import org.geotools.data.shapefile.ShapefileDataStore;
import org.geotools.data.simple.SimpleFeatureCollection;
import org.geotools.data.simple.SimpleFeatureSource;
import org.geotools.data.simple.SimpleFeatureIterator;
import org.geotools.factory.CommonFactoryFinder;
import org.geotools.geometry.jts.ReferencedEnvelope;
import org.geotools.map.FeatureLayer;
import org.geotools.map.Layer;
import org.geotools.map.MapContent;
import org.geotools.styling.*;
import org.geotools.swing.JMapFrame;
import org.geotools.swing.data.JFileDataStoreChooser;
import org.opengis.filter.FilterFactory2;
import org.opengis.filter.expression.Expression;
import org.opengis.filter.Filter;
import org.opengis.filter.Or;
import org.opengis.filter.PropertyIsEqualTo;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.Color;
import java.util.stream.Collectors;
import java.util.HashMap;

public class OpenMap {
    private MapContent map;
    private JMapFrame frame;
    private ShapefileDataStore dataStore;
    private SimpleFeatureSource featureSource;
    private ArrayList<Seat> seatProjections;

    public OpenMap() {
        // Set system property for GeoTools
        System.setProperty("org.geotools.referencing.forceXY", "true");
    }

    public void setSeatProjections(ArrayList<Seat> projections) {
        this.seatProjections = projections;
    }

    public void initializeMap() {
        try {
            // Get the shapefile from resources
            URL shapefileUrl = getClass().getClassLoader().getResource("FED_CA_2023_EN.shp");
            if (shapefileUrl == null) {
                System.out.println("Error: Could not find shapefile in resources");
                return;
            }

            // Open the shapefile
            dataStore = new ShapefileDataStore(shapefileUrl);
            dataStore.setCharset(StandardCharsets.UTF_8);
            
            // Get the feature source
            featureSource = dataStore.getFeatureSource();
            
            // Create a map content
            map = new MapContent();
            map.setTitle("Canadian Electoral Districts");
            
            // Create and configure the map frame
            frame = new JMapFrame(map);
            frame.setSize(800, 600);
            frame.enableToolBar(true);
            frame.enableStatusBar(true);
            
            // Get the bounds and set the display area
            ReferencedEnvelope bounds = featureSource.getBounds();
            if (bounds != null) {
                bounds.expandBy(bounds.getWidth() * 0.1, bounds.getHeight() * 0.1);
                frame.getMapPane().setDisplayArea(bounds);
            }
            
        } catch (IOException e) {
            System.err.println("Error initializing map: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void updateMapWithResults() {
        if (seatProjections == null) {
            System.err.println("Error: No seat projections available");
            return;
        }

        // Print shapefile riding names (only once)
        System.out.println("\n=== SHAPEFILE RIDING NAMES ===");
        try (SimpleFeatureIterator features = featureSource.getFeatures().features()) {
            while (features.hasNext()) {
                var feature = features.next();
                String edName = (String) feature.getAttribute("ED_NAMEE");
                System.out.println(edName);
            }
        } catch (IOException e) {
            System.err.println("Error reading shapefile: " + e.getMessage());
        }


        System.out.println("\n=== PROJECTION RIDING NAMES ===");
        for(Seat seat : seatProjections) {
            System.out.println(seat.getSeatName());
        }
        // Create style factory and filter factory
        StyleFactory styleFactory = CommonFactoryFinder.getStyleFactory();
        FilterFactory2 filterFactory = CommonFactoryFinder.getFilterFactory2();
        
        // Create the style
        Style style = styleFactory.createStyle();
        FeatureTypeStyle fts = styleFactory.createFeatureTypeStyle();
        
        // Group ridings by party (normalize names to match shapefile)
        HashMap<Party, List<String>> partyRidings = new HashMap<>();
        for (Seat seat : seatProjections) {
            Party winner = seat.getWinner();
            if (!partyRidings.containsKey(winner)) {
                partyRidings.put(winner, new ArrayList<>());
            }
            partyRidings.get(winner).add(SeatNameMapper.getShapefileName(seat.getSeatName()));
        }

        // Add rules for each party
        for (Party party : Party.values()) {
            if (partyRidings.containsKey(party)) {
                addPartyRule(fts, styleFactory, filterFactory, partyRidings.get(party), party.getColour());
            }
        }

        // Add default red rule for all other ridings
        Rule defaultRule = styleFactory.createRule();
        PolygonSymbolizer defaultSymbolizer = styleFactory.createPolygonSymbolizer();
        defaultSymbolizer.setFill(styleFactory.createFill(filterFactory.literal(Color.RED)));
        defaultSymbolizer.setStroke(styleFactory.createStroke(filterFactory.literal(Color.BLACK), filterFactory.literal(1.0)));
        defaultRule.symbolizers().add(defaultSymbolizer);

        // Create a list of all ridings that have been assigned to parties
        List<String> assignedRidings = new ArrayList<>();
        for (List<String> ridings : partyRidings.values()) {
            assignedRidings.addAll(ridings);
        }

        // Create a filter to exclude already assigned ridings
        List<Filter> excludeFilters = assignedRidings.stream()
            .map(riding -> filterFactory.not(
                filterFactory.equals(
                    filterFactory.property("ED_NAMEE"),
                    filterFactory.literal(riding)
                )
            ))
            .collect(Collectors.toList());

        // Combine all exclude filters with AND
        Filter finalFilter = filterFactory.and(excludeFilters);
        defaultRule.setFilter(finalFilter);
        fts.rules().add(defaultRule);

        // Add the feature type style to the main style
        style.featureTypeStyles().add(fts);
        
        // Create a layer with the feature source and style
        Layer layer = new FeatureLayer(featureSource, style);
        
        // Clear existing layers and add the new one
        map.layers().clear();
        map.addLayer(layer);
        
        // Refresh the display
        frame.getMapPane().repaint();
    }

    private void addPartyRule(FeatureTypeStyle fts, StyleFactory styleFactory, 
                            FilterFactory2 filterFactory, List<String> regions, Color color) {
        if (!regions.isEmpty()) {
            Rule rule = styleFactory.createRule();
            PolygonSymbolizer symbolizer = styleFactory.createPolygonSymbolizer();
            symbolizer.setFill(styleFactory.createFill(filterFactory.literal(color)));
            symbolizer.setStroke(styleFactory.createStroke(filterFactory.literal(Color.BLACK), filterFactory.literal(1.0)));
            rule.symbolizers().add(symbolizer);
            
            List<Filter> filters = regions.stream()
                .map(region -> filterFactory.equals(
                    filterFactory.property("ED_NAMEE"),
                    filterFactory.literal(region)
                ))
                .collect(Collectors.toList());
            
            Filter combinedFilter = filterFactory.or(filters);
            rule.setFilter(combinedFilter);
            fts.rules().add(rule);
        }
    }

    public void show() {
        if (frame != null) {
            frame.setVisible(true);
        }
    }

    public void dispose() {
        if (frame != null) {
            frame.dispose();
            frame = null;
        }
        if (dataStore != null) {
            dataStore.dispose();
            dataStore = null;
        }
        if (map != null) {
            map.dispose();
            map = null;
        }
    }
}
