public class Student {
    // Constants
    private static final int MAX_SUBJECTS = 5;

    // Instance variables
    private String name;
    private int age;
    private int[] subjectGrades;

    // Constructor
    public Student(String name, int age, int[] subjectGrades) {
        this.name = name;
        this.age = age;
        
        // Ensure subjectGrades array length does not exceed MAX_SUBJECTS
        if (subjectGrades.length > MAX_SUBJECTS) {
            throw new IllegalArgumentException("Number of subjects exceeds the maximum limit.");
        }

        // Copy the provided array to avoid external modification
        this.subjectGrades = new int[MAX_SUBJECTS];
        System.arraycopy(subjectGrades, 0, this.subjectGrades, 0, subjectGrades.length);
    }

    // Method to calculate the average grade
    public double calculateAverageGrade() {
        int sum = 0;
        for (int grade : subjectGrades) {
            sum += grade;
        }
        return (double) sum / MAX_SUBJECTS;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int[] getSubjectGrades() {
        // Return a copy to avoid external modification
        int[] copyOfGrades = new int[MAX_SUBJECTS];
        System.arraycopy(subjectGrades, 0, copyOfGrades, 0, MAX_SUBJECTS);
        return copyOfGrades;
    }

    public static void main(String[] args) {
        // Creating an instance of the Student class
        int[] grades = {90, 85, 92, 88, 95};
        Student student = new Student("Alice", 20, grades);

        // Accessing information using getter methods
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        // Displaying subject grades using a loop
        System.out.println("Subject Grades:");
        for (int i = 0; i < student.getSubjectGrades().length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + student.getSubjectGrades()[i]);
        }

        // Calculating and displaying the average grade
        System.out.println("Average Grade: " + student.calculateAverageGrade());
    }
}
