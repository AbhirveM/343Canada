# 343Canada

A statistical election modeler and polling aggregate for Canadian federal elections.

---

## Overview

343Canada is a Java-based tool for modeling Canadian federal election outcomes and aggregating polling data across all 343 electoral districts. The project provides a framework for analyzing public opinion polling, generating seat projections, and simulating election scenarios.

## Features

- **Polling Aggregation** — Combines data from multiple pollsters with configurable weighting schemes
- **Seat Projection Engine** — Converts national and regional polling into riding-level seat estimates
- **Election Simulation** — Monte Carlo-based simulation for outcome probability distributions

## Tech Stack

- **Language:** Java
- **Build System:** Maven
- **IDE Support:** IntelliJ IDEA / NetBeans

## Project Structure

```
343Canada/
├── src/
│   └── main/
│       └── java/           # Source files
├── pom.xml                 # Maven build configuration
├── nbactions.xml           # NetBeans actions config
├── 343Canada.iml           # IntelliJ module file
└── .idea/                  # IntelliJ project settings
```

## Getting Started

### Prerequisites

- JDK 11 or higher
- Apache Maven 3.6+

### Build

```bash
# Clone the repository
git clone https://github.com/AbhirveM/343Canada.git
cd 343Canada

# Build with Maven
mvn clean install
```

### Run

```bash
mvn exec:java
```

Or import the project into your IDE and run from there.

## Configuration

Polling data inputs and model parameters can be configured via the appropriate source files. See the source code documentation for specifics on:

- Poll weighting methodology
- Regional vote swing calculations  
- Seat projection algorithms

## Background

Canada's House of Commons consists of 343 seats, each representing a federal electoral district (riding). This tool aims to translate aggregate polling data into probabilistic seat projections by accounting for regional variations, demographic factors, and historical voting patterns.

## Contributing

Contributions are welcome. Please open an issue to discuss proposed changes before submitting a pull request.

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/your-feature`)
3. Commit your changes (`git commit -m 'Add new feature'`)
4. Push to the branch (`git push origin feature/your-feature`)
5. Open a Pull Request

