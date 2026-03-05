public class DataType {
    public static void main(String[] args) {
        // java has 8 built in Primitive data types
        // Primitive Data Types
        //Integer
        byte byteValue = 2; // Byte integer || size : 1 byte
        short shortValue = 5; // Short integer || size : 2 bytes
        int intValue = 10; // Integer || range: -2,147,483,648 to 2,147,483,647 || size : 4 bytes
        long longValue = 100L; // Long integer || size : 8 bytes

        // Floting point 
        float floatValue = 15.5f; // Floating-point number | size : 4 bytes
        double doubleValue = 20.5; // Floating-point number || size : 8 bytes


        // Character 
        char charValue = 'A'; // Character || size : 2 bytes

        // Boolean
        boolean boolValue = true; // Boolean || size : 1 bit

        // Non-Primitive Data Types
        String stringValue = "Hello"; // String
        int[] intArray = { 1, 2, 3 }; // Array
        // Object objValue = new Object(); // Object

        // e and E represent scientific notation power of 10
        float f1 = 35e3f; // 35 x 10^3
        double d1 = 12E4; // 12 x 10^4
        System.out.println(f1);
        System.out.println(d1);

        // print
        System.out.println("byte value: " + byteValue);
        System.out.println("short value: " + shortValue);
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("char value: " + charValue);
        System.out.println("boolean value: " + boolValue);
        System.out.println("string value: " + stringValue);
        System.out.print("array values: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }

    }
}
