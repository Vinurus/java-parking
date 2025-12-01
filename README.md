# Java Parking

## Short description

A simple, object-oriented parking management system created as a university project.   
The application demonstrates the basics of Java OOP, interaction between classes, parking mechanics, and system logic.

## Features

- Parking lot management
- Vehicle registration and tracking
- Spot allocation and availability
- Entry and exit mechanics
- Input-based system interaction

## Technologies

- Java
- OOP principles
- Data structures
- Console I/O

## Generator - Vehicle Creation System

The **Generator** class is a sophisticated component that creates diverse, randomized vehicles for testing and simulation purposes. Here's what makes it special:

### Generator Capabilities

- **17 Different Vehicle Types**: Generates Cars, Ambulances, Bikes, Dogs, Motorbikes, Pedestrians, Scooters, and Tanks with various configurations
- **Smart Randomization**: Uses Java's `Supplier<Vehicle>` functional interface with lambda expressions for flexible vehicle instantiation
- **Dynamic Data Generation**:
  - Random car brands (Audi, Opel, Hyundai, Kia, Citroën)
  - Random colors (red, black, orange, silver, white)
  - Random names for owners (Polish names with surnames)
  - Auto-incrementing license plates (DW001, DW002, etc.)
  - Random company assignments for trucks

- **Scenario Testing**: `generateScenario()` method allows you to define custom test scenarios with specific vehicle counts and types
- **Type-Safe Filtering**: `randomOfType()` ensures only valid generators are used for each vehicle class

### Usage Example

```java
Generator generator = new Generator();

// Generate random vehicle
Vehicle randomVehicle = generator.randomUser();

// Generate specific scenario
List<Vehicle> trafficJam = generator.generateScenario(
    Map.of(
        Car.class, 45,
        Bike.class, 33,
        Pedestrian.class, 15
    )
);
```
The Generator demonstrates excellent use of design patterns including Factory Pattern and Stream API for clean, maintainable code! 

## What I learned

- Building system logic step-by-step
- Designing cooperating classes
- Managing state and interactions
- Basic architecture planning

## How to run

1.  Import the project into **IntelliJ**, **VS Code**, or **Eclipse**
2. Run `Main.java`

### Try it online

...

---

Feel free to contact me if you have feedback or suggestions! 
