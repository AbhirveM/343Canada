import java.util.HashMap;

public class SeatNameMapper {
    private static final HashMap<String, String> projectionToShapefile = new HashMap<>();

    static {
        // Complete mapping of all 343 ridings: projection name → exact shapefile ED_NAMEE value
        // Shapefile names contain em-dashes (—) which must match exactly for the GeoTools filter

        // Newfoundland and Labrador
        projectionToShapefile.put("Avalon", "Avalon");
        projectionToShapefile.put("Cape Spear", "Cape Spear");
        projectionToShapefile.put("Central Newfoundland", "Central Newfoundland");
        projectionToShapefile.put("Labrador", "Labrador");
        projectionToShapefile.put("Long Range Mountains", "Long Range Mountains");
        projectionToShapefile.put("St. John's East", "St. John's East");
        projectionToShapefile.put("Terra Nova—The Peninsulas", "Terra Nova—The Peninsulas");

        // Prince Edward Island
        projectionToShapefile.put("Cardigan", "Cardigan");
        projectionToShapefile.put("Charlottetown", "Charlottetown");
        projectionToShapefile.put("Egmont", "Egmont");
        projectionToShapefile.put("Malpeque", "Malpeque");

        // Nova Scotia
        projectionToShapefile.put("Acadie—Annapolis", "Acadie—Annapolis");
        projectionToShapefile.put("Cape Breton—Canso—Antigonish", "Cape Breton—Canso—Antigonish");
        projectionToShapefile.put("Central Nova", "Central Nova");
        projectionToShapefile.put("Cumberland—Colchester", "Cumberland—Colchester");
        projectionToShapefile.put("Dartmouth—Cole Harbour", "Dartmouth—Cole Harbour");
        projectionToShapefile.put("Halifax", "Halifax");
        projectionToShapefile.put("Halifax West", "Halifax West");
        projectionToShapefile.put("Kings—Hants", "Kings—Hants");
        projectionToShapefile.put("Sackville—Bedford—Preston", "Sackville—Bedford—Preston");
        projectionToShapefile.put("South Shore—St. Margarets", "South Shore—St. Margarets");
        projectionToShapefile.put("Sydney—Glace Bay", "Sydney—Glace Bay");

        // New Brunswick
        projectionToShapefile.put("Acadie—Bathurst", "Acadie—Bathurst");
        projectionToShapefile.put("Beauséjour", "Beauséjour");
        projectionToShapefile.put("Fredericton—Oromocto", "Fredericton—Oromocto");
        projectionToShapefile.put("Fundy Royal", "Fundy Royal");
        projectionToShapefile.put("Madawaska—Restigouche", "Madawaska—Restigouche");
        projectionToShapefile.put("Miramichi—Grand Lake", "Miramichi—Grand Lake");
        projectionToShapefile.put("Moncton—Dieppe", "Moncton—Dieppe");
        projectionToShapefile.put("Saint John—Kennebecasis", "Saint John—Kennebecasis");
        projectionToShapefile.put("Saint John—St. Croix", "Saint John—St. Croix");
        projectionToShapefile.put("Tobique—Mactaquac", "Tobique—Mactaquac");

        // Quebec
        projectionToShapefile.put("Abitibi—Baie-James—Nunavik—Eeyou", "Abitibi—Baie-James—Nunavik—Eeyou");
        projectionToShapefile.put("Abitibi—Témiscamingue", "Abitibi—Témiscamingue");
        projectionToShapefile.put("Ahuntsic-Cartierville", "Ahuntsic-Cartierville");
        projectionToShapefile.put("Alfred-Pellan", "Alfred-Pellan");
        projectionToShapefile.put("Argenteuil—La Petite-Nation", "Argenteuil—La Petite-Nation");
        projectionToShapefile.put("Beauce", "Beauce");
        projectionToShapefile.put("Beauharnois—Salaberry—Soulanges—Huntingdon", "Beauharnois—Salaberry—Soulanges—Huntingdon");
        projectionToShapefile.put("Beauport—Limoilou", "Beauport—Limoilou");
        projectionToShapefile.put("Bécancour—Nicolet—Saurel—Alnôbak", "Bécancour—Nicolet—Saurel—Alnôbak");
        projectionToShapefile.put("Bellechasse—Les Etchemins—Lévis", "Bellechasse—Les Etchemins—Lévis");
        projectionToShapefile.put("Beloeil—Chambly", "Beloeil—Chambly");
        projectionToShapefile.put("Berthier—Maskinongé", "Berthier—Maskinongé");
        projectionToShapefile.put("Bourassa", "Bourassa");
        projectionToShapefile.put("Brome—Missisquoi", "Brome—Missisquoi");
        projectionToShapefile.put("Brossard—Saint-Lambert", "Brossard—Saint-Lambert");
        projectionToShapefile.put("Charlesbourg—Haute-Saint-Charles", "Charlesbourg—Haute-Saint-Charles");
        projectionToShapefile.put("Châteauguay—Les Jardins-de-Napierville", "Châteauguay—Les Jardins-de-Napierville");
        projectionToShapefile.put("Chicoutimi—Le Fjord", "Chicoutimi—Le Fjord");
        projectionToShapefile.put("Compton—Stanstead", "Compton—Stanstead");
        // Special case: projection uses hyphens, shapefile uses em-dashes
        projectionToShapefile.put("Côte-du-Sud-Rivière-du-Loup-Kataskomiq-Témiscouata", "Côte-du-Sud—Rivière-du-Loup—Kataskomiq—Témiscouata");
        projectionToShapefile.put("Côte-Nord—Kawawachikamach—Nitassinan", "Côte-Nord—Kawawachikamach—Nitassinan");
        projectionToShapefile.put("Dorval—Lachine—LaSalle", "Dorval—Lachine—LaSalle");
        projectionToShapefile.put("Drummond", "Drummond");
        projectionToShapefile.put("Gaspésie—Les Îles-de-la-Madeleine—Listuguj", "Gaspésie—Les Îles-de-la-Madeleine—Listuguj");
        projectionToShapefile.put("Gatineau", "Gatineau");
        projectionToShapefile.put("Hochelaga—Rosemont-Est", "Hochelaga—Rosemont-Est");
        projectionToShapefile.put("Honoré-Mercier", "Honoré-Mercier");
        projectionToShapefile.put("Hull—Aylmer", "Hull—Aylmer");
        projectionToShapefile.put("Joliette—Manawan", "Joliette—Manawan");
        projectionToShapefile.put("Jonquière", "Jonquière");
        projectionToShapefile.put("La Pointe-de-l'Île", "La Pointe-de-l'Île");
        projectionToShapefile.put("La Prairie—Atateken", "La Prairie—Atateken");
        projectionToShapefile.put("Lac-Saint-Jean", "Lac-Saint-Jean");
        projectionToShapefile.put("Lac-Saint-Louis", "Lac-Saint-Louis");
        projectionToShapefile.put("LaSalle—Émard—Verdun", "LaSalle—Émard—Verdun");
        projectionToShapefile.put("Laurentides—Labelle", "Laurentides—Labelle");
        projectionToShapefile.put("Laurier—Sainte-Marie", "Laurier—Sainte-Marie");
        projectionToShapefile.put("Laval—Les Îles", "Laval—Les Îles");
        projectionToShapefile.put("Les Pays-d'en-Haut", "Les Pays-d'en-Haut");
        projectionToShapefile.put("Lévis—Lotbinière", "Lévis—Lotbinière");
        projectionToShapefile.put("Longueuil—Charles-LeMoyne", "Longueuil—Charles-LeMoyne");
        projectionToShapefile.put("Longueuil—Saint-Hubert", "Longueuil—Saint-Hubert");
        projectionToShapefile.put("Louis-Hébert", "Louis-Hébert");
        projectionToShapefile.put("Louis-Saint-Laurent—Akiawenhrahk", "Louis-Saint-Laurent—Akiawenhrahk");
        projectionToShapefile.put("Marc-Aurèle-Fortin", "Marc-Aurèle-Fortin");
        projectionToShapefile.put("Mégantic—L'Érable—Lotbinière", "Mégantic—L'Érable—Lotbinière");
        projectionToShapefile.put("Mirabel", "Mirabel");
        projectionToShapefile.put("Mount Royal", "Mount Royal");
        projectionToShapefile.put("Mont-Saint-Bruno—L'Acadie", "Mont-Saint-Bruno—L'Acadie");
        projectionToShapefile.put("Montcalm", "Montcalm");
        projectionToShapefile.put("Montmorency—Charlevoix", "Montmorency—Charlevoix");
        projectionToShapefile.put("Notre-Dame-de-Grâce—Westmount", "Notre-Dame-de-Grâce—Westmount");
        projectionToShapefile.put("Outremont", "Outremont");
        projectionToShapefile.put("Papineau", "Papineau");
        projectionToShapefile.put("Pierre-Boucher—Les Patriotes—Verchères", "Pierre-Boucher—Les Patriotes—Verchères");
        projectionToShapefile.put("Pierrefonds—Dollard", "Pierrefonds—Dollard");
        projectionToShapefile.put("Pontiac—Kitigan Zibi", "Pontiac—Kitigan Zibi");
        projectionToShapefile.put("Portneuf—Jacques-Cartier", "Portneuf—Jacques-Cartier");
        projectionToShapefile.put("Québec Centre", "Québec Centre");
        projectionToShapefile.put("Repentigny", "Repentigny");
        projectionToShapefile.put("Richmond—Arthabaska", "Richmond—Arthabaska");
        projectionToShapefile.put("Rimouski—La Matapédia", "Rimouski—La Matapédia");
        projectionToShapefile.put("Rivière-des-Mille-Îles", "Rivière-des-Mille-Îles");
        projectionToShapefile.put("Rivière-du-Nord", "Rivière-du-Nord");
        projectionToShapefile.put("Rosemont—La Petite-Patrie", "Rosemont—La Petite-Patrie");
        projectionToShapefile.put("Saint-Hyacinthe—Bagot—Acton", "Saint-Hyacinthe—Bagot—Acton");
        projectionToShapefile.put("Saint-Jean", "Saint-Jean");
        projectionToShapefile.put("Saint-Laurent", "Saint-Laurent");
        projectionToShapefile.put("Saint-Léonard—Saint-Michel", "Saint-Léonard—Saint-Michel");
        projectionToShapefile.put("Saint-Maurice—Champlain", "Saint-Maurice—Champlain");
        projectionToShapefile.put("Shefford", "Shefford");
        projectionToShapefile.put("Sherbrooke", "Sherbrooke");
        projectionToShapefile.put("Terrebonne", "Terrebonne");
        projectionToShapefile.put("Thérèse-De Blainville", "Thérèse-De Blainville");
        projectionToShapefile.put("Trois-Rivières", "Trois-Rivières");
        projectionToShapefile.put("Vaudreuil", "Vaudreuil");
        projectionToShapefile.put("Ville-Marie—Le Sud-Ouest—Île-des-Soeurs", "Ville-Marie—Le Sud-Ouest—Île-des-Soeurs");
        projectionToShapefile.put("Vimy", "Vimy");

        // Ontario
        projectionToShapefile.put("Ajax", "Ajax");
        projectionToShapefile.put("Algonquin—Renfrew—Pembroke", "Algonquin—Renfrew—Pembroke");
        projectionToShapefile.put("Aurora—Oak Ridges—Richmond Hill", "Aurora—Oak Ridges—Richmond Hill");
        projectionToShapefile.put("Barrie South—Innisfil", "Barrie South—Innisfil");
        projectionToShapefile.put("Barrie—Springwater—Oro-Medonte", "Barrie—Springwater—Oro-Medonte");
        projectionToShapefile.put("Bay of Quinte", "Bay of Quinte");
        projectionToShapefile.put("Beaches—East York", "Beaches—East York");
        projectionToShapefile.put("Bowmanville—Oshawa North", "Bowmanville—Oshawa North");
        projectionToShapefile.put("Brampton Centre", "Brampton Centre");
        projectionToShapefile.put("Brampton—Chinguacousy Park", "Brampton—Chinguacousy Park");
        projectionToShapefile.put("Brampton East", "Brampton East");
        projectionToShapefile.put("Brampton North—Caledon", "Brampton North—Caledon");
        projectionToShapefile.put("Brampton South", "Brampton South");
        projectionToShapefile.put("Brampton West", "Brampton West");
        projectionToShapefile.put("Brantford—Brant South—Six Nations", "Brantford—Brant South—Six Nations");
        projectionToShapefile.put("Bruce—Grey—Owen Sound", "Bruce—Grey—Owen Sound");
        projectionToShapefile.put("Burlington", "Burlington");
        projectionToShapefile.put("Burlington North—Milton West", "Burlington North—Milton West");
        projectionToShapefile.put("Cambridge", "Cambridge");
        projectionToShapefile.put("Carleton", "Carleton");
        projectionToShapefile.put("Chatham-Kent—Leamington", "Chatham-Kent—Leamington");
        projectionToShapefile.put("Davenport", "Davenport");
        projectionToShapefile.put("Don Valley North", "Don Valley North");
        projectionToShapefile.put("Don Valley West", "Don Valley West");
        projectionToShapefile.put("Dufferin—Caledon", "Dufferin—Caledon");
        projectionToShapefile.put("Eglinton—Lawrence", "Eglinton—Lawrence");
        projectionToShapefile.put("Elgin—St. Thomas—London South", "Elgin—St. Thomas—London South");
        projectionToShapefile.put("Essex", "Essex");
        projectionToShapefile.put("Etobicoke Centre", "Etobicoke Centre");
        projectionToShapefile.put("Etobicoke—Lakeshore", "Etobicoke—Lakeshore");
        projectionToShapefile.put("Etobicoke North", "Etobicoke North");
        projectionToShapefile.put("Flamborough—Glanbrook—Brant North", "Flamborough—Glanbrook—Brant North");
        projectionToShapefile.put("Guelph", "Guelph");
        projectionToShapefile.put("Haldimand—Norfolk", "Haldimand—Norfolk");
        projectionToShapefile.put("Haliburton—Kawartha Lakes", "Haliburton—Kawartha Lakes");
        projectionToShapefile.put("Hamilton Centre", "Hamilton Centre");
        projectionToShapefile.put("Hamilton East—Stoney Creek", "Hamilton East—Stoney Creek");
        projectionToShapefile.put("Hamilton Mountain", "Hamilton Mountain");
        projectionToShapefile.put("Hamilton West—Ancaster—Dundas", "Hamilton West—Ancaster—Dundas");
        projectionToShapefile.put("Hastings—Lennox and Addington—Tyendinaga", "Hastings—Lennox and Addington—Tyendinaga");
        projectionToShapefile.put("Humber River—Black Creek", "Humber River—Black Creek");
        projectionToShapefile.put("Huron—Bruce", "Huron—Bruce");
        projectionToShapefile.put("Kanata", "Kanata");
        projectionToShapefile.put("Kapuskasing—Timmins—Mushkegowuk", "Kapuskasing—Timmins—Mushkegowuk");
        projectionToShapefile.put("Kenora—Kiiwetinoong", "Kenora—Kiiwetinoong");
        projectionToShapefile.put("Kingston and the Islands", "Kingston and the Islands");
        projectionToShapefile.put("King—Vaughan", "King—Vaughan");
        projectionToShapefile.put("Kitchener Centre", "Kitchener Centre");
        projectionToShapefile.put("Kitchener—Conestoga", "Kitchener—Conestoga");
        projectionToShapefile.put("Kitchener South—Hespeler", "Kitchener South—Hespeler");
        projectionToShapefile.put("Lanark—Frontenac", "Lanark—Frontenac");
        projectionToShapefile.put("Leeds—Grenville—Thousand Islands—Rideau Lakes", "Leeds—Grenville—Thousand Islands—Rideau Lakes");
        projectionToShapefile.put("London Centre", "London Centre");
        projectionToShapefile.put("London—Fanshawe", "London—Fanshawe");
        projectionToShapefile.put("London West", "London West");
        projectionToShapefile.put("Markham—Stouffville", "Markham—Stouffville");
        projectionToShapefile.put("Markham—Thornhill", "Markham—Thornhill");
        projectionToShapefile.put("Markham—Unionville", "Markham—Unionville");
        projectionToShapefile.put("Middlesex—London", "Middlesex—London");
        projectionToShapefile.put("Milton East—Halton Hills South", "Milton East—Halton Hills South");
        projectionToShapefile.put("Mississauga Centre", "Mississauga Centre");
        projectionToShapefile.put("Mississauga East—Cooksville", "Mississauga East—Cooksville");
        projectionToShapefile.put("Mississauga—Erin Mills", "Mississauga—Erin Mills");
        projectionToShapefile.put("Mississauga—Lakeshore", "Mississauga—Lakeshore");
        projectionToShapefile.put("Mississauga—Malton", "Mississauga—Malton");
        projectionToShapefile.put("Mississauga—Streetsville", "Mississauga—Streetsville");
        projectionToShapefile.put("Nepean", "Nepean");
        projectionToShapefile.put("Newmarket—Aurora", "Newmarket—Aurora");
        projectionToShapefile.put("New Tecumseth—Gwillimbury", "New Tecumseth—Gwillimbury");
        projectionToShapefile.put("Niagara Falls—Niagara-on-the-Lake", "Niagara Falls—Niagara-on-the-Lake");
        projectionToShapefile.put("Niagara South", "Niagara South");
        projectionToShapefile.put("Niagara West", "Niagara West");
        projectionToShapefile.put("Nipissing—Timiskaming", "Nipissing—Timiskaming");
        projectionToShapefile.put("Northumberland—Clarke", "Northumberland—Clarke");
        projectionToShapefile.put("Oakville East", "Oakville East");
        projectionToShapefile.put("Oakville West", "Oakville West");
        projectionToShapefile.put("Orléans", "Orléans");
        projectionToShapefile.put("Oshawa", "Oshawa");
        projectionToShapefile.put("Ottawa Centre", "Ottawa Centre");
        projectionToShapefile.put("Ottawa South", "Ottawa South");
        projectionToShapefile.put("Ottawa—Vanier—Gloucester", "Ottawa—Vanier—Gloucester");
        projectionToShapefile.put("Ottawa West—Nepean", "Ottawa West—Nepean");
        projectionToShapefile.put("Oxford", "Oxford");
        projectionToShapefile.put("Parry Sound—Muskoka", "Parry Sound—Muskoka");
        projectionToShapefile.put("Perth—Wellington", "Perth—Wellington");
        projectionToShapefile.put("Peterborough", "Peterborough");
        projectionToShapefile.put("Pickering—Brooklin", "Pickering—Brooklin");
        projectionToShapefile.put("Prescott—Russell—Cumberland", "Prescott—Russell—Cumberland");
        projectionToShapefile.put("Richmond Hill South", "Richmond Hill South");
        projectionToShapefile.put("Sarnia—Lambton—Bkejwanong", "Sarnia—Lambton—Bkejwanong");
        projectionToShapefile.put("Sault Ste. Marie—Algoma", "Sault Ste. Marie—Algoma");
        projectionToShapefile.put("Scarborough—Agincourt", "Scarborough—Agincourt");
        projectionToShapefile.put("Scarborough Centre—Don Valley East", "Scarborough Centre—Don Valley East");
        projectionToShapefile.put("Scarborough—Guildwood—Rouge Park", "Scarborough—Guildwood—Rouge Park");
        projectionToShapefile.put("Scarborough North", "Scarborough North");
        projectionToShapefile.put("Scarborough Southwest", "Scarborough Southwest");
        projectionToShapefile.put("Scarborough—Woburn", "Scarborough—Woburn");
        projectionToShapefile.put("Simcoe—Grey", "Simcoe—Grey");
        projectionToShapefile.put("Simcoe North", "Simcoe North");
        projectionToShapefile.put("Spadina—Harbourfront", "Spadina—Harbourfront");
        projectionToShapefile.put("St. Catharines", "St. Catharines");
        projectionToShapefile.put("Stormont—Dundas—Glengarry", "Stormont—Dundas—Glengarry");
        projectionToShapefile.put("Sudbury", "Sudbury");
        projectionToShapefile.put("Sudbury East—Manitoulin—Nickel Belt", "Sudbury East—Manitoulin—Nickel Belt");
        projectionToShapefile.put("Taiaiako'n—Parkdale—High Park", "Taiaiako'n—Parkdale—High Park");
        projectionToShapefile.put("Thornhill", "Thornhill");
        projectionToShapefile.put("Thunder Bay—Rainy River", "Thunder Bay—Rainy River");
        projectionToShapefile.put("Thunder Bay—Superior North", "Thunder Bay—Superior North");
        projectionToShapefile.put("Toronto Centre", "Toronto Centre");
        projectionToShapefile.put("Toronto—Danforth", "Toronto—Danforth");
        projectionToShapefile.put("Toronto—St. Paul's", "Toronto—St. Paul's");
        projectionToShapefile.put("University—Rosedale", "University—Rosedale");
        projectionToShapefile.put("Vaughan—Woodbridge", "Vaughan—Woodbridge");
        projectionToShapefile.put("Waterloo", "Waterloo");
        projectionToShapefile.put("Wellington—Halton Hills North", "Wellington—Halton Hills North");
        projectionToShapefile.put("Whitby", "Whitby");
        projectionToShapefile.put("Willowdale", "Willowdale");
        projectionToShapefile.put("Windsor—Tecumseh—Lakeshore", "Windsor—Tecumseh—Lakeshore");
        projectionToShapefile.put("Windsor West", "Windsor West");
        projectionToShapefile.put("York Centre", "York Centre");
        projectionToShapefile.put("York—Durham", "York—Durham");
        projectionToShapefile.put("York South—Weston—Etobicoke", "York South—Weston—Etobicoke");

        // Manitoba
        projectionToShapefile.put("Brandon—Souris", "Brandon—Souris");
        projectionToShapefile.put("Churchill—Keewatinook Aski", "Churchill—Keewatinook Aski");
        projectionToShapefile.put("Elmwood—Transcona", "Elmwood—Transcona");
        projectionToShapefile.put("Kildonan—St. Paul", "Kildonan—St. Paul");
        projectionToShapefile.put("Portage—Lisgar", "Portage—Lisgar");
        projectionToShapefile.put("Provencher", "Provencher");
        projectionToShapefile.put("Riding Mountain", "Riding Mountain");
        projectionToShapefile.put("St. Boniface—St. Vital", "St. Boniface—St. Vital");
        projectionToShapefile.put("Selkirk—Interlake—Eastman", "Selkirk—Interlake—Eastman");
        projectionToShapefile.put("Winnipeg Centre", "Winnipeg Centre");
        projectionToShapefile.put("Winnipeg North", "Winnipeg North");
        projectionToShapefile.put("Winnipeg South", "Winnipeg South");
        projectionToShapefile.put("Winnipeg South Centre", "Winnipeg South Centre");
        projectionToShapefile.put("Winnipeg West", "Winnipeg West");

        // Saskatchewan
        projectionToShapefile.put("Battlefords—Lloydminster—Meadow Lake", "Battlefords—Lloydminster—Meadow Lake");
        projectionToShapefile.put("Carlton Trail—Eagle Creek", "Carlton Trail—Eagle Creek");
        projectionToShapefile.put("Desnethé—Missinippi—Churchill River", "Desnethé—Missinippi—Churchill River");
        projectionToShapefile.put("Moose Jaw—Lake Centre—Lanigan", "Moose Jaw—Lake Centre—Lanigan");
        projectionToShapefile.put("Prince Albert", "Prince Albert");
        projectionToShapefile.put("Regina—Lewvan", "Regina—Lewvan");
        projectionToShapefile.put("Regina—Qu'Appelle", "Regina—Qu'Appelle");
        projectionToShapefile.put("Regina—Wascana", "Regina—Wascana");
        projectionToShapefile.put("Saskatoon South", "Saskatoon South");
        projectionToShapefile.put("Saskatoon—University", "Saskatoon—University");
        projectionToShapefile.put("Saskatoon West", "Saskatoon West");
        projectionToShapefile.put("Souris—Moose Mountain", "Souris—Moose Mountain");
        projectionToShapefile.put("Swift Current—Grasslands—Kindersley", "Swift Current—Grasslands—Kindersley");
        projectionToShapefile.put("Yorkton—Melville", "Yorkton—Melville");

        // Alberta
        projectionToShapefile.put("Airdrie—Cochrane", "Airdrie—Cochrane");
        projectionToShapefile.put("Battle River—Crowfoot", "Battle River—Crowfoot");
        projectionToShapefile.put("Bow River", "Bow River");
        projectionToShapefile.put("Calgary Centre", "Calgary Centre");
        projectionToShapefile.put("Calgary Confederation", "Calgary Confederation");
        projectionToShapefile.put("Calgary Crowfoot", "Calgary Crowfoot");
        projectionToShapefile.put("Calgary East", "Calgary East");
        projectionToShapefile.put("Calgary Heritage", "Calgary Heritage");
        projectionToShapefile.put("Calgary McKnight", "Calgary McKnight");
        projectionToShapefile.put("Calgary Midnapore", "Calgary Midnapore");
        projectionToShapefile.put("Calgary Nose Hill", "Calgary Nose Hill");
        projectionToShapefile.put("Calgary Shepard", "Calgary Shepard");
        projectionToShapefile.put("Calgary Signal Hill", "Calgary Signal Hill");
        projectionToShapefile.put("Calgary Skyview", "Calgary Skyview");
        projectionToShapefile.put("Edmonton Centre", "Edmonton Centre");
        projectionToShapefile.put("Edmonton Gateway", "Edmonton Gateway");
        projectionToShapefile.put("Edmonton Griesbach", "Edmonton Griesbach");
        projectionToShapefile.put("Edmonton Manning", "Edmonton Manning");
        projectionToShapefile.put("Edmonton Northwest", "Edmonton Northwest");
        projectionToShapefile.put("Edmonton Riverbend", "Edmonton Riverbend");
        projectionToShapefile.put("Edmonton Southeast", "Edmonton Southeast");
        projectionToShapefile.put("Edmonton Strathcona", "Edmonton Strathcona");
        projectionToShapefile.put("Edmonton West", "Edmonton West");
        projectionToShapefile.put("Foothills", "Foothills");
        projectionToShapefile.put("Fort McMurray—Cold Lake", "Fort McMurray—Cold Lake");
        projectionToShapefile.put("Grande Prairie", "Grande Prairie");
        projectionToShapefile.put("Lakeland", "Lakeland");
        projectionToShapefile.put("Leduc—Wetaskiwin", "Leduc—Wetaskiwin");
        projectionToShapefile.put("Lethbridge", "Lethbridge");
        projectionToShapefile.put("Medicine Hat—Cardston—Warner", "Medicine Hat—Cardston—Warner");
        projectionToShapefile.put("Parkland", "Parkland");
        projectionToShapefile.put("Peace River—Westlock", "Peace River—Westlock");
        projectionToShapefile.put("Ponoka—Didsbury", "Ponoka—Didsbury");
        projectionToShapefile.put("Red Deer", "Red Deer");
        projectionToShapefile.put("Sherwood Park—Fort Saskatchewan", "Sherwood Park—Fort Saskatchewan");
        projectionToShapefile.put("St. Albert—Sturgeon River", "St. Albert—Sturgeon River");
        projectionToShapefile.put("Yellowhead", "Yellowhead");

        // British Columbia
        projectionToShapefile.put("Abbotsford—South Langley", "Abbotsford—South Langley");
        projectionToShapefile.put("Burnaby Central", "Burnaby Central");
        projectionToShapefile.put("Burnaby North—Seymour", "Burnaby North—Seymour");
        projectionToShapefile.put("Cariboo—Prince George", "Cariboo—Prince George");
        projectionToShapefile.put("Chilliwack—Hope", "Chilliwack—Hope");
        projectionToShapefile.put("Cloverdale—Langley City", "Cloverdale—Langley City");
        projectionToShapefile.put("Columbia—Kootenay—Southern Rockies", "Columbia—Kootenay—Southern Rockies");
        projectionToShapefile.put("Coquitlam—Port Coquitlam", "Coquitlam—Port Coquitlam");
        projectionToShapefile.put("Courtenay—Alberni", "Courtenay—Alberni");
        projectionToShapefile.put("Cowichan—Malahat—Langford", "Cowichan—Malahat—Langford");
        projectionToShapefile.put("Delta", "Delta");
        projectionToShapefile.put("Esquimalt—Saanich—Sooke", "Esquimalt—Saanich—Sooke");
        projectionToShapefile.put("Fleetwood—Port Kells", "Fleetwood—Port Kells");
        projectionToShapefile.put("Kamloops—Shuswap—Central Rockies", "Kamloops—Shuswap—Central Rockies");
        projectionToShapefile.put("Kamloops—Thompson—Nicola", "Kamloops—Thompson—Nicola");
        projectionToShapefile.put("Kelowna", "Kelowna");
        projectionToShapefile.put("Langley Township—Fraser Heights", "Langley Township—Fraser Heights");
        projectionToShapefile.put("Mission—Matsqui—Abbotsford", "Mission—Matsqui—Abbotsford");
        projectionToShapefile.put("Nanaimo—Ladysmith", "Nanaimo—Ladysmith");
        projectionToShapefile.put("New Westminster—Burnaby—Maillardville", "New Westminster—Burnaby—Maillardville");
        projectionToShapefile.put("North Island—Powell River", "North Island—Powell River");
        projectionToShapefile.put("North Vancouver—Capilano", "North Vancouver—Capilano");
        projectionToShapefile.put("Okanagan Lake West—South Kelowna", "Okanagan Lake West—South Kelowna");
        projectionToShapefile.put("Pitt Meadows—Maple Ridge", "Pitt Meadows—Maple Ridge");
        projectionToShapefile.put("Port Moody—Coquitlam", "Port Moody—Coquitlam");
        projectionToShapefile.put("Prince George—Peace River—Northern Rockies", "Prince George—Peace River—Northern Rockies");
        projectionToShapefile.put("Richmond Centre—Marpole", "Richmond Centre—Marpole");
        projectionToShapefile.put("Richmond East—Steveston", "Richmond East—Steveston");
        projectionToShapefile.put("Saanich—Gulf Islands", "Saanich—Gulf Islands");
        projectionToShapefile.put("Similkameen—South Okanagan—West Kootenay", "Similkameen—South Okanagan—West Kootenay");
        projectionToShapefile.put("Skeena—Bulkley Valley", "Skeena—Bulkley Valley");
        projectionToShapefile.put("South Surrey—White Rock", "South Surrey—White Rock");
        projectionToShapefile.put("Surrey Centre", "Surrey Centre");
        projectionToShapefile.put("Surrey Newton", "Surrey Newton");
        projectionToShapefile.put("Vancouver Centre", "Vancouver Centre");
        projectionToShapefile.put("Vancouver East", "Vancouver East");
        projectionToShapefile.put("Vancouver Fraserview—South Burnaby", "Vancouver Fraserview—South Burnaby");
        projectionToShapefile.put("Vancouver Granville", "Vancouver Granville");
        projectionToShapefile.put("Vancouver Kingsway", "Vancouver Kingsway");
        projectionToShapefile.put("Vancouver Quadra", "Vancouver Quadra");
        projectionToShapefile.put("Vernon—Lake Country—Monashee", "Vernon—Lake Country—Monashee");
        projectionToShapefile.put("Victoria", "Victoria");
        projectionToShapefile.put("West Vancouver—Sunshine Coast—Sea to Sky Country", "West Vancouver—Sunshine Coast—Sea to Sky Country");

        // Territories
        projectionToShapefile.put("Yukon", "Yukon");
        projectionToShapefile.put("Northwest Territories", "Northwest Territories");
        projectionToShapefile.put("Nunavut", "Nunavut");
    }

    /**
     * Converts a projection seat name to its exact shapefile ED_NAMEE equivalent.
     * @param projectionName The seat name from Seats.json
     * @return The exact shapefile ED_NAMEE value for matching
     */
    public static String getShapefileName(String projectionName) {
        return projectionToShapefile.getOrDefault(projectionName, projectionName);
    }
}
