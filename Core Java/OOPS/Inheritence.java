// Parent class (Superclass)
class Animal {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }
}

// Child class (Subclass) inheriting from Animal
class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        // Call the superclass constructor using "super"
        super(name, age);
        this.breed = breed;
    }

    // Getter method
    public String getBreed() {
        return breed;
    }

    // Overriding displayInfo method to include breed information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Breed: " + breed);
    }
}

public class Inheritence {
    public static void main(String[] args) {
        // Creating an instance of the Dog class
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");

        // Accessing methods from the superclass (Animal)
        System.out.println("Name: " + myDog.getName());
        System.out.println("Age: " + myDog.getAge());

        // Accessing methods from the subclass (Dog)
        System.out.println("Breed: " + myDog.getBreed());

        // Using overridden method in the Dog class
        myDog.displayInfo();
    }
}
