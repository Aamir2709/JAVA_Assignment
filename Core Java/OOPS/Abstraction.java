// Abstract class representing a general shape
abstract class Shape {
    // Abstract method for calculating area
    public abstract double calculateArea();
}

// Concrete subclass implementing the abstract method
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Creating an instance of the Circle class
        Circle myCircle = new Circle(5.0);

        // Using abstraction to calculate the area without knowing the specific implementation
        double area = myCircle.calculateArea();
        System.out.println("Area of Circle: " + area);
    }
}
