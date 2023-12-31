// Superclass
class Shape {
    // Method to calculate area
    public double calculateArea() {
        return 0.0;
    }
}

// Subclass overriding the calculateArea method
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding the calculateArea method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass overriding the calculateArea method
class Square extends Shape {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Overriding the calculateArea method
    @Override
    public double calculateArea() {
        return side * side;
    }
}

public class Overriding {
    public static void main(String[] args) {
        // Creating instances of the subclasses
        Circle myCircle = new Circle(5.0);
        Square mySquare = new Square(4.0);

        // Calculating and displaying areas
        System.out.println("Area of Circle: " + myCircle.calculateArea());
        System.out.println("Area of Square: " + mySquare.calculateArea());
    }
}
