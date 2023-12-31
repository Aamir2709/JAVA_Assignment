public class DataTypeExample {
    public static void main(String[] args) {
        // Primitive Data Types
        byte byteVar = 127;        // 8-bit signed integer
        short shortVar = 32767;    // 16-bit signed integer
        int intVar = 2147483647;   // 32-bit signed integer
        long longVar = 9223372036854775807L;  // 64-bit signed integer

        float floatVar = 3.14f;     // 32-bit floating-point
        double doubleVar = 3.14159; // 64-bit floating-point

        char charVar = 'A';         // 16-bit Unicode character

        boolean booleanVar = true;  // true or false

        // Displaying values of primitive data types
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("booleanVar: " + booleanVar);

        // Reference Data Type (String)
        String stringVar = "Hello, Java!";
        System.out.println("stringVar: " + stringVar);

        // Arrays
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.print("intArray: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }

        // Displaying maximum and minimum values of primitive data types
        System.out.println("\n\nMaximum Value of int: " + Integer.MAX_VALUE);
        System.out.println("Minimum Value of int: " + Integer.MIN_VALUE);

        System.out.println("Maximum Value of double: " + Double.MAX_VALUE);
        System.out.println("Minimum Value of double: " + Double.MIN_VALUE);
    }
}
