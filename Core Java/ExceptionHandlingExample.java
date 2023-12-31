// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}


public class ExceptionHandlingExample {

    // Method that throws a checked exception
    public static void methodWithCheckedException() throws CustomException {
        throw new CustomException("This is a custom checked exception.");
    }

    // Method that throws an unchecked exception
    public static void methodWithUncheckedException() {
        throw new ArithmeticException("This is an arithmetic exception.");
    }

    public static void main(String[] args) {
        try {
            // Example of catching a checked exception
            methodWithCheckedException();
        } catch (CustomException e) {
            System.out.println("Caught Checked Exception: " + e.getMessage());
        }

        try {
            // Example of catching an unchecked exception
            methodWithUncheckedException();
        } catch (ArithmeticException e) {
            System.out.println("Caught Unchecked Exception: " + e.getMessage());
        }

        // Example of handling multiple exceptions using a common base class
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // Example of using throw to manually throw an exception
        try {
            validateAge(15);
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }

    // Method that may throw an ArithmeticException
    private static int divide(int a, int b) {
        return a / b;
    }

    // Method that uses 'throw' to throw a custom exception
    private static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or older.");
        }
        System.out.println("Valid age: " + age);
    }
}
