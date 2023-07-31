package matrix;

public class TransposeArray {
        public static void main(String[] args) {
            // Hardcoded 2D array
            int[][] originalArray = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            // Print the original array
            System.out.println("Original Array:");
            printArray(originalArray);

            // Transpose the array
            int[][] transposedArray = new int[originalArray.length][originalArray.length];
            for (int i = 0; i < originalArray.length; i++) {
                for (int j = 0; j < originalArray[i].length; j++) {
                    transposedArray[j][i] = originalArray[i][j];
                }
            }

            // Print the transposed array
            System.out.println("\nTransposed Array:");
            printArray(transposedArray);
        }

        // Function to print the 2D array
        public static void printArray(int[][] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


