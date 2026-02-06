public class ClassBasic {
    public static void main(String[] args) {
        // object
        Calculator c1 = new Calculator();
        // arguments passed to the method
        int result = c1.add(2, 4);
        System.out.println(result);

        Computer comp1 = new Computer();
        comp1.brand = "Dell";
        comp1.model = "XPS 15";
        comp1.start();

        // its not possible to print the object directly, it will print the memory
        // address of the object
        System.out.println(comp1);

        System.out.println(comp1.brand);

        // this is called method overloading, we have two methods with the same name but
        // different parameters
        int sum = c1.add(1, 2, 3, 4, 5);
        System.out.println(sum);
    }
}

// Object Oriented Language
// Object - Properties and Behaviors

// class
class Calculator {
    int a;

    // parameters - variables declared in the method signature
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // method overloading - same method name but different parameters
    public int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // method overloading - same method name but different parameters with different data types
    public double add(double num1, double num2) {
        return num1 + num2;
    }
}

class Computer {
    // Properties
    String brand;
    String model;

    // Behaviors
    // methods
    public void start() {
        System.out.println("Computer is starting...");
    }

    public void shutdown() {
        System.out.println("Computer is shutting down...");
    }
}
