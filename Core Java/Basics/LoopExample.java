public class LoopExample {
    public static void main(String[] args) {
        // For loop
        System.out.println("For Loop Example:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        // While loop
        System.out.println("\nWhile Loop Example:");
        int count = 0;
        while (count < 3) {
            System.out.print("Count: " + count + " ");
            count++;
        }

        // Do-While loop
        System.out.println("\nDo-While Loop Example:");
        int num = 5;
        do {
            System.out.print(num + " ");
            num--;
        } while (num > 0);
    }
}
