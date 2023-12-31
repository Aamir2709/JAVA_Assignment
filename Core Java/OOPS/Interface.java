// Interface defining the contract for shapes
interface Shape {
    double calculateArea();
}

// Classes implementing the Shape interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

public class Interface {
    public static void main(String[] args) {
        // Creating instances of classes implementing the Shape interface
        Circle myCircle = new Circle(5.0);
        Square mySquare = new Square(4.0);

        // Using the interface to calculate the area of different shapes
        System.out.println("Area of Circle: " + myCircle.calculateArea());
        System.out.println("Area of Square: " + mySquare.calculateArea());
    }
}
