// ==================== IMPORT STATEMENTS ====================
/*
 * WHAT ARE IMPORTS?
 * - Import statements allow you to use classes from other packages
 * - Without imports, you'd need to use fully qualified names (e.g., java.util.ArrayList)
 * - Import statements must be after package declaration and before class declaration
 * 
 * TYPES OF IMPORTS:
 * 1. Specific import: import java.util.ArrayList;
 * 2. Wildcard import: import java.util.*;
 * 3. Static import: import static java.lang.Math.PI;
 */

// Import 1: ArrayList - Used for creating dynamic lists of objects
// Location used: Line ~490 (ARRAYLIST OF OBJECTS section)
// Why: To store multiple Employee objects in a resizable array
import java.util.ArrayList;

// Import 2: Objects - Utility class for null-safe operations
// Location used: Line ~850 (Product class equals() method)
//                Line ~858 (Product class hashCode() method)
// Why: For null-safe comparison (Objects.equals) and hash code generation (Objects.hash)
import java.util.Objects;

// Import 3: Iterator - For iterating through collections with safe removal
// Location used: Not directly used in current code but included for demonstration
// import java.util.Iterator;

// Import 4: ListIterator - For bidirectional iteration
// Location used: Not directly used in current code but included for demonstration
// import java.util.ListIterator;

/*
 * ALTERNATIVE: You could use wildcard import instead
 * import java.util.*;
 * 
 * PROS of wildcard:
 * - Less code, imports everything from package
 * 
 * CONS of wildcard:
 * - Not clear which classes are used
 * - Can cause naming conflicts
 * - Not recommended in production code
 * 
 * BEST PRACTICE: Use specific imports for clarity
 */

public class ClassAndObjectGuide {
    
    public static void main(String[] args) {
        
        // ==================== WHAT ARE CLASSES AND OBJECTS? ====================
        /*
         * CLASS: Blueprint/template for creating objects
         *        Defines properties (variables) and behaviors (methods)
         * 
         * OBJECT: Instance of a class
         *         Real entity with state and behavior
         * 
         * Example: Class = "Car" blueprint
         *          Object = Specific car (Honda Civic, Toyota Camry)
         */
        
        
        // ==================== CREATING FIRST CLASS AND OBJECT ====================
        
        // Creating object using 'new' keyword
        Student student1 = new Student();
        
        // Accessing and setting instance variables
        student1.name = "Alice";
        student1.age = 20;
        student1.grade = 85.5;
        
        // Calling methods
        student1.displayInfo();
        student1.study();
        
        // Creating multiple objects
        Student student2 = new Student();
        student2.name = "Bob";
        student2.age = 22;
        student2.grade = 90.0;
        
        student2.displayInfo();
        
        System.out.println("\n=================================\n");
        
        
        // ==================== USING CONSTRUCTORS ====================
        
        // Default constructor (no parameters)
        Book book1 = new Book();
        book1.displayBook();
        
        // Parameterized constructor
        Book book2 = new Book("Java Programming", "James Gosling", 450);
        book2.displayBook();
        
        // Copy constructor
        Book book3 = new Book(book2);
        book3.displayBook();
        
        System.out.println("\n=================================\n");
        
        
        // ==================== CONSTRUCTOR OVERLOADING ====================
        
        Rectangle rect1 = new Rectangle();              // Default
        Rectangle rect2 = new Rectangle(5.0, 3.0);      // Parameterized
        Rectangle rect3 = new Rectangle(4.0);           // Square
        
        rect1.displayDimensions();
        rect2.displayDimensions();
        rect3.displayDimensions();
        
        System.out.println("\n=================================\n");
        
        
        // ==================== METHOD OVERLOADING ====================
        
        Calculator calc = new Calculator();
        
        System.out.println("Add two ints: " + calc.add(5, 3));
        System.out.println("Add three ints: " + calc.add(5, 3, 2));
        System.out.println("Add two doubles: " + calc.add(5.5, 3.2));
        System.out.println("Add two strings: " + calc.add("Hello", "World"));
        
        System.out.println("\n=================================\n");
        
        
        // ==================== ACCESS MODIFIERS ====================
        
        AccessModifierDemo demo = new AccessModifierDemo();
        
        // Public - accessible everywhere
        demo.publicMethod();
        
        // Default (package-private) - accessible in same package
        demo.defaultMethod();
        
        // Protected - accessible in same package and subclasses
        demo.protectedMethod();
        
        // Private - NOT accessible outside class
        // demo.privateMethod();  // Compilation error
        
        // Accessing private members through public methods (Encapsulation)
        demo.accessPrivateMembers();
        
        System.out.println("\n=================================\n");
        
        
        // ==================== GETTERS AND SETTERS (ENCAPSULATION) ====================
        
        BankAccount account = new BankAccount();
        
        // Setting values using setters
        account.setAccountNumber("123456789");
        account.setAccountHolder("John Doe");
        account.setBalance(5000.0);
        
        // Getting values using getters
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: $" + account.getBalance());
        
        // Using business logic methods
        account.deposit(1000.0);
        account.withdraw(500.0);
        account.withdraw(10000.0);  // Insufficient funds
        
        System.out.println("\n=================================\n");
        
        
        // ==================== STATIC MEMBERS ====================
        
        // Accessing static variable using class name (preferred)
        System.out.println("Total students: " + StudentCounter.totalStudents);
        
        // Creating objects - static counter increments
        StudentCounter s1 = new StudentCounter("Alice");
        StudentCounter s2 = new StudentCounter("Bob");
        StudentCounter s3 = new StudentCounter("Charlie");
        
        System.out.println("Total students: " + StudentCounter.totalStudents);
        
        // Accessing static method using class name
        StudentCounter.displayTotalStudents();
        
        // Can also access via object (not recommended)
        System.out.println("Via object: " + s1.totalStudents);
        
        System.out.println("\n=================================\n");
        
        
        // ==================== STATIC BLOCK ====================
        
        // Static block executes when class is loaded (before main)
        Configuration config1 = new Configuration();
        Configuration config2 = new Configuration();
        
        System.out.println("\n=================================\n");
        
        
        // ==================== THIS KEYWORD ====================
        
        ThisKeywordDemo thisDemo = new ThisKeywordDemo(10, 20);
        thisDemo.display();
        
        ThisKeywordDemo thisDemo2 = new ThisKeywordDemo(5);
        thisDemo2.display();
        
        System.out.println("\n=================================\n");
        
        
        // ==================== OBJECT CLASS METHODS ====================
        
        Product p1 = new Product("Laptop", 50000.0);
        Product p2 = new Product("Laptop", 50000.0);
        Product p3 = p1;  // Reference copy
        
        // toString() - returns string representation
        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2);  // toString() called implicitly
        
        // equals() - compares content
        System.out.println("p1 equals p2: " + p1.equals(p2));  // true (same content)
        System.out.println("p1 == p2: " + (p1 == p2));         // false (different objects)
        System.out.println("p1 == p3: " + (p1 == p3));         // true (same reference)
        
        // hashCode() - returns hash value
        System.out.println("p1 hashCode: " + p1.hashCode());
        System.out.println("p2 hashCode: " + p2.hashCode());
        
        // getClass() - returns class type
        System.out.println("Class: " + p1.getClass().getName());
        
        System.out.println("\n=================================\n");
        
        
        // ==================== OBJECT PASSING AND RETURNING ====================
        
        Employee emp1 = new Employee("John", 50000.0);
        Employee emp2 = new Employee("Jane", 60000.0);
        
        // Passing object to method
        emp1.displaySalaryComparison(emp2);
        
        // Returning object from method
        Employee highestPaid = Employee.getHighestPaid(emp1, emp2);
        System.out.println("Highest paid: " + highestPaid.name);
        
        System.out.println("\n=================================\n");
        
        
        // ==================== OBJECT CLONING ====================
        
        try {
            Person original = new Person("Alice", 25);
            
            // Shallow copy (clone)
            Person cloned = (Person) original.clone();
            
            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);
            
            // Modifying cloned doesn't affect original (for primitive types)
            cloned.age = 30;
            System.out.println("After modifying clone:");
            System.out.println("Original age: " + original.age);
            System.out.println("Cloned age: " + cloned.age);
            
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        System.out.println("\n=================================\n");
        
        
        // ==================== ANONYMOUS OBJECTS ====================
        
        // Creating object without reference (used once and discarded)
        new Student().displayInfo();  // Creates, uses, and discards
        
        // Passing anonymous object to method
        printStudentInfo(new Student("Anonymous", 20, 75.0));
        
        System.out.println("\n=================================\n");
        
        
        // ==================== NESTED CLASSES ====================
        
        // Static nested class
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display();
        
        // Inner class (non-static)
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
        
        // Method local inner class
        outer.methodWithLocalClass();
        
        // Anonymous inner class
        outer.anonymousInnerClassDemo();
        
        System.out.println("\n=================================\n");
        
        
        // ==================== OBJECT ARRAY ====================
        
        // Array of objects
        Student[] students = new Student[3];
        
        students[0] = new Student("Alice", 20, 85.0);
        students[1] = new Student("Bob", 22, 90.0);
        students[2] = new Student("Charlie", 21, 78.0);
        
        System.out.println("All Students:");
        for (Student s : students) {
            s.displayInfo();
        }
        
        System.out.println("\n=================================\n");
        
        
        // ==================== ARRAYLIST OF OBJECTS ====================
        /*
         * ⚠️ IMPORT USAGE #1: ArrayList
         * Location: Line ~17 (import java.util.ArrayList;)
         * Why needed: ArrayList is not in default java.lang package
         * Purpose: To create dynamic, resizable list of Employee objects
         * Alternative: Use fully qualified name: java.util.ArrayList<Employee>
         */
        
        ArrayList<Employee> employees = new ArrayList<>();  // ← USES IMPORT #1
        
        employees.add(new Employee("John", 50000));
        employees.add(new Employee("Jane", 60000));
        employees.add(new Employee("Mike", 55000));
        
        System.out.println("All Employees:");
        for (Employee emp : employees) {
            emp.displayInfo();
        }
        
        // Sorting employees by salary
        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
        
        System.out.println("\nSorted by salary:");
        employees.forEach(emp -> System.out.println(emp.name + ": $" + emp.salary));
        
        System.out.println("\n=================================\n");
        
        
        // ==================== GARBAGE COLLECTION ====================
        
        GarbageCollectionDemo gc1 = new GarbageCollectionDemo("Object 1");
        GarbageCollectionDemo gc2 = new GarbageCollectionDemo("Object 2");
        
        // Making objects eligible for garbage collection
        gc1 = null;  // Nullifying reference
        gc2 = new GarbageCollectionDemo("Object 3");  // Reassigning reference
        
        // Requesting JVM to run garbage collector (not guaranteed)
        System.gc();
        
        // Anonymous object (eligible for GC immediately)
        new GarbageCollectionDemo("Anonymous");
        
        System.out.println("\n=================================\n");
        
        
        // ==================== SINGLETON PATTERN ====================
        
        // Only one instance can be created
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        
        System.out.println("singleton1 == singleton2: " + (singleton1 == singleton2));  // true
        
        singleton1.showMessage();
        
        System.out.println("\n=================================\n");
        
        
        // ==================== IMMUTABLE CLASS ====================
        
        ImmutablePerson person1 = new ImmutablePerson("Alice", 25);
        
        System.out.println("Person: " + person1);
        
        // Cannot modify - no setters available
        // person1.setName("Bob");  // No such method
        
        // Creating new object with modified values
        ImmutablePerson person2 = new ImmutablePerson("Bob", 30);
        System.out.println("New Person: " + person2);
        
        System.out.println("\n=================================\n");
        
        
        // ==================== INSTANCE VS STATIC ====================
        
        InstanceVsStatic obj1 = new InstanceVsStatic();
        InstanceVsStatic obj2 = new InstanceVsStatic();
        
        obj1.instanceVar = 10;
        obj2.instanceVar = 20;
        
        System.out.println("obj1.instanceVar: " + obj1.instanceVar);  // 10
        System.out.println("obj2.instanceVar: " + obj2.instanceVar);  // 20
        
        InstanceVsStatic.staticVar = 100;
        
        System.out.println("obj1.staticVar: " + obj1.staticVar);      // 100
        System.out.println("obj2.staticVar: " + obj2.staticVar);      // 100
        
        obj1.staticVar = 200;  // Changes for all instances
        
        System.out.println("After changing via obj1:");
        System.out.println("obj1.staticVar: " + obj1.staticVar);      // 200
        System.out.println("obj2.staticVar: " + obj2.staticVar);      // 200
        
        System.out.println("\n=================================\n");
        
        
        // ==================== OBJECT INITIALIZATION ORDER ====================
        
        System.out.println("Creating InitializationOrder object:");
        InitializationOrder initOrder = new InitializationOrder(10);
        
        System.out.println("\n=================================\n");
        
        
        // ==================== COMPARING OBJECTS ====================
        
        Student st1 = new Student("Alice", 20, 85.0);
        Student st2 = new Student("Alice", 20, 85.0);
        Student st3 = st1;
        
        // Using == (compares references)
        System.out.println("st1 == st2: " + (st1 == st2));  // false
        System.out.println("st1 == st3: " + (st1 == st3));  // true
        
        // Using equals() (compares content if overridden)
        System.out.println("st1.equals(st2): " + st1.equals(st2));
        
        System.out.println("\n=================================\n");
        
        
        // ==================== OBJECT AS PARAMETERS ====================
        
        Calculator calculator = new Calculator();
        
        // Primitive types - pass by value
        int x = 10;
        calculator.modifyPrimitive(x);
        System.out.println("After modifyPrimitive, x = " + x);  // Still 10
        
        // Objects - pass by reference
        Student studentObj = new Student("Test", 20, 75.0);
        System.out.println("Before: " + studentObj.name);
        calculator.modifyObject(studentObj);
        System.out.println("After: " + studentObj.name);  // Modified!
        
        System.out.println("\n=================================\n");
        
        
        // ==================== BUILDER PATTERN ====================
        
        // Useful for creating objects with many optional parameters
        Computer computer = new Computer.ComputerBuilder("Intel i7", "16GB")
            .setStorage("512GB SSD")
            .setGraphicsCard("NVIDIA RTX 3060")
            .setOS("Windows 11")
            .build();
        
        System.out.println(computer);
        
        System.out.println("\n=================================\n");
    }
    
    
    // ==================== HELPER METHOD ====================
    
    static void printStudentInfo(Student s) {
        s.displayInfo();
    }
}


// ==================== BASIC CLASS DEFINITION ====================

/**
 * Simple class with instance variables and methods
 */
class Student {
    // Instance variables (attributes/properties/fields)
    String name;
    int age;
    double grade;
    
    // Default constructor
    Student() {
        this.name = "Unknown";
        this.age = 0;
        this.grade = 0.0;
    }
    
    // Parameterized constructor
    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    // Instance methods (behaviors)
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
    
    void study() {
        System.out.println(name + " is studying...");
    }
    
    void sleep() {
        System.out.println(name + " is sleeping...");
    }
}


// ==================== CONSTRUCTOR TYPES ====================

class Book {
    String title;
    String author;
    int pages;
    
    // 1. Default Constructor (no parameters)
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.pages = 0;
        System.out.println("Default constructor called");
    }
    
    // 2. Parameterized Constructor
    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        System.out.println("Parameterized constructor called");
    }
    
    // 3. Copy Constructor
    Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.pages = other.pages;
        System.out.println("Copy constructor called");
    }
    
    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
    }
}


// ==================== CONSTRUCTOR OVERLOADING ====================

class Rectangle {
    double length;
    double width;
    
    // Constructor 1: No parameters (default)
    Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }
    
    // Constructor 2: Two parameters
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Constructor 3: One parameter (square)
    Rectangle(double side) {
        this.length = side;
        this.width = side;
    }
    
    // Constructor 4: Using constructor chaining
    Rectangle(double length, double width, boolean validated) {
        this(length, width);  // Calls constructor 2
        if (validated) {
            System.out.println("Dimensions validated");
        }
    }
    
    void displayDimensions() {
        System.out.println("Length: " + length + ", Width: " + width);
        System.out.println("Area: " + (length * width));
    }
}


// ==================== METHOD OVERLOADING ====================

class Calculator {
    // Same method name, different parameters
    
    // Method 1: Two int parameters
    int add(int a, int b) {
        return a + b;
    }
    
    // Method 2: Three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method 3: Two double parameters
    double add(double a, double b) {
        return a + b;
    }
    
    // Method 4: Two String parameters
    String add(String a, String b) {
        return a + b;
    }
    
    // Method for demonstrating pass by value
    void modifyPrimitive(int x) {
        x = 100;  // Doesn't affect original
    }
    
    // Method for demonstrating pass by reference
    void modifyObject(Student s) {
        s.name = "Modified";  // Modifies original object
    }
}


// ==================== ACCESS MODIFIERS ====================

class AccessModifierDemo {
    // Public - accessible everywhere
    public int publicVar = 10;
    
    // Default (package-private) - accessible only in same package
    int defaultVar = 20;
    
    // Protected - accessible in same package and subclasses
    protected int protectedVar = 30;
    
    // Private - accessible only within this class
    private int privateVar = 40;
    
    // Public method
    public void publicMethod() {
        System.out.println("This is a public method");
    }
    
    // Default method
    void defaultMethod() {
        System.out.println("This is a default method");
    }
    
    // Protected method
    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }
    
    // Private method
    private void privateMethod() {
        System.out.println("This is a private method");
    }
    
    // Public method to access private members
    public void accessPrivateMembers() {
        System.out.println("Private variable: " + privateVar);
        privateMethod();
    }
}


// ==================== ENCAPSULATION (GETTERS & SETTERS) ====================

class BankAccount {
    // Private instance variables (data hiding)
    private String accountNumber;
    private String accountHolder;
    private double balance;
    
    // Constructor
    public BankAccount() {
        this.balance = 0.0;
    }
    
    // Getters (Accessors)
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolder() {
        return accountHolder;
    }
    
    public double getBalance() {
        return balance;
    }
    
    // Setters (Mutators) with validation
    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && accountNumber.length() == 9) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid account number");
        }
    }
    
    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.isEmpty()) {
            this.accountHolder = accountHolder;
        }
    }
    
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative");
        }
    }
    
    // Business logic methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New Balance: $" + balance);
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Remaining Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }
}


// ==================== STATIC MEMBERS ====================

class StudentCounter {
    String name;
    
    // Static variable (class variable) - shared by all instances
    static int totalStudents = 0;
    
    // Static constant
    static final String SCHOOL_NAME = "ABC School";
    
    // Constructor
    StudentCounter(String name) {
        this.name = name;
        totalStudents++;  // Incremented for each object created
    }
    
    // Static method - can access only static members
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
        System.out.println("School: " + SCHOOL_NAME);
        // System.out.println(name);  // ERROR: Cannot access instance variable
    }
    
    // Instance method - can access both static and instance members
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("School: " + SCHOOL_NAME);
        System.out.println("Total Students: " + totalStudents);
    }
}


// ==================== STATIC BLOCK ====================

class Configuration {
    static String configPath;
    static int maxConnections;
    
    // Static block - executes once when class is loaded
    static {
        System.out.println("Static block 1 executed");
        configPath = "/etc/config";
        maxConnections = 100;
    }
    
    // Multiple static blocks are allowed (executed in order)
    static {
        System.out.println("Static block 2 executed");
        System.out.println("Configuration loaded from: " + configPath);
    }
    
    // Instance initialization block
    {
        System.out.println("Instance block executed");
    }
    
    // Constructor
    Configuration() {
        System.out.println("Constructor executed");
    }
}


// ==================== THIS KEYWORD ====================

class ThisKeywordDemo {
    int x;
    int y;
    
    // 1. 'this' to refer to instance variable
    ThisKeywordDemo(int x, int y) {
        this.x = x;  // this.x refers to instance variable
        this.y = y;  // x refers to parameter
    }
    
    // 2. 'this' to call another constructor
    ThisKeywordDemo(int x) {
        this(x, 0);  // Calls the two-parameter constructor
    }
    
    // 3. 'this' to return current object
    ThisKeywordDemo getObject() {
        return this;
    }
    
    // 4. 'this' to pass current object as parameter
    void passThis() {
        display(this);
    }
    
    void display(ThisKeywordDemo obj) {
        System.out.println("x = " + obj.x + ", y = " + obj.y);
    }
    
    void display() {
        System.out.println("x = " + this.x + ", y = " + this.y);
    }
}


// ==================== OBJECT CLASS METHODS ====================

/*
 * ⚠️ IMPORT USAGE #2: Objects (from java.util.Objects)
 * Location: Line ~23 (import java.util.Objects;)
 * Used in: equals() method (line ~858) and hashCode() method (line ~866)
 * 
 * WHY NEEDED:
 * - Objects.equals(a, b): Null-safe comparison (handles null without NullPointerException)
 * - Objects.hash(values...): Convenient way to generate hash code from multiple fields
 * 
 * WITHOUT IMPORT, you would need:
 * - Full qualified name: java.util.Objects.equals(name, product.name)
 * - Or manual null checking: if (name == null) { ... } else { name.equals(...) }
 */

class Product {
    String name;
    double price;
    
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // Override toString() - provides string representation
    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
    
    // Override equals() - compares content
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return Double.compare(product.price, price) == 0 &&
               Objects.equals(name, product.name);  // ← USES IMPORT #2
        /*
         * Objects.equals() benefits:
         * - Handles null safely: Objects.equals(null, null) → true
         * - Handles null safely: Objects.equals("a", null) → false
         * - Without it: name.equals(product.name) would throw NullPointerException if name is null
         */
    }
    
    // Override hashCode() - generates hash code
    @Override
    public int hashCode() {
        return Objects.hash(name, price);  // ← USES IMPORT #2
        /*
         * Objects.hash() benefits:
         * - Convenient method to combine multiple fields
         * - Handles null values properly
         * - Without it: You'd need manual calculation like:
         *   int result = name != null ? name.hashCode() : 0;
         *   result = 31 * result + Double.hashCode(price);
         */
    }
}


// ==================== OBJECT PASSING AND RETURNING ====================

class Employee {
    String name;
    double salary;
    
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    // Accepting object as parameter
    void displaySalaryComparison(Employee other) {
        System.out.println(this.name + " salary: $" + this.salary);
        System.out.println(other.name + " salary: $" + other.salary);
        
        if (this.salary > other.salary) {
            System.out.println(this.name + " earns more");
        } else {
            System.out.println(other.name + " earns more");
        }
    }
    
    // Returning object from method
    static Employee getHighestPaid(Employee e1, Employee e2) {
        return (e1.salary > e2.salary) ? e1 : e2;
    }
    
    void displayInfo() {
        System.out.println("Name: " + name + ", Salary: $" + salary);
    }
}


// ==================== OBJECT CLONING ====================

class Person implements Cloneable {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Override clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}


// ==================== NESTED CLASSES ====================

class OuterClass {
    private int outerVar = 100;
    static int staticOuterVar = 200;
    
    // 1. Static Nested Class
    static class StaticNestedClass {
        void display() {
            System.out.println("Static nested class");
            System.out.println("Can access static outer variable: " + staticOuterVar);
            // System.out.println(outerVar);  // ERROR: Cannot access instance variable
        }
    }
    
    // 2. Inner Class (Non-static)
    class InnerClass {
        void display() {
            System.out.println("Inner class");
            System.out.println("Can access outer variable: " + outerVar);
            System.out.println("Can access static outer variable: " + staticOuterVar);
        }
    }
    
    // 3. Method Local Inner Class
    void methodWithLocalClass() {
        class LocalClass {
            void display() {
                System.out.println("Local inner class");
                System.out.println("Outer variable: " + outerVar);
            }
        }
        
        LocalClass local = new LocalClass();
        local.display();
    }
    
    // 4. Anonymous Inner Class
    void anonymousInnerClassDemo() {
        // Anonymous class implementing an interface or extending a class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous inner class");
            }
        };
        
        runnable.run();
    }
}


// ==================== GARBAGE COLLECTION ====================

class GarbageCollectionDemo {
    String name;
    
    GarbageCollectionDemo(String name) {
        this.name = name;
        System.out.println(name + " created");
    }
    
    // finalize() called by garbage collector before destroying object
    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " garbage collected");
    }
}


// ==================== SINGLETON PATTERN ====================

class Singleton {
    // Private static instance
    private static Singleton instance = null;
    
    // Private constructor prevents instantiation from outside
    private Singleton() {
        System.out.println("Singleton instance created");
    }
    
    // Public method to get the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}


// ==================== IMMUTABLE CLASS ====================

final class ImmutablePerson {
    private final String name;
    private final int age;
    
    // All fields initialized in constructor
    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Only getters, no setters
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return "ImmutablePerson{name='" + name + "', age=" + age + "}";
    }
}


// ==================== INSTANCE VS STATIC ====================

class InstanceVsStatic {
    // Instance variable - separate copy for each object
    int instanceVar;
    
    // Static variable - single copy shared by all objects
    static int staticVar;
    
    // Instance method - can access both instance and static members
    void instanceMethod() {
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
    }
    
    // Static method - can only access static members
    static void staticMethod() {
        System.out.println("Static variable: " + staticVar);
        // System.out.println("Instance variable: " + instanceVar);  // ERROR
    }
}


// ==================== INITIALIZATION ORDER ====================

class InitializationOrder {
    static int staticVar;
    int instanceVar;
    
    // 1. Static block (executed first, when class loads)
    static {
        staticVar = 10;
        System.out.println("1. Static block executed, staticVar = " + staticVar);
    }
    
    // 2. Instance initialization block (executed before constructor)
    {
        instanceVar = 20;
        System.out.println("2. Instance block executed, instanceVar = " + instanceVar);
    }
    
    // 3. Constructor (executed last)
    InitializationOrder(int value) {
        this.instanceVar = value;
        System.out.println("3. Constructor executed, instanceVar = " + instanceVar);
    }
}


// ==================== BUILDER PATTERN ====================

class Computer {
    // Required parameters
    private String processor;
    private String ram;
    
    // Optional parameters
    private String storage;
    private String graphicsCard;
    private String os;
    
    private Computer(ComputerBuilder builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.os = builder.os;
    }
    
    // Static nested Builder class
    public static class ComputerBuilder {
        private String processor;
        private String ram;
        private String storage;
        private String graphicsCard;
        private String os;
        
        public ComputerBuilder(String processor, String ram) {
            this.processor = processor;
            this.ram = ram;
        }
        
        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        
        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }
        
        public ComputerBuilder setOS(String os) {
            this.os = os;
            return this;
        }
        
        public Computer build() {
            return new Computer(this);
        }
    }
    
    @Override
    public String toString() {
        return "Computer{" +
               "processor='" + processor + '\'' +
               ", ram='" + ram + '\'' +
               ", storage='" + storage + '\'' +
               ", graphicsCard='" + graphicsCard + '\'' +
               ", os='" + os + '\'' +
               '}';
    }
}


// ==================== IMPORT STATEMENTS SUMMARY ====================
/*
 * SUMMARY OF ALL IMPORTS USED IN THIS FILE:
 * 
 * 1. import java.util.ArrayList;
 *    - Where: Line ~492 (ArrayList<Employee> employees = new ArrayList<>();)
 *    - Why: To create dynamic, resizable list of objects
 *    - Alternative: java.util.ArrayList<Employee> (fully qualified name)
 * 
 * 2. import java.util.Objects;
 *    - Where: Line ~858 (Objects.equals() in Product.equals())
 *            Line ~866 (Objects.hash() in Product.hashCode())
 *    - Why: For null-safe comparison and convenient hash code generation
 *    - Alternative: java.util.Objects.equals() (fully qualified name)
 * 
 * CLASSES NOT REQUIRING IMPORT:
 * - String, System, Object, Exception, etc. (from java.lang package - imported by default)
 * - User-defined classes in same file (no import needed)
 * 
 * BEST PRACTICES:
 * ✅ Use specific imports (not wildcard *)
 * ✅ Organize imports alphabetically
 * ✅ Remove unused imports
 * ✅ Group imports by package (java.*, javax.*, org.*, com.*)
 */


// ==================== IMPORTANT NOTES ====================
/*
 * 1. Class is a blueprint; Object is an instance
 * 2. Objects are created using 'new' keyword
 * 3. Constructor name must match class name
 * 4. Constructor has no return type (not even void)
 * 5. If no constructor is defined, Java provides default constructor
 * 6. Constructor overloading is allowed
 * 7. Method overloading: same name, different parameters
 * 8. 'this' refers to current object
 * 9. 'static' members belong to class, not objects
 * 10. Static methods cannot access instance variables directly
 * 11. Instance methods can access both static and instance members
 * 12. Access modifiers: public, private, protected, default
 * 13. Encapsulation: Data hiding using private + getters/setters
 * 14. Objects are passed by reference
 * 15. Primitives are passed by value
 * 16. '==' compares references; equals() compares content
 * 17. Override toString() for readable output
 * 18. Override equals() and hashCode() together
 * 19. Implement Cloneable for object cloning
 * 20. finalize() called before garbage collection (deprecated)
 * 21. System.gc() requests garbage collection (not guaranteed)
 * 22. Singleton: Only one instance allowed
 * 23. Immutable class: final class, final fields, no setters
 * 24. Static block executes when class loads
 * 25. Instance block executes before constructor
 * 26. Nested classes: static, inner, local, anonymous
 * 27. Builder pattern useful for objects with many parameters
 * 28. Anonymous objects used once and discarded
 * 29. Array of objects: ClassName[] arr = new ClassName[size];
 * 30. Always override toString() for debugging
 * 31. Import statements allow using classes from other packages
 * 32. java.lang package is imported by default (no import needed)
 * 33. Use specific imports for clarity and avoiding conflicts
 * 34. Import statement syntax: import packageName.ClassName;
 * 35. Wildcard import (*) imports all classes from package
 */