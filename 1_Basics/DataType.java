public class DataType {
    public static void main(String[] args) {
        // Primitive Data Types
        byte byteValue = 2; // Byte integer || range: -128 to 127 || size : 1 byte
        short shortValue = 5; // Short integer || range: -32,768 to 32,767 || size : 2 bytes
        int intValue = 10; // Integer || range: -2,147,483,648 to 2,147,483,647 || size : 4 bytes
        long longValue = 100L; // Long integer || range: -9,223,372,036,854,775,808 to
                               // 9,223,372,036,854,775,807 || size : 8 bytes
        float floatValue = 15.5f; // Floating-point number || range: approximately ±3.40282347E+38F (6-7
                                  // significant decimal digits) || size : 4 bytes
        double doubleValue = 20.5; // Floating-point number || range: approximately ±1.79769313486231570E+308 (15
                                   // significant decimal digits) || size : 8 bytes
        char charValue = 'A'; // Character || size : 2 bytes
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
