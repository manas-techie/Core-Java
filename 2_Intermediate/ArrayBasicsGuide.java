
public class ArrayBasicsGuide {
    // ✅ Declaration & Initialization - All 4 methods
    // ✅ Array Length - How to get size
    // ✅ Accessing & Modifying - Index-based operations
    // ✅ Default Values - For different data types
    // ✅ Iteration - 3 different loop methods
    // ✅ Copying - 4 different techniques
    // ✅ Comparing - Reference vs content comparison
    // ✅ Searching - Linear and binary search
    // ✅ Sorting - Using Arrays.sort()
    // ✅ Min/Max Finding - Algorithm example
    // ✅ Sum & Average - Common calculations
    // ✅ Reversing - In-place reversal
    // ✅ Filling - Arrays.fill() usage
    // ✅ String Conversion - For display
    // ✅ Anonymous Arrays - Direct usage
    // ✅ Method Parameters - Pass by reference
    // ✅ Returning Arrays - From methods
    // ✅ Varargs - Variable-length arguments
    // ✅ Common Pitfalls - Error handling
    // ✅ Important Notes - Key concepts summary

    public static void main(String[] args) {

        // ==================== ARRAY DECLARATION ====================
        // Syntax: dataType[] arrayName; OR dataType arrayName[];

        int[] numbers; // Preferred way - declares an integer array
        String names[]; // Alternative syntax - less commonly used
        double[] prices; // Double array declaration
        boolean[] flags; // Boolean array declaration

        // ==================== ARRAY INITIALIZATION ====================

        // Method 1: Declaration and memory allocation separately
        numbers = new int[5]; // Creates array with 5 elements (default values: 0)

        // Method 2: Declaration and initialization in one line
        int[] scores = new int[10]; // Array of 10 integers

        // Method 3: Array literal - declare, allocate, and initialize with values
        int[] ages = { 18, 25, 30, 35, 42 }; // Size is 5
        String[] cities = { "Mumbai", "Delhi", "Bangalore" }; // Size is 3

        // Method 4: Anonymous array initialization
        int[] temp = new int[] { 10, 20, 30, 40 };

        // ==================== ARRAY LENGTH ====================
        // Arrays have a fixed size that cannot be changed after creation

        System.out.println("Length of ages array: " + ages.length); // Output: 5
        // Note: It's .length (property), NOT .length() method

        // ==================== ACCESSING ARRAY ELEMENTS ====================
        // Array indexing starts at 0 and goes to (length - 1)

        int[] marks = { 85, 90, 78, 92, 88 };

        System.out.println("First element: " + marks[0]); // Output: 85
        System.out.println("Third element: " + marks[2]); // Output: 78
        System.out.println("Last element: " + marks[marks.length - 1]); // Output: 88

        // Accessing invalid index throws ArrayIndexOutOfBoundsException
        // System.out.println(marks[10]); // Runtime Error!

        // ==================== MODIFYING ARRAY ELEMENTS ====================

        marks[1] = 95; // Changes second element from 90 to 95
        marks[4] = 100; // Changes last element from 88 to 100

        // ==================== DEFAULT VALUES ====================
        // When arrays are created without explicit initialization

        int[] defaultInts = new int[3]; // All elements = 0
        double[] defaultDoubles = new double[3]; // All elements = 0.0
        boolean[] defaultBools = new boolean[3]; // All elements = false
        String[] defaultStrings = new String[3]; // All elements = null

        System.out.println("Default int: " + defaultInts[0]); // 0
        System.out.println("Default double: " + defaultDoubles[0]); // 0.0
        System.out.println("Default boolean: " + defaultBools[0]); // false
        System.out.println("Default String: " + defaultStrings[0]); // null

        // ==================== ITERATING THROUGH ARRAYS ====================

        int[] values = { 10, 20, 30, 40, 50 };

        // Method 1: Traditional for loop (use when you need index)
        System.out.println("\nUsing traditional for loop:");
        for (int i = 0; i < values.length; i++) {
            System.out.println("Index " + i + ": " + values[i]);
        }

        // Method 2: Enhanced for loop / for-each loop (use when you only need values)
        System.out.println("\nUsing enhanced for loop:");
        for (int value : values) {
            System.out.println("Value: " + value);
        }

        // Method 3: Reverse iteration
        System.out.println("\nReverse iteration:");
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.println(values[i]);
        }

        // ==================== COPYING ARRAYS ====================

        int[] original = { 1, 2, 3, 4, 5 };

        // Method 1: Using loop (manual copy)
        int[] copy1 = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy1[i] = original[i];
        }

        // Method 2: Using System.arraycopy()
        int[] copy2 = new int[original.length];
        System.arraycopy(original, 0, copy2, 0, original.length);
        // Parameters: (source, sourceStart, destination, destStart, length)

        // Method 3: Using Arrays.copyOf() - most convenient
        int[] copy3 = java.util.Arrays.copyOf(original, original.length);

        // Method 4: Using clone() method
        int[] copy4 = original.clone();

        // WARNING: Simple assignment creates a reference, NOT a copy
        int[] notACopy = original; // Both point to same array
        notACopy[0] = 100; // This modifies original too!

        // ==================== COMPARING ARRAYS ====================

        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };
        int[] arr3 = arr1;

        // Using == compares references (memory addresses), not content
        System.out.println("\narr1 == arr2: " + (arr1 == arr2)); // false (different objects)
        System.out.println("arr1 == arr3: " + (arr1 == arr3)); // true (same reference)

        // To compare content, use Arrays.equals()
        System.out.println("Arrays.equals(arr1, arr2): " +
                java.util.Arrays.equals(arr1, arr2)); // true

        // ==================== SEARCHING IN ARRAYS ====================

        int[] searchArray = { 15, 23, 8, 42, 16, 4, 35 };

        // Linear Search - works on unsorted arrays
        int searchKey = 42;
        int foundIndex = -1;
        for (int i = 0; i < searchArray.length; i++) {
            if (searchArray[i] == searchKey) {
                foundIndex = i;
                break;
            }
        }
        System.out.println("\n42 found at index: " + foundIndex);

        // Binary Search - requires sorted array (using Arrays.binarySearch())
        int[] sortedArray = { 4, 8, 15, 16, 23, 35, 42 };
        int index = java.util.Arrays.binarySearch(sortedArray, 23);
        System.out.println("23 found at index: " + index);

        // ==================== SORTING ARRAYS ====================

        int[] unsorted = { 64, 25, 12, 22, 11 };

        // Using Arrays.sort() - sorts in ascending order
        java.util.Arrays.sort(unsorted);
        System.out.println("\nSorted array: " + java.util.Arrays.toString(unsorted));

        // Sorting specific range: Arrays.sort(array, fromIndex, toIndex)
        int[] partial = { 9, 7, 5, 3, 1, 8, 6 };
        java.util.Arrays.sort(partial, 0, 4); // Sorts first 4 elements

        // ==================== FINDING MIN AND MAX ====================

        int[] data = { 34, 12, 89, 5, 67, 23 };

        int min = data[0];
        int max = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] < min)
                min = data[i];
            if (data[i] > max)
                max = data[i];
        }

        System.out.println("\nMin value: " + min); // 5
        System.out.println("Max value: " + max); // 89

        // ==================== CALCULATING SUM AND AVERAGE ====================

        int[] nums = { 10, 20, 30, 40, 50 };
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        double average = (double) sum / nums.length;

        System.out.println("\nSum: " + sum); // 150
        System.out.println("Average: " + average); // 30.0

        // ==================== REVERSING AN ARRAY ====================

        int[] toReverse = { 1, 2, 3, 4, 5 };

        // In-place reversal using two pointers
        int left = 0;
        int right = toReverse.length - 1;

        while (left < right) {
            // Swap elements
            int tempVar = toReverse[left];
            toReverse[left] = toReverse[right];
            toReverse[right] = tempVar;

            left++;
            right--;
        }

        System.out.println("\nReversed: " + java.util.Arrays.toString(toReverse));

        // ==================== FILLING ARRAYS ====================

        int[] fillArray = new int[5];

        // Fill entire array with same value
        java.util.Arrays.fill(fillArray, 7);
        System.out.println("\nFilled array: " + java.util.Arrays.toString(fillArray));

        // Fill specific range
        java.util.Arrays.fill(fillArray, 1, 4, 99); // Fills index 1-3 with 99

        // ==================== CONVERTING ARRAY TO STRING ====================

        int[] display = { 1, 2, 3, 4, 5 };

        // Using Arrays.toString() for readable output
        System.out.println("\n" + java.util.Arrays.toString(display));
        // Output: [1, 2, 3, 4, 5]

        // ==================== ANONYMOUS ARRAYS ====================
        // Arrays created without reference variable (used directly)

        printArray(new int[] { 100, 200, 300 }); // Passed directly to method

        // ==================== ARRAY AS METHOD PARAMETER ====================
        // Arrays are passed by reference (changes affect original)

        int[] modifyTest = { 1, 2, 3 };
        modifyArray(modifyTest);
        System.out.println("\nAfter method call: " +
                java.util.Arrays.toString(modifyTest)); // [10, 2, 3]

        // ==================== RETURNING ARRAY FROM METHOD ====================

        int[] returned = createArray(5, 10);
        System.out.println("Returned array: " + java.util.Arrays.toString(returned));

        // ==================== VARIABLE-LENGTH ARGUMENTS (VARARGS) ====================
        // Internally treated as array

        int total = sumAll(1, 2, 3, 4, 5); // Can pass any number of arguments
        System.out.println("\nSum using varargs: " + total);

        // ==================== COMMON PITFALLS ====================

        // 1. ArrayIndexOutOfBoundsException
        try {
            int[] test = { 1, 2, 3 };
            int invalid = test[5]; // Index out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        // 2. NullPointerException
        try {
            int[] nullArray = null;
            int len = nullArray.length; // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot access null array");
        }

        // 3. Arrays are fixed size - cannot be resized
        // If you need dynamic size, use ArrayList instead

        // ==================== IMPORTANT NOTES ====================
        /*
         * 1. Arrays are objects in Java (stored in heap memory)
         * 2. Array size is fixed and cannot be changed after creation
         * 3. Arrays can store primitive types OR objects (not mixed)
         * 4. Array index starts at 0
         * 5. Arrays are passed by reference to methods
         * 6. Array elements are initialized to default values
         * 7. Use .length to get array size (not .length())
         * 8. ArrayIndexOutOfBoundsException is unchecked exception
         * 9. Multi-dimensional arrays are "array of arrays"
         * 10. For dynamic sizing, use ArrayList or other Collections
         */
    }

    // ==================== HELPER METHODS ====================

    /**
     * Method to print array elements
     */
    static void printArray(int[] arr) {
        System.out.println("\nPrinting array:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * Method that modifies array (demonstrates pass by reference)
     */
    static void modifyArray(int[] arr) {
        if (arr.length > 0) {
            arr[0] = 10; // Modifies original array
        }
    }

    /**
     * Method that returns a new array
     */
    static int[] createArray(int size, int value) {
        int[] newArray = new int[size];
        java.util.Arrays.fill(newArray, value);
        return newArray;
    }

    /**
     * Method using varargs (variable-length arguments)
     */
    static int sumAll(int... numbers) { // numbers is treated as int[]
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}