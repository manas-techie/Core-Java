/**
 * JAVA FUNDAMENTALS - Complete Notes with Examples
 * Topics: Variables, Data Types, Operators, Control Flow, Loops
 */

public class JavaFundamentalsNotes {

    public static void main(String[] args) {

        // ============================================
        // 1. VARIABLES IN JAVA
        // ============================================
        // Variables store data that can be used and modified

        int age = 25; // Integer variable
        String name = "John"; // String variable
        double salary = 50000.50; // Decimal variable
        boolean isStudent = true; // Boolean variable

        // ============================================
        // 2. DATA TYPES IN JAVA
        // ============================================

        // PRIMITIVE DATA TYPES (8 types)
        byte byteVar = 127; // 8-bit: -128 to 127
        short shortVar = 32000; // 16-bit: -32,768 to 32,767
        int intVar = 2147483647; // 32-bit: most commonly used for integers
        long longVar = 9223372036854775807L; // 64-bit: use 'L' suffix

        float floatVar = 3.14f; // 32-bit decimal: use 'f' suffix
        double doubleVar = 3.14159265; // 64-bit decimal: most commonly used

        char charVar = 'A'; // 16-bit: single character
        boolean boolVar = false; // true or false only

        // NON-PRIMITIVE DATA TYPES
        String text = "Hello World"; // Sequence of characters
        int[] numbers = { 1, 2, 3, 4, 5 }; // Array

        // ============================================
        // 3. LITERALS
        // ============================================
        // Literals are fixed values assigned to variables

        int decimal = 100; // Decimal literal
        int binary = 0b1010; // Binary literal (10 in decimal)
        int octal = 0144; // Octal literal (100 in decimal)
        int hexa = 0x64; // Hexadecimal literal (100 in decimal)

        double scientific = 5.5e2; // Scientific notation (5.5 * 10^2 = 550)

        char letter = 'A'; // Character literal
        String message = "Hello"; // String literal

        boolean truthValue = true; // Boolean literal

        // ============================================
        // 4. TYPE CONVERSION
        // ============================================

        // IMPLICIT CONVERSION (Widening) - Automatic
        // byte -> short -> int -> long -> float -> double
        int num1 = 100;
        long num2 = num1; // int to long (automatic)
        double num3 = num1; // int to double (automatic)

        // EXPLICIT CONVERSION (Narrowing) - Manual Casting
        double d = 9.7;
        int i = (int) d; // Converts 9.7 to 9 (loses decimal)

        // String to Number Conversion
        String str = "123";
        int converted = Integer.parseInt(str); // String to int
        double dbl = Double.parseDouble("45.6"); // String to double

        // Number to String Conversion
        int number = 100;
        String numString = String.valueOf(number); // int to String

        // ============================================
        // 5. ASSIGNMENT OPERATORS
        // ============================================

        int x = 10; // Simple assignment

        x += 5; // x = x + 5 → 15 // Add and assign
        x -= 3; // x = x - 3 → 12 // Subtract and assign
        x *= 2; // x = x * 2 → 24 // Multiply and assign
        x /= 4; // x = x / 4 → 6 // Divide and assign
        x %= 4; // x = x % 4 → 2 // Modulus and assign

        // ============================================
        // 6. RELATIONAL OPERATORS
        // ============================================
        // Used for comparison, returns boolean (true/false)

        int a = 10, b = 20;

        boolean result1 = (a == b); // Equal to → false
        boolean result2 = (a != b); // Not equal to → true
        boolean result3 = (a > b); // Greater than → false
        boolean result4 = (a < b); // Less than → true
        boolean result5 = (a >= b); // Greater than or equal → false
        boolean result6 = (a <= b); // Less than or equal → true

        // ============================================
        // 7. LOGICAL OPERATORS
        // ============================================
        // Used to combine boolean expressions

        boolean condition1 = true;
        boolean condition2 = false;

        boolean and = condition1 && condition2; // AND → false (both must be true)
        boolean or = condition1 || condition2; // OR → true (at least one true)
        boolean not = !condition1; // NOT → false (reverses value)

        // Short-circuit evaluation
        // && stops if first is false
        // || stops if first is true

        // ============================================
        // 8. IF-ELSE STATEMENT
        // ============================================

        int score = 75;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // ============================================
        // 9. TERNARY OPERATOR
        // ============================================
        // Shorthand for if-else: condition ? valueIfTrue : valueIfFalse

        int marks = 85;
        String result = (marks >= 60) ? "Pass" : "Fail";
        System.out.println(result); // Output: Pass

        // Nested ternary (use sparingly)
        int num = 0;
        String type = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

        // ============================================
        // 10. SWITCH STATEMENT
        // ============================================

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // Break prevents fall-through
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Enhanced Switch (Java 12+)
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Other day";
        };

        // ============================================
        // 11. WHILE LOOP
        // ============================================
        // Executes while condition is true (check condition FIRST)

        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++; // Increment to avoid infinite loop
        }
        // Output: 1, 2, 3, 4, 5

        // ============================================
        // 12. DO-WHILE LOOP
        // ============================================
        // Executes at least ONCE, then checks condition

        int counter = 1;
        do {
            System.out.println("Counter: " + counter);
            counter++;
        } while (counter <= 5);
        // Output: 1, 2, 3, 4, 5

        // Key difference: runs once even if condition is false
        int test = 10;
        do {
            System.out.println("Runs once");
        } while (test < 5); // Condition false, but still executed once

        // ============================================
        // 13. FOR LOOP
        // ============================================
        // Best when you know the number of iterations

        // Syntax: for (initialization; condition; update)
        for (int j = 1; j <= 5; j++) {
            System.out.println("Iteration: " + j);
        }

        // Loop through array
        int[] arr = { 10, 20, 30, 40, 50 };
        for (int k = 0; k < arr.length; k++) {
            System.out.println("Element: " + arr[k]);
        }

        // Enhanced for loop (for-each) - easier for arrays/collections
        for (int element : arr) {
            System.out.println("Value: " + element);
        }

        // Nested loop example
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Output:
        // * * *
        // * * *
        // * * *

        // ============================================
        // 14. WHICH LOOP TO USE?
        // ============================================

        /*
         * FOR LOOP:
         * - Use when you know the exact number of iterations
         * - Best for iterating through arrays/collections
         * - Example: Print numbers 1 to 100
         */

        /*
         * WHILE LOOP:
         * - Use when iterations depend on a condition
         * - Condition checked BEFORE execution
         * - Example: Read input until user enters "quit"
         */

        /*
         * DO-WHILE LOOP:
         * - Use when loop must execute AT LEAST ONCE
         * - Condition checked AFTER execution
         * - Example: Menu-driven programs (show menu at least once)
         */

        /*
         * ENHANCED FOR LOOP (for-each):
         * - Use when you need to iterate through all elements
         * - Can't modify index or skip elements
         * - Example: Print all elements in an array
         */

        // ============================================
        // LOOP CONTROL STATEMENTS
        // ============================================

        // BREAK - Exit loop immediately
        for (int m = 1; m <= 10; m++) {
            if (m == 5) {
                break; // Loop stops at 5
            }
            System.out.println(m);
        }

        // CONTINUE - Skip current iteration
        for (int n = 1; n <= 5; n++) {
            if (n == 3) {
                continue; // Skip printing 3
            }
            System.out.println(n);
        }
        // Output: 1, 2, 4, 5 (3 is skipped)

    }
}

/*
 * ============================================
 * QUICK REFERENCE SUMMARY
 * ============================================
 * 
 * DATA TYPES:
 * - int, double, char, boolean (most common)
 * - String, Arrays (reference types)
 * 
 * OPERATORS:
 * - Arithmetic: +, -, *, /, %
 * - Relational: ==, !=, >, <, >=, <=
 * - Logical: &&, ||, !
 * - Assignment: =, +=, -=, *=, /=, %=
 * 
 * CONTROL FLOW:
 * - if-else, if-else if-else
 * - ternary: condition ? true : false
 * - switch-case
 * 
 * LOOPS:
 * - for: known iterations
 * - while: condition-based, check first
 * - do-while: runs at least once
 * - for-each: iterate collections
 * 
 * LOOP CONTROL:
 * - break: exit loop
 * - continue: skip iteration
 */