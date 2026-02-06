
/**
 * Comprehensive Guide to ArrayList and List Interface in Java
 * This file covers all fundamental concepts for reference
 */

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArrayListAndListGuide {
    // ✅ List Interface & ArrayList - What they are, differences
    // ✅ Importing - Required imports
    // ✅ Declaration - 5 different methods
    // ✅ Initialization - 6 different ways
    // ✅ Adding Elements - add(), addAll(), at index
    // ✅ Accessing Elements - get(), contains(), indexOf()
    // ✅ Modifying Elements - set(), replaceAll()
    // ✅ Removing Elements - remove(), removeAll(), removeIf(), clear()
    // ✅ Size & Capacity - size(), isEmpty(), ensureCapacity()
    // ✅ Iteration - 8 different methods
    // ✅ Searching - contains(), indexOf(), binarySearch(), Stream
    // ✅ Sorting - Multiple sorting techniques
    // ✅ Reversing - Collections.reverse()
    // ✅ Min/Max - Collections, Stream methods
    // ✅ Sum & Average - Traditional and Stream
    // ✅ Copying Lists - 5 different methods
    // ✅ Comparing Lists - equals() vs ==
    // ✅ List to Array - Conversion methods
    // ✅ Array to List - Multiple approaches
    // ✅ Sublist - Creating sublists
    // ✅ Shuffling - Collections.shuffle()
    // ✅ Rotating - Collections.rotate()
    // ✅ Swapping - Collections.swap()
    // ✅ Filling - Collections.fill()
    // ✅ Frequency - Collections.frequency()
    // ✅ Disjoint Check - Common elements
    // ✅ Replace All - Collections.replaceAll()
    // ✅ Synchronization - Thread-safe lists
    // ✅ Immutable Lists - Multiple methods
    // ✅ Stream Operations - Filter, map, reduce
    // ✅ Partitioning - Partition by predicate
    // ✅ Grouping - Group by criteria
    // ✅ Distinct - Remove duplicates
    // ✅ Limit & Skip - Pagination
    // ✅ Matching - anyMatch, allMatch, noneMatch
    // ✅ Joining - String concatenation
    // ✅ FlatMap - Flattening nested lists
    // ✅ Collection Conversion - To Set, Map
    // ✅ Method Parameters - Pass by reference
    // ✅ Returning Lists - From methods
    // ✅ Varargs - Variable arguments
    // ✅ Custom Objects - List of user-defined classes
    // ✅ Common Pitfalls - Error scenarios
    // ✅ Performance - Time complexity
    // ✅ Important Notes - 20 key points

    public static void main(String[] args) {

        // ==================== WHAT IS LIST? ====================
        /*
         * List is an INTERFACE in Java Collections Framework
         * It represents an ordered collection (sequence)
         * Common implementations: ArrayList, LinkedList, Vector, Stack
         * 
         * ArrayList is the most commonly used implementation
         * - Backed by dynamic array
         * - Fast random access (get/set)
         * - Slower insertion/deletion in middle
         * - NOT synchronized (not thread-safe)
         */

        // ==================== IMPORTING ====================
        // import java.util.ArrayList; // For ArrayList
        // import java.util.List; // For List interface
        // import java.util.*; // For all utilities

        // ==================== DECLARATION ====================

        // Method 1: Using ArrayList type (concrete class)
        ArrayList<String> list1 = new ArrayList<String>();

        // Method 2: Using List interface (preferred - programming to interface)
        List<String> list2 = new ArrayList<>(); // Diamond operator (Java 7+)

        // Method 3: With initial capacity
        List<Integer> list3 = new ArrayList<>(20); // Initial capacity of 20

        // Method 4: Different data types
        List<Integer> numbers = new ArrayList<>(); // Integer list
        List<String> names = new ArrayList<>(); // String list
        List<Double> prices = new ArrayList<>(); // Double list
        List<Boolean> flags = new ArrayList<>(); // Boolean list

        // Method 5: Creating from existing collection
        List<String> original = new ArrayList<>();
        original.add("A");
        original.add("B");
        List<String> copy = new ArrayList<>(original); // Copy constructor

        // ==================== INITIALIZATION ====================

        // Method 1: Add elements one by one
        List<String> cities = new ArrayList<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");

        // Method 2: Arrays.asList() - Creates FIXED-SIZE list
        List<String> colors = Arrays.asList("Red", "Green", "Blue");
        // Note: Cannot add/remove, but can modify elements
        // colors.add("Yellow"); // Throws UnsupportedOperationException
        colors.set(0, "Orange"); // This works

        // Method 3: List.of() - Creates IMMUTABLE list (Java 9+)
        List<String> fruits = List.of("Apple", "Banana", "Orange");
        // fruits.add("Mango"); // Throws UnsupportedOperationException
        // fruits.set(0, "Grapes"); // Throws UnsupportedOperationException

        // Method 4: Double brace initialization (anonymous inner class)
        List<Integer> nums = new ArrayList<>() {
            {
                add(10);
                add(20);
                add(30);
            }
        };

        // Method 5: Using Collections.addAll()
        List<String> animals = new ArrayList<>();
        Collections.addAll(animals, "Dog", "Cat", "Elephant", "Lion");

        // Method 6: Using Stream (Java 8+)
        List<Integer> streamList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // ==================== ADDING ELEMENTS ====================

        List<String> items = new ArrayList<>();

        // Add at end
        items.add("First"); // [First]
        items.add("Second"); // [First, Second]
        items.add("Third"); // [First, Second, Third]

        // Add at specific index
        items.add(1, "Middle"); // [First, Middle, Second, Third]

        // Add at beginning
        items.add(0, "Start"); // [Start, First, Middle, Second, Third]

        // Add multiple elements using addAll()
        List<String> moreItems = new ArrayList<>();
        moreItems.add("Fourth");
        moreItems.add("Fifth");
        items.addAll(moreItems); // Adds at end

        // Add multiple at specific index
        List<String> insertItems = Arrays.asList("X", "Y");
        items.addAll(2, insertItems); // Inserts at index 2

        System.out.println("After adding: " + items);

        // ==================== ACCESSING ELEMENTS ====================

        List<String> students = new ArrayList<>(
                Arrays.asList("Alice", "Bob", "Charlie", "Diana"));

        // Get element by index
        String first = students.get(0); // "Alice"
        String third = students.get(2); // "Charlie"
        String last = students.get(students.size() - 1); // "Diana"

        System.out.println("\nFirst: " + first);
        System.out.println("Third: " + third);
        System.out.println("Last: " + last);

        // Check if element exists
        boolean hasAlice = students.contains("Alice"); // true
        boolean hasJohn = students.contains("John"); // false

        System.out.println("Has Alice: " + hasAlice);
        System.out.println("Has John: " + hasJohn);

        // Find index of element
        int indexOfBob = students.indexOf("Bob"); // 1
        int indexOfMissing = students.indexOf("John"); // -1 (not found)

        System.out.println("Index of Bob: " + indexOfBob);
        System.out.println("Index of John: " + indexOfMissing);

        // Last index of element (useful for duplicates)
        List<String> duplicates = new ArrayList<>(
                Arrays.asList("A", "B", "A", "C", "A"));
        int firstA = duplicates.indexOf("A"); // 0
        int lastA = duplicates.lastIndexOf("A"); // 4

        System.out.println("First A at: " + firstA);
        System.out.println("Last A at: " + lastA);

        // ==================== MODIFYING ELEMENTS ====================

        List<Integer> values = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        // Replace element at index
        values.set(1, 25); // Changes 20 to 25
        values.set(4, 55); // Changes 50 to 55

        System.out.println("\nAfter modification: " + values);

        // Modify all elements using replaceAll() (Java 8+)
        List<Integer> multiply = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        multiply.replaceAll(n -> n * 2); // Doubles each element
        System.out.println("After replaceAll: " + multiply); // [2, 4, 6, 8, 10]

        // ==================== REMOVING ELEMENTS ====================

        List<String> removeList = new ArrayList<>(
                Arrays.asList("A", "B", "C", "D", "E"));

        // Remove by index
        String removed = removeList.remove(2); // Removes "C", returns removed element
        System.out.println("\nRemoved: " + removed);
        System.out.println("After remove by index: " + removeList);

        // Remove by object
        boolean wasRemoved = removeList.remove("B"); // Returns true if removed
        System.out.println("Was B removed: " + wasRemoved);
        System.out.println("After remove by object: " + removeList);

        // Remove first occurrence
        List<String> dup = new ArrayList<>(Arrays.asList("X", "Y", "X", "Z"));
        dup.remove("X"); // Removes first "X" only
        System.out.println("After removing first X: " + dup); // [Y, X, Z]

        // Remove all elements from another collection
        List<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> toRemove = Arrays.asList(2, 4, 6);
        numList.removeAll(toRemove);
        System.out.println("After removeAll: " + numList); // [1, 3, 5]

        // Retain only elements from another collection
        List<Integer> retainList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> toRetain = Arrays.asList(2, 3, 4);
        retainList.retainAll(toRetain);
        System.out.println("After retainAll: " + retainList); // [2, 3, 4]

        // Remove using Predicate (Java 8+)
        List<Integer> filterList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        filterList.removeIf(n -> n % 2 == 0); // Remove even numbers
        System.out.println("After removeIf (evens): " + filterList); // [1, 3, 5, 7]

        // Clear all elements
        List<String> clearList = new ArrayList<>(Arrays.asList("A", "B", "C"));
        clearList.clear();
        System.out.println("After clear: " + clearList); // []

        // ==================== SIZE AND CAPACITY ====================

        List<String> sizeList = new ArrayList<>();

        // Check if empty
        boolean isEmpty = sizeList.isEmpty(); // true
        System.out.println("\nIs empty: " + isEmpty);

        // Get size
        sizeList.add("One");
        sizeList.add("Two");
        sizeList.add("Three");
        int size = sizeList.size(); // 3
        System.out.println("Size: " + size);

        // ArrayList specific: ensureCapacity (optimization)
        ArrayList<Integer> capacityList = new ArrayList<>();
        capacityList.ensureCapacity(100); // Pre-allocate space for 100 elements

        // ArrayList specific: trimToSize (reduce memory)
        ArrayList<Integer> trimList = new ArrayList<>(100);
        trimList.add(1);
        trimList.add(2);
        trimList.trimToSize(); // Reduce capacity to current size

        // ==================== ITERATING THROUGH LIST ====================

        List<String> iterList = new ArrayList<>(
                Arrays.asList("Apple", "Banana", "Cherry", "Date"));

        // Method 1: Traditional for loop (use when you need index)
        System.out.println("\nUsing traditional for loop:");
        for (int i = 0; i < iterList.size(); i++) {
            System.out.println("Index " + i + ": " + iterList.get(i));
        }

        // Method 2: Enhanced for loop / for-each
        System.out.println("\nUsing enhanced for loop:");
        for (String fruit : iterList) {
            System.out.println(fruit);
        }

        // Method 3: Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = iterList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            // Can safely remove during iteration
            // if (element.equals("Banana")) iterator.remove();
        }

        // Method 4: ListIterator (bidirectional)
        System.out.println("\nUsing ListIterator (forward):");
        ListIterator<String> listIterator = iterList.listIterator();
        while (listIterator.hasNext()) {
            int index = listIterator.nextIndex();
            String element = listIterator.next();
            System.out.println("Index " + index + ": " + element);
        }

        // ListIterator backward
        System.out.println("\nUsing ListIterator (backward):");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println(element);
        }

        // Method 5: forEach() method with lambda (Java 8+)
        System.out.println("\nUsing forEach with lambda:");
        iterList.forEach(fruit -> System.out.println(fruit));

        // Method 6: forEach() with method reference (Java 8+)
        System.out.println("\nUsing forEach with method reference:");
        iterList.forEach(System.out::println);

        // Method 7: Stream forEach (Java 8+)
        System.out.println("\nUsing Stream forEach:");
        iterList.stream().forEach(System.out::println);

        // Method 8: Reverse iteration
        System.out.println("\nReverse iteration:");
        for (int i = iterList.size() - 1; i >= 0; i--) {
            System.out.println(iterList.get(i));
        }

        // ==================== SEARCHING IN LIST ====================

        List<Integer> searchList = new ArrayList<>(
                Arrays.asList(15, 23, 8, 42, 16, 4, 35));

        // Linear search using contains()
        boolean found = searchList.contains(42);
        System.out.println("\nContains 42: " + found);

        // Find index
        int index = searchList.indexOf(16);
        System.out.println("Index of 16: " + index);

        // Binary search (requires sorted list)
        List<Integer> sortedList = new ArrayList<>(
                Arrays.asList(4, 8, 15, 16, 23, 35, 42));
        int binaryIndex = Collections.binarySearch(sortedList, 23);
        System.out.println("Binary search index of 23: " + binaryIndex);

        // Search using Stream (Java 8+)
        Optional<Integer> firstEven = searchList.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();
        System.out.println("First even number: " + firstEven.orElse(-1));

        // Find all matching elements
        List<Integer> evens = searchList.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("All even numbers: " + evens);

        // ==================== SORTING LIST ====================

        List<Integer> unsorted = new ArrayList<>(
                Arrays.asList(64, 25, 12, 22, 11));

        // Sort in ascending order
        Collections.sort(unsorted);
        System.out.println("\nSorted (ascending): " + unsorted);

        // Sort in descending order
        Collections.sort(unsorted, Collections.reverseOrder());
        System.out.println("Sorted (descending): " + unsorted);

        // Sort using list.sort() with Comparator (Java 8+)
        List<Integer> sortList = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));
        sortList.sort(Comparator.naturalOrder());
        System.out.println("Sorted using list.sort(): " + sortList);

        // Sort strings
        List<String> stringList = new ArrayList<>(
                Arrays.asList("Zebra", "Apple", "Mango", "Banana"));
        Collections.sort(stringList);
        System.out.println("Sorted strings: " + stringList);

        // Case-insensitive sorting
        List<String> caseList = new ArrayList<>(
                Arrays.asList("banana", "Apple", "MANGO", "cherry"));
        Collections.sort(caseList, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Case-insensitive sort: " + caseList);

        // Custom sorting with lambda
        List<String> customSort = new ArrayList<>(
                Arrays.asList("Apple", "Kiwi", "Banana", "Fig"));
        customSort.sort((s1, s2) -> s1.length() - s2.length()); // Sort by length
        System.out.println("Sorted by length: " + customSort);

        // Sort using Stream (Java 8+)
        List<Integer> streamSorted = searchList.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Stream sorted: " + streamSorted);

        // ==================== REVERSING LIST ====================

        List<String> reverseList = new ArrayList<>(
                Arrays.asList("A", "B", "C", "D", "E"));

        // Reverse using Collections.reverse()
        Collections.reverse(reverseList);
        System.out.println("\nReversed list: " + reverseList);

        // Reverse using Stream (Java 8+) - creates new list
        List<Integer> original2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> reversed = new ArrayList<>();
        for (int i = original2.size() - 1; i >= 0; i--) {
            reversed.add(original2.get(i));
        }
        System.out.println("Reversed copy: " + reversed);

        // ==================== FINDING MIN AND MAX ====================

        List<Integer> minMaxList = new ArrayList<>(
                Arrays.asList(34, 12, 89, 5, 67, 23));

        // Using Collections
        int min = Collections.min(minMaxList);
        int max = Collections.max(minMaxList);

        System.out.println("\nMin value: " + min);
        System.out.println("Max value: " + max);

        // Using Stream (Java 8+)
        Optional<Integer> minStream = minMaxList.stream().min(Integer::compareTo);
        Optional<Integer> maxStream = minMaxList.stream().max(Integer::compareTo);

        System.out.println("Min (Stream): " + minStream.orElse(null));
        System.out.println("Max (Stream): " + maxStream.orElse(null));

        // For strings
        List<String> words = Arrays.asList("Apple", "Zebra", "Mango", "Banana");
        String minWord = Collections.min(words);
        String maxWord = Collections.max(words);
        System.out.println("Min word: " + minWord); // Apple
        System.out.println("Max word: " + maxWord); // Zebra

        // ==================== CALCULATING SUM AND AVERAGE ====================

        List<Integer> numsList = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50));

        // Using traditional loop
        int sum = 0;
        for (int num : numsList) {
            sum += num;
        }
        double average = (double) sum / numsList.size();

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);

        // Using Stream (Java 8+)
        int streamSum = numsList.stream().mapToInt(Integer::intValue).sum();
        double streamAvg = numsList.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        System.out.println("Sum (Stream): " + streamSum);
        System.out.println("Average (Stream): " + streamAvg);

        // ==================== COPYING LISTS ====================

        List<String> originalList = new ArrayList<>(
                Arrays.asList("X", "Y", "Z"));

        // Method 1: Constructor
        List<String> copy1 = new ArrayList<>(originalList);

        // Method 2: addAll()
        List<String> copy2 = new ArrayList<>();
        copy2.addAll(originalList);

        // Method 3: Collections.copy() - destination must be large enough
        List<String> copy3 = new ArrayList<>(Arrays.asList(new String[originalList.size()]));
        Collections.copy(copy3, originalList);

        // Method 4: Stream (Java 8+)
        List<String> copy4 = originalList.stream().collect(Collectors.toList());

        // Method 5: Java 10+ - List.copyOf() creates immutable copy
        List<String> immutableCopy = List.copyOf(originalList);

        // WARNING: Simple assignment creates reference, not copy
        List<String> notACopy = originalList; // Both point to same list
        notACopy.add("W"); // This modifies original too!

        System.out.println("\nOriginal modified: " + originalList);

        // ==================== COMPARING LISTS ====================

        List<Integer> list1Cmp = Arrays.asList(1, 2, 3);
        List<Integer> list2Cmp = Arrays.asList(1, 2, 3);
        List<Integer> list3Cmp = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list4Cmp = Arrays.asList(3, 2, 1);

        // Using equals() - compares content and order
        boolean equal1 = list1Cmp.equals(list2Cmp); // true
        boolean equal2 = list1Cmp.equals(list3Cmp); // true
        boolean equal3 = list1Cmp.equals(list4Cmp); // false (different order)

        System.out.println("\nlist1 equals list2: " + equal1);
        System.out.println("list1 equals list3: " + equal2);
        System.out.println("list1 equals list4: " + equal3);

        // Using == compares references
        boolean sameRef = (list1Cmp == list2Cmp); // false (different objects)
        System.out.println("list1 == list2: " + sameRef);

        // ==================== CONVERTING LIST TO ARRAY ====================

        List<String> strList = new ArrayList<>(
                Arrays.asList("One", "Two", "Three"));

        // Method 1: toArray() - returns Object[]
        Object[] objArray = strList.toArray();

        // Method 2: toArray(T[] array) - returns typed array
        String[] strArray = strList.toArray(new String[0]);
        // Or specify size: new String[strList.size()]

        System.out.println("\nConverted to array: " + Arrays.toString(strArray));

        // For primitive types, use Stream (Java 8+)
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        int[] intArray = intList.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Converted to int[]: " + Arrays.toString(intArray));

        // ==================== CONVERTING ARRAY TO LIST ====================

        String[] array = { "A", "B", "C" };

        // Method 1: Arrays.asList() - fixed size
        List<String> fixedList = Arrays.asList(array);

        // Method 2: new ArrayList<>(Arrays.asList()) - mutable
        List<String> mutableList = new ArrayList<>(Arrays.asList(array));

        // Method 3: Collections.addAll()
        List<String> addAllList = new ArrayList<>();
        Collections.addAll(addAllList, array);

        // Method 4: Stream (Java 8+)
        List<String> streamList2 = Arrays.stream(array).collect(Collectors.toList());

        // For primitive arrays
        int[] primitiveArray = { 1, 2, 3, 4, 5 };
        List<Integer> fromPrimitive = Arrays.stream(primitiveArray)
                .boxed() // Convert int to Integer
                .collect(Collectors.toList());

        System.out.println("\nFrom primitive array: " + fromPrimitive);

        // ==================== SUBLIST ====================

        List<String> fullList = new ArrayList<>(
                Arrays.asList("A", "B", "C", "D", "E", "F"));

        // Get sublist (fromIndex inclusive, toIndex exclusive)
        List<String> subList = fullList.subList(1, 4); // [B, C, D]
        System.out.println("\nSublist [1, 4): " + subList);

        // WARNING: Sublist is a VIEW, not a copy
        // Modifying sublist affects original
        subList.set(0, "X");
        System.out.println("After modifying sublist: " + fullList); // [A, X, C, D, E, F]

        // Create independent copy of sublist
        List<String> independentSub = new ArrayList<>(fullList.subList(1, 4));

        // ==================== SHUFFLING LIST ====================

        List<Integer> shuffleList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("\nBefore shuffle: " + shuffleList);
        Collections.shuffle(shuffleList);
        System.out.println("After shuffle: " + shuffleList);

        // Shuffle with custom Random
        Collections.shuffle(shuffleList, new Random(42)); // Seed for reproducibility

        // ==================== ROTATING LIST ====================

        List<String> rotateList = new ArrayList<>(
                Arrays.asList("A", "B", "C", "D", "E"));

        System.out.println("\nBefore rotation: " + rotateList);
        Collections.rotate(rotateList, 2); // Rotate right by 2
        System.out.println("After rotate 2: " + rotateList); // [D, E, A, B, C]

        Collections.rotate(rotateList, -2); // Rotate left by 2
        System.out.println("After rotate -2: " + rotateList); // [A, B, C, D, E]

        // ==================== SWAPPING ELEMENTS ====================

        List<String> swapList = new ArrayList<>(
                Arrays.asList("First", "Second", "Third", "Fourth"));

        System.out.println("\nBefore swap: " + swapList);
        Collections.swap(swapList, 0, 3); // Swap index 0 and 3
        System.out.println("After swap: " + swapList);

        // ==================== FILLING LIST ====================

        List<String> fillList = new ArrayList<>(
                Arrays.asList("A", "B", "C", "D", "E"));

        System.out.println("\nBefore fill: " + fillList);
        Collections.fill(fillList, "X");
        System.out.println("After fill: " + fillList); // [X, X, X, X, X]

        // ==================== FREQUENCY COUNT ====================

        List<String> freqList = new ArrayList<>(
                Arrays.asList("A", "B", "A", "C", "A", "B", "D"));

        int countA = Collections.frequency(freqList, "A");
        int countB = Collections.frequency(freqList, "B");

        System.out.println("\nFrequency of A: " + countA); // 3
        System.out.println("Frequency of B: " + countB); // 2

        // ==================== DISJOINT CHECK ====================

        List<Integer> set1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> set2 = Arrays.asList(5, 6, 7, 8);
        List<Integer> set3 = Arrays.asList(3, 4, 5, 6);

        boolean disjoint1 = Collections.disjoint(set1, set2); // true (no common)
        boolean disjoint2 = Collections.disjoint(set1, set3); // false (3,4 common)

        System.out.println("\nset1 and set2 disjoint: " + disjoint1);
        System.out.println("set1 and set3 disjoint: " + disjoint2);

        // ==================== REPLACE ALL OCCURRENCES ====================

        List<String> replaceList = new ArrayList<>(
                Arrays.asList("A", "B", "A", "C", "A"));

        System.out.println("\nBefore replaceAll: " + replaceList);
        Collections.replaceAll(replaceList, "A", "Z");
        System.out.println("After replaceAll: " + replaceList); // [Z, B, Z, C, Z]

        // ==================== SYNCHRONIZATION ====================
        // ArrayList is NOT thread-safe

        // Create synchronized list
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());

        // Must synchronize when iterating
        synchronized (syncList) {
            for (String s : syncList) {
                System.out.println(s);
            }
        }

        // Alternative: Use CopyOnWriteArrayList for thread-safety
        List<String> threadSafeList = new java.util.concurrent.CopyOnWriteArrayList<>();

        // ==================== IMMUTABLE LISTS ====================

        // Using Collections.unmodifiableList()
        List<String> mutable = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String> immutable1 = Collections.unmodifiableList(mutable);
        // immutable1.add("D"); // Throws UnsupportedOperationException

        // Using List.of() (Java 9+)
        List<String> immutable2 = List.of("X", "Y", "Z");
        // immutable2.add("W"); // Throws UnsupportedOperationException

        // Using List.copyOf() (Java 10+)
        List<String> immutable3 = List.copyOf(mutable);

        System.out.println("\nImmutable list: " + immutable2);

        // ==================== FILTERING WITH STREAMS ====================

        List<Integer> filterNums = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Filter even numbers
        List<Integer> evenNumbers = filterNums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("\nEven numbers: " + evenNumbers);

        // Filter and map
        List<Integer> doubled = filterNums.stream()
                .filter(n -> n > 5)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("Filtered and doubled: " + doubled);

        // ==================== MAPPING WITH STREAMS ====================

        List<String> upperList = Arrays.asList("apple", "banana", "cherry");

        // Convert to uppercase
        List<String> upperCased = upperList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("\nUppercased: " + upperCased);

        // Get lengths
        List<Integer> lengths = upperList.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("Lengths: " + lengths);

        // ==================== REDUCING WITH STREAMS ====================

        List<Integer> reduceList = Arrays.asList(1, 2, 3, 4, 5);

        // Sum using reduce
        int sumReduce = reduceList.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("\nSum using reduce: " + sumReduce);

        // Product
        int product = reduceList.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Product: " + product);

        // ==================== PARTITIONING ====================

        List<Integer> partList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Partition into even and odd
        Map<Boolean, List<Integer>> partitioned = partList.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("\nEven partition: " + partitioned.get(true));
        System.out.println("Odd partition: " + partitioned.get(false));

        // ==================== GROUPING ====================

        List<String> groupList = Arrays.asList(
                "Apple", "Banana", "Apricot", "Blueberry", "Cherry", "Avocado");

        // Group by first letter
        Map<Character, List<String>> grouped = groupList.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println("\nGrouped by first letter:");
        grouped.forEach((key, value) -> System.out.println(key + ": " + value));

        // ==================== DISTINCT ELEMENTS ====================

        List<Integer> withDuplicates = new ArrayList<>(
                Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4));

        // Get distinct elements
        List<Integer> distinct = withDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("\nDistinct elements: " + distinct);

        // ==================== LIMIT AND SKIP ====================

        List<Integer> range = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Get first 5 elements
        List<Integer> first5 = range.stream()
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("\nFirst 5: " + first5);

        // Skip first 5 elements
        List<Integer> skip5 = range.stream()
                .skip(5)
                .collect(Collectors.toList());

        System.out.println("Skip 5: " + skip5);

        // Pagination: skip 3, take 4
        List<Integer> page = range.stream()
                .skip(3)
                .limit(4)
                .collect(Collectors.toList());

        System.out.println("Pagination (skip 3, limit 4): " + page);

        // ==================== ANYAMATCH, ALLMATCH, NONEMATCH ====================

        List<Integer> matchList = Arrays.asList(2, 4, 6, 8, 10);

        boolean anyEven = matchList.stream().anyMatch(n -> n % 2 == 0); // true
        boolean allEven = matchList.stream().allMatch(n -> n % 2 == 0); // true
        boolean noneOdd = matchList.stream().noneMatch(n -> n % 2 != 0); // true

        System.out.println("\nAny even: " + anyEven);
        System.out.println("All even: " + allEven);
        System.out.println("None odd: " + noneOdd);

        // ==================== JOINING STRINGS ====================

        List<String> joinList = Arrays.asList("Java", "Python", "JavaScript");

        // Join with comma
        String joined = String.join(", ", joinList);
        System.out.println("\nJoined: " + joined);

        // Using Stream
        String streamJoined = joinList.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Stream joined: " + streamJoined);

        // With prefix and suffix
        String formatted = joinList.stream()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("Formatted: " + formatted);

        // ==================== FLATMAP ====================

        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9));

        // Flatten nested list
        List<Integer> flattened = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("\nFlattened: " + flattened);

        // ==================== CONVERTING TO OTHER COLLECTIONS ====================

        List<String> convList = Arrays.asList("A", "B", "C", "A", "B");

        // To Set (removes duplicates)
        Set<String> set = new HashSet<>(convList);
        System.out.println("\nConverted to Set: " + set);

        // To LinkedHashSet (maintains order, removes duplicates)
        Set<String> linkedSet = new LinkedHashSet<>(convList);
        System.out.println("Converted to LinkedHashSet: " + linkedSet);

        // To TreeSet (sorted, no duplicates)
        Set<String> treeSet = new TreeSet<>(convList);
        System.out.println("Converted to TreeSet: " + treeSet);

        // ==================== LIST AS METHOD PARAMETER ====================

        List<Integer> paramList = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println("\nBefore method: " + paramList);
        modifyList(paramList);
        System.out.println("After method: " + paramList); // Modified!

        // ==================== RETURNING LIST FROM METHOD ====================

        List<Integer> returnedList = createList(5, 10);
        System.out.println("\nReturned list: " + returnedList);

        // ==================== VARARGS WITH LIST ====================

        List<String> varargsList = createListFromVarargs("X", "Y", "Z");
        System.out.println("\nVarargs list: " + varargsList);

        // ==================== COMMON PITFALLS ====================

        System.out.println("\n=== Common Pitfalls ===");

        // 1. ConcurrentModificationException
        try {
            List<Integer> concurrentList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
            for (Integer num : concurrentList) {
                if (num == 3) {
                    // concurrentList.remove(num); // Throws ConcurrentModificationException
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getClass().getSimpleName());
        }

        // Solution: Use Iterator.remove() or removeIf()
        List<Integer> safeRemove = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        safeRemove.removeIf(n -> n == 3); // Safe removal

        // 2. Arrays.asList() returns fixed-size list
        try {
            List<String> fixed = Arrays.asList("A", "B", "C");
            // fixed.add("D"); // Throws UnsupportedOperationException
        } catch (Exception e) {
            System.out.println("Error: " + e.getClass().getSimpleName());
        }

        // 3. IndexOutOfBoundsException
        try {
            List<String> bounds = new ArrayList<>(Arrays.asList("A", "B", "C"));
            String invalid = bounds.get(5); // Index out of bounds
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 4. NullPointerException
        try {
            List<String> nullList = null;
            int size1 = nullList.size(); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot access null list");
        }

        // 5. Modifying during iteration
        List<Integer> iterModify = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        // Use iterator for safe removal
        Iterator<Integer> it = iterModify.iterator();
        while (it.hasNext()) {
            if (it.next() == 3) {
                it.remove(); // Safe
            }
        }

        // ==================== PERFORMANCE CONSIDERATIONS ====================
        /*
         * ArrayList:
         * - get(index): O(1) - fast random access
         * - add(element): O(1) amortized - fast append
         * - add(index, element): O(n) - slow insertion in middle
         * - remove(index): O(n) - slow removal
         * - contains(element): O(n) - linear search
         * 
         * Use ArrayList when:
         * - Frequent random access (get/set)
         * - Adding elements at end
         * - Memory efficient
         * 
         * Use LinkedList when:
         * - Frequent insertions/deletions in middle
         * - No random access needed
         * 
         * Use Vector when:
         * - Thread-safety required (synchronized)
         * - Legacy code compatibility
         */

        // ==================== IMPORTANT NOTES ====================
        /*
         * 1. List is an interface; ArrayList is implementation
         * 2. ArrayList is backed by dynamic array
         * 3. ArrayList is NOT thread-safe (use Collections.synchronizedList())
         * 4. Default initial capacity: 10
         * 5. Grows by 50% when capacity exceeded
         * 6. Allows null elements
         * 7. Maintains insertion order
         * 8. Allows duplicate elements
         * 9. Index starts from 0
         * 10. Use generics to ensure type safety
         * 11. Arrays.asList() creates fixed-size list
         * 12. List.of() creates immutable list (Java 9+)
         * 13. ConcurrentModificationException during iteration if modified
         * 14. Use Iterator.remove() for safe removal during iteration
         * 15. Stream operations don't modify original list (functional approach)
         * 16. For primitive types, use wrapper classes (Integer, Double, etc.)
         * 17. equals() compares content and order
         * 18. Sublist is a view, not independent copy
         * 19. trimToSize() reduces capacity to current size
         * 20. For better performance with many insertions, use LinkedList
         */
    }

    // ==================== HELPER METHODS ====================

    /**
     * Method that modifies list (pass by reference)
     */
    static void modifyList(List<Integer> list) {
        list.add(100); // Modifies original list
        if (!list.isEmpty()) {
            list.set(0, 999);
        }
    }

    /**
     * Method that returns a new list
     */
    static List<Integer> createList(int size, int value) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            newList.add(value);
        }
        return newList;
    }

    /**
     * Method using varargs
     */
    static List<String> createListFromVarargs(String... elements) {
        return new ArrayList<>(Arrays.asList(elements));
    }

    /**
     * Custom class for demonstrating list of objects
     */
    static class Student {
        String name;
        int age;
        double grade;

        public Student(String name, int age, double grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return String.format("Student{name='%s', age=%d, grade=%.2f}",
                    name, age, grade);
        }

        // equals() and hashCode() should be overridden for proper comparison
        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Student student = (Student) o;
            return age == student.age &&
                    Double.compare(student.grade, grade) == 0 &&
                    Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, grade);
        }
    }

    /**
     * Demonstrate list of custom objects
     */
    static void demonstrateCustomObjects() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 20, 85.5));
        students.add(new Student("Bob", 22, 90.0));
        students.add(new Student("Charlie", 21, 78.3));

        System.out.println("\n=== List of Custom Objects ===");

        // Print all students
        students.forEach(System.out::println);

        // Sort by grade
        students.sort((s1, s2) -> Double.compare(s2.grade, s1.grade));
        System.out.println("\nSorted by grade (descending):");
        students.forEach(System.out::println);

        // Filter students with grade > 80
        List<Student> topStudents = students.stream()
                .filter(s -> s.grade > 80)
                .collect(Collectors.toList());

        System.out.println("\nTop students (grade > 80):");
        topStudents.forEach(System.out::println);

        // Get average grade
        double avgGrade = students.stream()
                .mapToDouble(s -> s.grade)
                .average()
                .orElse(0.0);

        System.out.println("\nAverage grade: " + avgGrade);
    }
}