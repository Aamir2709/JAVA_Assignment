// Class with encapsulated data and methods
class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
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

    // Setter method with encapsulation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Creating an instance of the Student class
        Student student = new Student("John", 20);

        // Accessing encapsulated data through getter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        // Using encapsulation to set the age
        student.setAge(21);

        // Displaying the updated age
        System.out.println("Updated Age: " + student.getAge());
    }
}
