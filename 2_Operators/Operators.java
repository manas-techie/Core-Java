public class Operators {
    public static void main(String[] args) {
        // Arithmetic operators (+, -, *, /, %)


        // Relational/Comparison operators (==, !=, >, <, >=, <=)


        // Logical operators (&&, ||, !)


        // Bitwise operators (&, |, ^, ~, <<, >>, >>>) 
        int x  = 5; //101
        int y = 3; //011

        // bitwise and
        System.out.println(x & y);

        // bitwise or
        System.out.println(x | y);

        // bitwise xor
        System.out.println(x ^ y);

        // bitwise not
        System.out.println(~x);

        // left sift
        // Shifts bits to the left by 1 position. Equivalent to multiplying by 2^1.
        // 0101 << 1 = 1010 (Returns 10 in decimal)
        System.out.println(x << 1);

        // signed Right Shift (>>)
        // Shifts bits to the right, preserving the sign bit (keeps negatives negative).
        // Equivalent to dividing by 2^1.
        System.out.println(x >> 1);


        // unsigned right sift
        // Shifts right but forces the new leftmost bits to be 0, regardless of sign.
        // This turns negative numbers into very large positive numbers
        System.out.println(x >>> 1);


        // Assignment operators (=, +=, -=, etc.)


        // Ternary operator (? :)
        // condition ? value_if_true : value_if_false;

        int a = 10, b = 20;
        int max = (a > b) ? a: b;
        System.out.println(max);

        // instanceof operator
        // This is an object-oriented operator used to check whether an object is an instance of a specific class, subclass, or interface. It returns true or false.

        String str = "Manas";
        System.out.println(str instanceof String);

    }
    
}
