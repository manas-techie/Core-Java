public class Variable {
    public static void main(String[] args) {
        // Declare a variable
        int number;

        // Assign a value to the variable
        number = 10;

        // Print the value of the variable
        System.out.println("The value of number is: " + number);

        // final
        // when a variable is declared as final, its value cannot be changed once assigned
        // final int CONSTANT_NUMBER;
        // CONSTANT_NUMBER = 100;
        // OR you can declare and assign in one line:
    
        final int CONSTANT_NUMBER = 100;
        // CONSTANT_NUMBER = 200; // This will cause a compilation error
        System.out.println("The value of CONSTANT_NUMBER is: " + CONSTANT_NUMBER);

        // Variable is a container that holds data values.

        // Naming conventions for variables:
        // PascalCase is used for class and interface names
        // camelCase is used for variable and method names
        // UPPERCASE_SNAKE_CASE is used for constants

    }
}
