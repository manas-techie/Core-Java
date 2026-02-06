
public class Array2DBasicsGuide {
    // ✅ Declaration & Initialization - Multiple methods
    // ✅ Jagged Arrays - Different column sizes per row
    // ✅ Dimensions & Length - Rows and columns
    // ✅ Accessing & Modifying - 2D indexing
    // ✅ Default Values - For different data types
    // ✅ Iteration - Nested loops, enhanced loops, patterns
    // ✅ Traversal Patterns - Row-wise, column-wise, reverse
    // ✅ Copying - Deep copy vs shallow copy
    // ✅ Comparing - deepEquals() usage
    // ✅ Searching - Linear and optimized search
    // ✅ Min/Max Finding - With position tracking
    // ✅ Sum & Average - Total, row-wise, column-wise
    // ✅ Matrix Operations - Addition, subtraction, multiplication, scalar
    // ✅ Transpose - Row-column conversion
    // ✅ Rotation - 90-degree clockwise
    // ✅ Diagonal Operations - Main and secondary diagonals
    // ✅ Identity Matrix - Creation
    // ✅ Symmetric Matrix - Checking symmetry
    // ✅ Spiral Traversal - Advanced pattern
    // ✅ Filling - Various filling techniques
    // ✅ String Conversion - toString() and deepToString()
    // ✅ Sorting - Row sorting and custom sorting
    // ✅ Flattening - 2D to 1D conversion
    // ✅ Converting - 1D to 2D conversion
    // ✅ Method Parameters - Pass by reference
    // ✅ Returning Arrays - From methods
    // ✅ Varargs - Variable-length arguments
    // ✅ Common Pitfalls - Error handling
    // ✅ Practical Examples - Real-world usage
    // ✅ Important Notes - Key concepts summary

    public static void main(String[] args) {

        // ==================== 2D ARRAY DECLARATION ====================
        // 2D arrays are "arrays of arrays" - think of them as tables/matrices
        // Syntax: dataType[][] arrayName; OR dataType arrayName[][];

        int[][] matrix; // Preferred way - 2D integer array
        String grid[][]; // Alternative syntax
        double[][] table; // 2D double array
        boolean[][] flags; // 2D boolean array

        // ==================== 2D ARRAY INITIALIZATION ====================

        // Method 1: Declaration and memory allocation separately
        // Creates a 3x4 matrix (3 rows, 4 columns)
        matrix = new int[3][4];

        // Method 2: Declaration and initialization in one line
        int[][] numbers = new int[5][5]; // 5x5 matrix

        // Method 3: Array literal - declare and initialize with values
        int[][] scores = {
                { 85, 90, 78 }, // Row 0 - 3 elements
                { 92, 88, 95 }, // Row 1 - 3 elements
                { 76, 82, 89 } // Row 2 - 3 elements
        }; // 3x3 matrix

        // Method 4: Different initialization styles
        int[][] data = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Method 5: Row by row initialization
        int[][] custom = new int[3][3];
        custom[0] = new int[] { 10, 20, 30 };
        custom[1] = new int[] { 40, 50, 60 };
        custom[2] = new int[] { 70, 80, 90 };

        // ==================== JAGGED ARRAYS ====================
        // Arrays where each row can have different number of columns

        // Declare rows first, then initialize each row separately
        int[][] jagged = new int[3][]; // 3 rows, columns not specified

        jagged[0] = new int[2]; // Row 0 has 2 columns
        jagged[1] = new int[4]; // Row 1 has 4 columns
        jagged[2] = new int[3]; // Row 2 has 3 columns

        // Jagged array with initialization
        int[][] jagged2 = {
                { 1, 2 }, // Row 0 - 2 elements
                { 3, 4, 5, 6 }, // Row 1 - 4 elements
                { 7, 8, 9 } // Row 2 - 3 elements
        };

        System.out.println("Jagged array structure:");
        System.out.println("Row 0 length: " + jagged2[0].length); // 2
        System.out.println("Row 1 length: " + jagged2[1].length); // 4
        System.out.println("Row 2 length: " + jagged2[2].length); // 3

        // ==================== ARRAY DIMENSIONS AND LENGTH ====================

        int[][] rect = new int[4][5]; // 4 rows, 5 columns

        System.out.println("\nArray dimensions:");
        System.out.println("Number of rows: " + rect.length); // 4
        System.out.println("Columns in row 0: " + rect[0].length); // 5
        System.out.println("Columns in row 2: " + rect[2].length); // 5

        // For jagged arrays, each row can have different length
        System.out.println("\nJagged array dimensions:");
        for (int i = 0; i < jagged2.length; i++) {
            System.out.println("Row " + i + " has " + jagged2[i].length + " columns");
        }

        // ==================== ACCESSING 2D ARRAY ELEMENTS ====================
        // Syntax: arrayName[rowIndex][columnIndex]
        // Both indices start from 0

        int[][] marks = {
                { 85, 90, 78, 92 },
                { 88, 76, 95, 82 },
                { 91, 87, 84, 89 }
        };

        System.out.println("\nAccessing elements:");
        System.out.println("Element at [0][0]: " + marks[0][0]); // 85
        System.out.println("Element at [1][2]: " + marks[1][2]); // 95
        System.out.println("Element at [2][3]: " + marks[2][3]); // 89

        // Last element in 2D array
        int lastRow = marks.length - 1;
        int lastCol = marks[lastRow].length - 1;
        System.out.println("Last element: " + marks[lastRow][lastCol]); // 89

        // ==================== MODIFYING 2D ARRAY ELEMENTS ====================

        marks[0][1] = 100; // Change row 0, column 1 from 90 to 100
        marks[2][0] = 95; // Change row 2, column 0 from 91 to 95

        // ==================== DEFAULT VALUES ====================

        int[][] defaultInts = new int[2][3]; // All elements = 0
        double[][] defaultDoubles = new double[2][3]; // All elements = 0.0
        boolean[][] defaultBools = new boolean[2][3]; // All elements = false
        String[][] defaultStrings = new String[2][3]; // All elements = null

        System.out.println("\nDefault values:");
        System.out.println("Default int: " + defaultInts[0][0]); // 0
        System.out.println("Default double: " + defaultDoubles[0][0]); // 0.0
        System.out.println("Default boolean: " + defaultBools[0][0]); // false
        System.out.println("Default String: " + defaultStrings[0][0]); // null

        // ==================== ITERATING THROUGH 2D ARRAYS ====================

        int[][] values = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };

        // Method 1: Nested for loops (traditional - use when you need indices)
        System.out.println("\nUsing nested for loops:");
        for (int i = 0; i < values.length; i++) { // Iterate rows
            for (int j = 0; j < values[i].length; j++) { // Iterate columns
                System.out.print(values[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        // Method 2: Enhanced for loops / for-each (use when you only need values)
        System.out.println("\nUsing enhanced for loops:");
        for (int[] row : values) { // Each row is a 1D array
            for (int element : row) { // Each element in the row
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Method 3: Mixed approach
        System.out.println("\nMixed approach:");
        for (int i = 0; i < values.length; i++) {
            for (int element : values[i]) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Method 4: Row-wise iteration only
        System.out.println("\nRow-wise iteration:");
        for (int[] row : values) {
            System.out.println("Row: " + java.util.Arrays.toString(row));
        }

        // ==================== TRAVERSING SPECIAL PATTERNS ====================

        int[][] specialMatrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        // Row-wise traversal (left to right, top to bottom)
        System.out.println("\nRow-wise traversal:");
        for (int i = 0; i < specialMatrix.length; i++) {
            for (int j = 0; j < specialMatrix[i].length; j++) {
                System.out.print(specialMatrix[i][j] + " ");
            }
        }
        System.out.println();

        // Column-wise traversal (top to bottom, left to right)
        System.out.println("\nColumn-wise traversal:");
        for (int j = 0; j < specialMatrix[0].length; j++) { // Iterate columns
            for (int i = 0; i < specialMatrix.length; i++) { // Iterate rows
                System.out.print(specialMatrix[i][j] + " ");
            }
        }
        System.out.println();

        // Reverse row order
        System.out.println("\nReverse row order:");
        for (int i = specialMatrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < specialMatrix[i].length; j++) {
                System.out.print(specialMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // ==================== COPYING 2D ARRAYS ====================

        int[][] original = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Method 1: Deep copy using loops (safest method)
        int[][] deepCopy = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            deepCopy[i] = new int[original[i].length];
            for (int j = 0; j < original[i].length; j++) {
                deepCopy[i][j] = original[i][j];
            }
        }

        // Method 2: Using System.arraycopy for each row
        int[][] deepCopy2 = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            deepCopy2[i] = new int[original[i].length];
            System.arraycopy(original[i], 0, deepCopy2[i], 0, original[i].length);
        }

        // Method 3: Using Arrays.copyOf for each row
        int[][] deepCopy3 = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            deepCopy3[i] = java.util.Arrays.copyOf(original[i], original[i].length);
        }

        // Method 4: Using clone for each row
        int[][] deepCopy4 = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            deepCopy4[i] = original[i].clone();
        }

        // WARNING: Shallow copy only copies row references
        int[][] shallowCopy = original.clone(); // Rows still point to original data
        shallowCopy[0][0] = 999; // This WILL modify original!
        System.out.println("\nOriginal after shallow copy modification: " + original[0][0]); // 999

        // Deep copy doesn't affect original
        deepCopy[0][0] = 100;
        System.out.println("Original remains: " + original[0][0]); // Still 999 (from shallow copy)

        // Reset for further examples
        original[0][0] = 1;

        // ==================== COMPARING 2D ARRAYS ====================

        int[][] arr1 = { { 1, 2 }, { 3, 4 } };
        int[][] arr2 = { { 1, 2 }, { 3, 4 } };
        int[][] arr3 = arr1;

        // Using == compares references, not content
        System.out.println("\narr1 == arr2: " + (arr1 == arr2)); // false
        System.out.println("arr1 == arr3: " + (arr1 == arr3)); // true

        // Arrays.equals() only compares first level (shallow comparison)
        System.out.println("Arrays.equals(arr1, arr2): " +
                java.util.Arrays.equals(arr1, arr2)); // false (compares row references)

        // Arrays.deepEquals() compares all elements (deep comparison)
        System.out.println("Arrays.deepEquals(arr1, arr2): " +
                java.util.Arrays.deepEquals(arr1, arr2)); // true

        // ==================== SEARCHING IN 2D ARRAYS ====================

        int[][] searchMatrix = {
                { 15, 23, 8 },
                { 42, 16, 4 },
                { 35, 28, 19 }
        };

        // Linear search in 2D array
        int searchKey = 16;
        int foundRow = -1;
        int foundCol = -1;

        for (int i = 0; i < searchMatrix.length; i++) {
            for (int j = 0; j < searchMatrix[i].length; j++) {
                if (searchMatrix[i][j] == searchKey) {
                    foundRow = i;
                    foundCol = j;
                    break;
                }
            }
            if (foundRow != -1)
                break; // Exit outer loop if found
        }

        System.out.println("\n" + searchKey + " found at position [" +
                foundRow + "][" + foundCol + "]");

        // Search in sorted row-wise matrix (optimized)
        int[][] sortedMatrix = {
                { 1, 3, 5, 7 },
                { 10, 12, 14, 16 },
                { 23, 25, 27, 29 }
        };

        boolean found = searchInSortedRowMatrix(sortedMatrix, 14);
        System.out.println("14 found in sorted matrix: " + found);

        // ==================== FINDING MIN AND MAX ====================

        int[][] dataMatrix = {
                { 34, 12, 89 },
                { 5, 67, 23 },
                { 45, 78, 56 }
        };

        int min = dataMatrix[0][0];
        int max = dataMatrix[0][0];
        int minRow = 0, minCol = 0;
        int maxRow = 0, maxCol = 0;

        for (int i = 0; i < dataMatrix.length; i++) {
            for (int j = 0; j < dataMatrix[i].length; j++) {
                if (dataMatrix[i][j] < min) {
                    min = dataMatrix[i][j];
                    minRow = i;
                    minCol = j;
                }
                if (dataMatrix[i][j] > max) {
                    max = dataMatrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("\nMin value: " + min + " at [" + minRow + "][" + minCol + "]");
        System.out.println("Max value: " + max + " at [" + maxRow + "][" + maxCol + "]");

        // ==================== CALCULATING SUM AND AVERAGE ====================

        int[][] nums = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };

        int totalSum = 0;
        int totalElements = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                totalSum += nums[i][j];
                totalElements++;
            }
        }

        double average = (double) totalSum / totalElements;

        System.out.println("\nTotal sum: " + totalSum); // 450
        System.out.println("Average: " + average); // 50.0

        // Row-wise sum
        System.out.println("\nRow-wise sums:");
        for (int i = 0; i < nums.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < nums[i].length; j++) {
                rowSum += nums[i][j];
            }
            System.out.println("Row " + i + " sum: " + rowSum);
        }

        // Column-wise sum
        System.out.println("\nColumn-wise sums:");
        for (int j = 0; j < nums[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < nums.length; i++) {
                colSum += nums[i][j];
            }
            System.out.println("Column " + j + " sum: " + colSum);
        }

        // ==================== MATRIX OPERATIONS ====================

        // Matrix Addition
        int[][] matA = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] matB = { { 7, 8, 9 }, { 10, 11, 12 } };
        int[][] matSum = addMatrices(matA, matB);

        System.out.println("\nMatrix Addition:");
        printMatrix(matSum);

        // Matrix Subtraction
        int[][] matDiff = subtractMatrices(matA, matB);
        System.out.println("\nMatrix Subtraction:");
        printMatrix(matDiff);

        // Matrix Multiplication
        int[][] matC = { { 1, 2 }, { 3, 4 }, { 5, 6 } }; // 3x2
        int[][] matD = { { 7, 8, 9 }, { 10, 11, 12 } }; // 2x3
        int[][] matProduct = multiplyMatrices(matC, matD);

        System.out.println("\nMatrix Multiplication:");
        printMatrix(matProduct);

        // Scalar multiplication
        int[][] matScalar = scalarMultiply(matA, 3);
        System.out.println("\nScalar Multiplication by 3:");
        printMatrix(matScalar);

        // ==================== TRANSPOSE OF MATRIX ====================

        int[][] matrixToTranspose = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        }; // 2x3 matrix

        int[][] transposed = transposeMatrix(matrixToTranspose);

        System.out.println("\nOriginal Matrix:");
        printMatrix(matrixToTranspose);
        System.out.println("\nTransposed Matrix:");
        printMatrix(transposed);

        // ==================== ROTATING MATRIX ====================

        int[][] squareMatrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("\nOriginal Matrix:");
        printMatrix(squareMatrix);

        int[][] rotated90 = rotate90Clockwise(squareMatrix);
        System.out.println("\nRotated 90° Clockwise:");
        printMatrix(rotated90);

        // ==================== DIAGONAL OPERATIONS ====================

        int[][] diagMatrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Main diagonal sum (top-left to bottom-right)
        int mainDiagSum = 0;
        for (int i = 0; i < diagMatrix.length; i++) {
            mainDiagSum += diagMatrix[i][i];
        }
        System.out.println("\nMain diagonal sum: " + mainDiagSum); // 1+5+9 = 15

        // Secondary diagonal sum (top-right to bottom-left)
        int secDiagSum = 0;
        int n = diagMatrix.length;
        for (int i = 0; i < n; i++) {
            secDiagSum += diagMatrix[i][n - 1 - i];
        }
        System.out.println("Secondary diagonal sum: " + secDiagSum); // 3+5+7 = 15

        // Print diagonal elements
        System.out.println("\nMain diagonal elements:");
        for (int i = 0; i < diagMatrix.length; i++) {
            System.out.print(diagMatrix[i][i] + " ");
        }
        System.out.println();

        // ==================== IDENTITY MATRIX ====================

        int size = 4;
        int[][] identity = createIdentityMatrix(size);

        System.out.println("\nIdentity Matrix (" + size + "x" + size + "):");
        printMatrix(identity);

        // ==================== CHECKING SYMMETRIC MATRIX ====================

        int[][] symMatrix = {
                { 1, 2, 3 },
                { 2, 4, 5 },
                { 3, 5, 6 }
        };

        boolean isSymmetric = isSymmetricMatrix(symMatrix);
        System.out.println("\nIs matrix symmetric? " + isSymmetric);

        // ==================== SPIRAL TRAVERSAL ====================

        int[][] spiralMatrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        System.out.println("\nSpiral traversal:");
        spiralTraversal(spiralMatrix);

        // ==================== FILLING 2D ARRAYS ====================

        int[][] fillMatrix = new int[3][4];

        // Fill entire 2D array with same value
        for (int i = 0; i < fillMatrix.length; i++) {
            java.util.Arrays.fill(fillMatrix[i], 7);
        }

        System.out.println("\nFilled matrix:");
        printMatrix(fillMatrix);

        // Fill with sequential numbers
        int[][] seqMatrix = new int[3][3];
        int counter = 1;
        for (int i = 0; i < seqMatrix.length; i++) {
            for (int j = 0; j < seqMatrix[i].length; j++) {
                seqMatrix[i][j] = counter++;
            }
        }

        System.out.println("\nSequential filled matrix:");
        printMatrix(seqMatrix);

        // ==================== CONVERTING 2D ARRAY TO STRING ====================

        int[][] displayMatrix = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        // Using Arrays.toString() for each row
        System.out.println("\nUsing Arrays.toString():");
        for (int[] row : displayMatrix) {
            System.out.println(java.util.Arrays.toString(row));
        }

        // Using Arrays.deepToString() for entire 2D array
        System.out.println("\nUsing Arrays.deepToString():");
        System.out.println(java.util.Arrays.deepToString(displayMatrix));

        // ==================== SORTING 2D ARRAYS ====================

        int[][] sortMatrix = {
                { 9, 7, 5 },
                { 3, 1, 8 },
                { 6, 4, 2 }
        };

        // Sort each row independently
        System.out.println("\nSorting each row:");
        for (int i = 0; i < sortMatrix.length; i++) {
            java.util.Arrays.sort(sortMatrix[i]);
        }
        printMatrix(sortMatrix);

        // Sort rows based on first column element
        Integer[][] objMatrix = {
                { 9, 7, 5 },
                { 3, 1, 8 },
                { 6, 4, 2 }
        };

        java.util.Arrays.sort(objMatrix, (a, b) -> a[0] - b[0]);
        System.out.println("\nRows sorted by first column:");
        for (Integer[] row : objMatrix) {
            System.out.println(java.util.Arrays.toString(row));
        }

        // ==================== FLATTENING 2D ARRAY TO 1D ====================

        int[][] toFlatten = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Calculate total size
        int totalSize = 0;
        for (int[] row : toFlatten) {
            totalSize += row.length;
        }

        // Create 1D array and fill it
        int[] flattened = new int[totalSize];
        int index = 0;
        for (int[] row : toFlatten) {
            for (int element : row) {
                flattened[index++] = element;
            }
        }

        System.out.println("\nFlattened array:");
        System.out.println(java.util.Arrays.toString(flattened));

        // ==================== CONVERTING 1D TO 2D ARRAY ====================

        int[] oneDArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int rows = 3;
        int cols = 4;

        int[][] converted2D = new int[rows][cols];
        int idx = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                converted2D[i][j] = oneDArray[idx++];
            }
        }

        System.out.println("\nConverted to 2D array:");
        printMatrix(converted2D);

        // ==================== ARRAY AS METHOD PARAMETER ====================
        // 2D arrays are passed by reference

        int[][] modifyTest = { { 1, 2 }, { 3, 4 } };
        System.out.println("\nBefore method call:");
        printMatrix(modifyTest);

        modify2DArray(modifyTest);

        System.out.println("\nAfter method call:");
        printMatrix(modifyTest);

        // ==================== RETURNING 2D ARRAY FROM METHOD ====================

        int[][] returned = create2DArray(3, 3, 5);
        System.out.println("\nReturned 2D array:");
        printMatrix(returned);

        // ==================== VARIABLE-LENGTH ARGUMENTS WITH 2D ====================

        int[][] result = createJaggedArray(
                new int[] { 1, 2 },
                new int[] { 3, 4, 5 },
                new int[] { 6, 7, 8, 9 });

        System.out.println("\nCreated jagged array using varargs:");
        printMatrix(result);

        // ==================== COMMON PITFALLS ====================

        System.out.println("\n=== Common Pitfalls ===");

        // 1. ArrayIndexOutOfBoundsException
        try {
            int[][] test = { { 1, 2 }, { 3, 4 } };
            int invalid = test[2][0]; // Row index out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 2. NullPointerException with jagged arrays
        try {
            int[][] jaggedTest = new int[3][];
            jaggedTest[0] = new int[2];
            int val = jaggedTest[1][0]; // jaggedTest[1] is null
        } catch (NullPointerException e) {
            System.out.println("Error: Row not initialized (null)");
        }

        // 3. Different row lengths in jagged arrays
        int[][] jaggedLen = {
                { 1, 2, 3 },
                { 4, 5 }
        };
        // jaggedLen[0].length is 3, but jaggedLen[1].length is 2
        // Always check row length when iterating

        // ==================== PRACTICAL EXAMPLES ====================

        // Example 1: Student grades (students x subjects)
        String[] students = { "Alice", "Bob", "Charlie" };
        String[] subjects = { "Math", "Science", "English" };
        int[][] grades = {
                { 85, 90, 78 }, // Alice's grades
                { 92, 88, 95 }, // Bob's grades
                { 76, 82, 89 } // Charlie's grades
        };

        System.out.println("\n=== Student Grades ===");
        System.out.print("Student\t\t");
        for (String subject : subjects) {
            System.out.print(subject + "\t");
        }
        System.out.println();

        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + "\t\t");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + "\t");
            }
            System.out.println();
        }

        // Example 2: Tic-Tac-Toe board
        char[][] ticTacToe = {
                { 'X', 'O', 'X' },
                { 'O', 'X', 'O' },
                { 'O', 'X', 'X' }
        };

        System.out.println("\n=== Tic-Tac-Toe Board ===");
        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe[i].length; j++) {
                System.out.print(ticTacToe[i][j]);
                if (j < ticTacToe[i].length - 1)
                    System.out.print(" | ");
            }
            System.out.println();
            if (i < ticTacToe.length - 1)
                System.out.println("---------");
        }

        // ==================== IMPORTANT NOTES ====================
        /*
         * 1. 2D arrays are "arrays of arrays" in Java
         * 2. Memory layout: Each row is a separate object in heap
         * 3. Rectangular arrays: All rows have same number of columns
         * 4. Jagged arrays: Rows can have different number of columns
         * 5. array.length gives number of rows
         * 6. array[i].length gives number of columns in row i
         * 7. Arrays are passed by reference to methods
         * 8. Clone() creates shallow copy (rows still reference original)
         * 9. Use Arrays.deepEquals() to compare 2D array content
         * 10. Use Arrays.deepToString() to print entire 2D array
         * 11. Default values: 0 for numeric, false for boolean, null for objects
         * 12. Always check for null rows in jagged arrays
         * 13. For matrix operations, ensure dimensions are compatible
         * 14. Nested loops: outer for rows, inner for columns
         * 15. For dynamic sizing, use ArrayList<ArrayList<Type>>
         */
    }

    // ==================== HELPER METHODS ====================

    /**
     * Method to print 2D array in matrix format
     */
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Method to add two matrices
     */
    static int[][] addMatrices(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            return null; // Matrices must have same dimensions
        }

        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    /**
     * Method to subtract two matrices
     */
    static int[][] subtractMatrices(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            return null;
        }

        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    /**
     * Method to multiply two matrices
     */
    static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int aRows = a.length;
        int aCols = a[0].length;
        int bRows = b.length;
        int bCols = b[0].length;

        if (aCols != bRows) {
            return null; // Cannot multiply: columns of A must equal rows of B
        }

        int[][] result = new int[aRows][bCols];

        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bCols; j++) {
                for (int k = 0; k < aCols; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    /**
     * Method for scalar multiplication
     */
    static int[][] scalarMultiply(int[][] matrix, int scalar) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j] = matrix[i][j] * scalar;
            }
        }
        return result;
    }

    /**
     * Method to transpose a matrix
     */
    static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    /**
     * Method to rotate matrix 90 degrees clockwise
     */
    static int[][] rotate90Clockwise(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }

        return rotated;
    }

    /**
     * Method to create identity matrix
     */
    static int[][] createIdentityMatrix(int size) {
        int[][] identity = new int[size][size];
        for (int i = 0; i < size; i++) {
            identity[i][i] = 1;
        }
        return identity;
    }

    /**
     * Method to check if matrix is symmetric
     */
    static boolean isSymmetricMatrix(int[][] matrix) {
        int n = matrix.length;

        // Must be square matrix
        if (n != matrix[0].length)
            return false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Method for spiral traversal of matrix
     */
    static void spiralTraversal(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Print top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Print bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Print left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
        System.out.println();
    }

    /**
     * Search in row-wise sorted matrix
     */
    static boolean searchInSortedRowMatrix(int[][] matrix, int key) {
        for (int i = 0; i < matrix.length; i++) {
            int result = java.util.Arrays.binarySearch(matrix[i], key);
            if (result >= 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method that modifies 2D array (demonstrates pass by reference)
     */
    static void modify2DArray(int[][] arr) {
        if (arr.length > 0 && arr[0].length > 0) {
            arr[0][0] = 999; // Modifies original array
        }
    }

    /**
     * Method that returns a new 2D array
     */
    static int[][] create2DArray(int rows, int cols, int value) {
        int[][] newArray = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            java.util.Arrays.fill(newArray[i], value);
        }
        return newArray;
    }

    /**
     * Method using varargs to create jagged array
     */
    static int[][] createJaggedArray(int[]... rows) {
        int[][] jagged = new int[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            jagged[i] = rows[i];
        }
        return jagged;
    }
}