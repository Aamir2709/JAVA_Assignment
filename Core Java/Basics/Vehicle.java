// Define a class named 'Car'
class Car {
    // State (attributes/fields)
    String brand;
    String model;
    int year;
    boolean isEngineRunning;

    // Constructor to initialize the state of the object
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isEngineRunning = false; // Initially, the engine is not running
    }

    // Method to start the car's engine
    public void startEngine() {
        if (!isEngineRunning) {
            System.out.println("Starting the " + brand + " " + model + "'s engine...");
            isEngineRunning = true;
        } else {
            System.out.println("The engine is already running.");
        }
    }

    // Method to stop the car's engine
    public void stopEngine() {
        if (isEngineRunning) {
            System.out.println("Stopping the " + brand + " " + model + "'s engine...");
            isEngineRunning = false;
        } else {
            System.out.println("The engine is already stopped.");
        }
    }

    // Method to display the current state of the car
    public void displayCarInfo() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine Status: " + (isEngineRunning ? "Running" : "Stopped"));
        System.out.println();
    }
}

public class Vehicle {
    public static void main(String[] args) {
        // Creating objects (instances) of the 'Car' class
        Car myCar = new Car("Toyota", "Camry", 2022);
        Car anotherCar = new Car("Honda", "Civic", 2021);

        // Accessing and modifying the state of objects
        myCar.displayCarInfo();
        anotherCar.displayCarInfo();

        myCar.startEngine();
        myCar.displayCarInfo();

        anotherCar.stopEngine();
        anotherCar.displayCarInfo();
    }
}
