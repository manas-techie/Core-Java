/**
 * STACK AND HEAP MEMORY IN JAVA - Complete Notes
 * Understanding how Java manages memory
 */

public class StackAndHeapMemoryNotes {

    // ============================================
    // INSTANCE VARIABLE - Stored in HEAP
    // ============================================
    int instanceVar = 100; // Lives in heap with the object

    public static void main(String[] args) {

        /*
         * ============================================
         * WHAT IS STACK MEMORY?
         * ============================================
         * - Stores LOCAL VARIABLES and METHOD CALLS
         * - Fast access (LIFO - Last In First Out)
         * - Automatically cleaned when method ends
         * - Limited size (can cause StackOverflowError)
         * - Each thread has its own stack
         */

        /*
         * ============================================
         * WHAT IS HEAP MEMORY?
         * ============================================
         * - Stores OBJECTS and INSTANCE VARIABLES
         * - Shared among all threads
         * - Larger size than stack
         * - Cleaned by Garbage Collector
         * - Slower access than stack
         */

        // ============================================
        // EXAMPLE 1: PRIMITIVE VARIABLES
        // ============================================

        int age = 25; // STACK: variable 'age' with value 25
        double salary = 50000; // STACK: variable 'salary' with value 50000
        char grade = 'A'; // STACK: variable 'grade' with value 'A'
        boolean isActive = true; // STACK: variable 'isActive' with value true

        /*
         * Memory Representation:
         * 
         * STACK (main method)
         * ┌──────────────┐
         * │ isActive: true│
         * │ grade: 'A' │
         * │ salary: 50000│
         * │ age: 25 │
         * └──────────────┘
         * 
         * HEAP
         * (empty for primitives)
         */

        // ============================================
        // EXAMPLE 2: OBJECTS (REFERENCE TYPES)
        // ============================================

        String name = "John"; // Reference in STACK, Object in HEAP

        /*
         * Memory Representation:
         * 
         * STACK (main method)
         * ┌────────────────┐
         * │ name: @1001 │ ← Reference (address)
         * └────────────────┘
         * |
         * ↓
         * HEAP
         * ┌────────────────┐
         * │ @1001: "John" │ ← Actual String object
         * └────────────────┘
         */

        // ============================================
        // EXAMPLE 3: MULTIPLE REFERENCES
        // ============================================

        String str1 = "Hello"; // str1 → points to "Hello" in heap
        String str2 = str1; // str2 → points to SAME object

        /*
         * Memory Representation:
         * 
         * STACK
         * ┌────────────────┐
         * │ str2: @2001 │ ─┐
         * │ str1: @2001 │ ─┤ Both point to same object
         * └────────────────┘ │
         * ↓
         * HEAP
         * ┌────────────────┐
         * │ @2001: "Hello" │
         * └────────────────┘
         */

        str1 = "World"; // Now str1 points to a NEW object

        /*
         * After reassignment:
         * 
         * STACK
         * ┌────────────────┐
         * │ str2: @2001 │ → Still points to "Hello"
         * │ str1: @2002 │ → Now points to "World"
         * └────────────────┘
         * 
         * HEAP
         * ┌────────────────┐
         * │ @2002: "World" │
         * │ @2001: "Hello" │
         * └────────────────┘
         */

        // ============================================
        // EXAMPLE 4: ARRAYS
        // ============================================

        int[] numbers = new int[3]; // Reference in STACK, Array in HEAP
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        /*
         * Memory Representation:
         * 
         * STACK
         * ┌────────────────┐
         * │ numbers: @3001 │ ← Reference
         * └────────────────┘
         * |
         * ↓
         * HEAP
         * ┌────────────────┐
         * │ @3001: │
         * │ [0]: 10 │
         * │ [1]: 20 │
         * │ [2]: 30 │
         * └────────────────┘
         */

        // ============================================
        // EXAMPLE 5: OBJECTS WITH PRIMITIVES
        // ============================================

        Person person1 = new Person("Alice", 30);

        /*
         * Memory Representation:
         * 
         * STACK (main method)
         * ┌────────────────────┐
         * │ person1: @4001 │ ← Reference to Person object
         * └────────────────────┘
         * |
         * ↓
         * HEAP
         * ┌────────────────────┐
         * │ @4001: Person │
         * │ name: @5001 ────┼──→ @5001: "Alice"
         * │ age: 30 │ (name is String, also in heap)
         * └────────────────────┘
         */

        // ============================================
        // EXAMPLE 6: METHOD CALLS (STACK FRAMES)
        // ============================================

        int result = calculateSum(5, 10);

        /*
         * During method execution:
         * 
         * STACK
         * ┌─────────────────────┐
         * │ calculateSum() │ ← New frame created
         * │ sum: 15 │
         * │ b: 10 │
         * │ a: 5 │
         * ├─────────────────────┤
         * │ main() │
         * │ result: (waiting) │
         * └─────────────────────┘
         * 
         * After method returns:
         * 
         * STACK
         * ┌─────────────────────┐
         * │ main() │
         * │ result: 15 │ ← calculateSum frame removed
         * └─────────────────────┘
         */

        // ============================================
        // EXAMPLE 7: NULL REFERENCES
        // ============================================

        String text = null; // Reference exists in STACK, but points to nothing

        /*
         * Memory Representation:
         * 
         * STACK
         * ┌────────────────┐
         * │ text: null │ ← No heap address
         * └────────────────┘
         * 
         * HEAP
         * (nothing allocated)
         */

        // text.length(); // NullPointerException - no object in heap!

        // ============================================
        // EXAMPLE 8: GARBAGE COLLECTION
        // ============================================

        Person p1 = new Person("Bob", 25); // Object created in heap
        Person p2 = new Person("Charlie", 35); // Another object created

        p1 = p2; // Now p1 points to Charlie, Bob has no reference!

        /*
         * Before: p1 = p2
         * 
         * STACK HEAP
         * ┌────────────┐ ┌──────────────────┐
         * │ p2: @7001 │───────→│ @7001: "Charlie" │
         * │ p1: @7000 │───────→│ @7000: "Bob" │
         * └────────────┘ └──────────────────┘
         * 
         * After: p1 = p2
         * 
         * STACK HEAP
         * ┌────────────┐ ┌──────────────────┐
         * │ p2: @7001 │───┐ →│ @7001: "Charlie" │
         * │ p1: @7001 │───┘ │ @7000: "Bob" │ ← Eligible for GC
         * └────────────┘ └──────────────────┘
         * ↑ No references!
         */

        // "Bob" object will be removed by Garbage Collector

        // ============================================
        // EXAMPLE 9: PASS BY VALUE (PRIMITIVES)
        // ============================================

        int original = 100;
        modifyPrimitive(original);
        System.out.println(original); // Still 100 (unchanged)

        /*
         * Why? Because a COPY is passed to the method
         * 
         * STACK (during modifyPrimitive)
         * ┌──────────────────┐
         * │ modifyPrimitive()│
         * │ num: 100 → 200 │ ← Copy modified
         * ├──────────────────┤
         * │ main() │
         * │ original: 100 │ ← Original unchanged
         * └──────────────────┘
         */

        // ============================================
        // EXAMPLE 10: PASS BY VALUE (OBJECTS)
        // ============================================

        Person person = new Person("David", 40);
        modifyObject(person);
        System.out.println(person.name); // "Modified" (changed!)

        /*
         * Why? Because REFERENCE is copied, both point to same object
         * 
         * STACK HEAP
         * ┌──────────────────┐ ┌──────────────┐
         * │ modifyObject() │ │ @8001: │
         * │ p: @8001 ────┼─────────→│ name: "Modified"
         * ├──────────────────┤ │ age: 40 │
         * │ main() │ └──────────────┘
         * │ person: @8001 ─┼─────────→ ↑
         * └──────────────────┘ Same object!
         */

    }

    // ============================================
    // HELPER METHODS
    // ============================================

    static int calculateSum(int a, int b) {
        int sum = a + b; // All local variables in STACK
        return sum; // Value returned, stack frame removed
    }

    static void modifyPrimitive(int num) {
        num = 200; // Only changes the local copy in stack
    }

    static void modifyObject(Person p) {
        p.name = "Modified"; // Modifies the actual object in heap
    }

}

// ============================================
// HELPER CLASS
// ============================================

class Person {
    String name; // Instance variables stored in HEAP
    int age;

    Person(String name, int age) {
        this.name = name; // 'this' refers to object in heap
        this.age = age;
    }
}

/*
 * ============================================
 * STACK vs HEAP - QUICK COMPARISON
 * ============================================
 * 
 * STACK MEMORY:
 * ✓ Stores: Local variables, method calls, references
 * ✓ Lifetime: Until method completes
 * ✓ Size: Small (1 MB - 8 MB typically)
 * ✓ Speed: Very fast (LIFO structure)
 * ✓ Thread: Each thread has own stack
 * ✓ Error: StackOverflowError (recursion, too deep calls)
 * ✓ Management: Automatic (method ends = memory freed)
 * 
 * HEAP MEMORY:
 * ✓ Stores: Objects, instance variables, arrays
 * ✓ Lifetime: Until Garbage Collector removes
 * ✓ Size: Large (depends on JVM settings)
 * ✓ Speed: Slower than stack
 * ✓ Thread: Shared among all threads
 * ✓ Error: OutOfMemoryError (too many objects)
 * ✓ Management: Garbage Collector (automatic)
 * 
 * 
 * ============================================
 * WHAT GOES WHERE?
 * ============================================
 * 
 * STACK:
 * - Primitive variables (int, double, char, boolean, etc.)
 * - Object references (the address, not the object)
 * - Method parameters
 * - Local variables inside methods
 * 
 * HEAP:
 * - Objects created with 'new' keyword
 * - Instance variables (class fields)
 * - Arrays
 * - Strings (in String pool area)
 * 
 * 
 * ============================================
 * COMMON SCENARIOS
 * ============================================
 * 
 * 1. PRIMITIVE:
 * int x = 5;
 * → Stack: x = 5
 * 
 * 2. OBJECT:
 * Person p = new Person();
 * → Stack: p = @101 (reference)
 * → Heap: @101 = Person object
 * 
 * 3. ARRAY:
 * int[] arr = new int[5];
 * → Stack: arr = @202 (reference)
 * → Heap: @202 = array with 5 integers
 * 
 * 4. STRING:
 * String s = "Hello";
 * → Stack: s = @303 (reference)
 * → Heap: @303 = "Hello" (in String pool)
 * 
 * 5. NULL:
 * String s = null;
 * → Stack: s = null (no heap allocation)
 * 
 * 
 * ============================================
 * MEMORY ERRORS
 * ============================================
 * 
 * StackOverflowError:
 * - Too many method calls (infinite recursion)
 * - Stack memory full
 * - Fix: Check recursion base case
 * 
 * OutOfMemoryError:
 * - Too many objects created
 * - Heap memory full
 * - Fix: Remove unused objects, increase heap size
 * 
 * 
 * ============================================
 * KEY TAKEAWAYS
 * ============================================
 * 
 * 1. Primitives go in STACK (fast, automatic cleanup)
 * 2. Objects go in HEAP (slower, GC cleanup)
 * 3. References are in STACK, objects in HEAP
 * 4. Stack = Method scope, Heap = Object lifetime
 * 5. Java passes by VALUE (copies for primitives, copies of references for
 * objects)
 * 6. When no reference points to object → Garbage Collection
 * 7. Each method call creates new stack frame
 * 8. Instance variables live with object in heap
 * 
 */