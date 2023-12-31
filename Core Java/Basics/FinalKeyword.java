public class FinalKeyword {
    // Final variable
    final int MAX_VALUE = 100;

    // Final method
    final void displayMaxValue() {
        System.out.println("Maximum Value: " + MAX_VALUE);
    }

    public static void main(String[] args) {
        FinalKeyword example = new FinalKeyword();
        example.displayMaxValue();

        // Creating an instance of a final class
        FinalSubclass finalSubclass = new FinalSubclass();
        finalSubclass.displayMessage();

        // Using a final method parameter
        int initialAmount = 50;
        final int bonus = 10;
        calculateFinalAmount(initialAmount, bonus);
    }

    // Final class
    final static class FinalSubclass {
        // Final method in a final class
        final void displayMessage() {
            System.out.println("This is a final method in a final class.");
        }
    }

    // Method with a final parameter
    private static void calculateFinalAmount(int amount, final int bonus) {
        int finalAmount = amount + bonus;
        System.out.println("Final Amount after Bonus: " + finalAmount);
    }
}
