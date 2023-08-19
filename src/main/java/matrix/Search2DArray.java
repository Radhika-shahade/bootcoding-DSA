package matrix;

public class Search2DArray {
        public static boolean search2DArray(int[][] matrix, int target) {
            int rows = matrix.length;
            if (rows == 0) {
                return false;
            }

            int columns = matrix[0].length;

            // Start from the top-right corner of the matrix
            int row = 0;
            int col = columns - 1;

            while (row < rows && col >= 0) {
                if (matrix[row][col] == target) {
                    return true;
                } else if (matrix[row][col] > target) {
                    col--; // Move left in the matrix
                } else {
                    row++; // Move down in the matrix
                }
            }

            return false;
        }

        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 3, 5, 7},
                    {10, 11, 16, 20},
                    {23, 30, 34, 60}
            };

            int target = 16;
            System.out.println(search2DArray(matrix, target)); // Output: true

            target = 13;
            System.out.println(search2DArray(matrix, target)); // Output: false
        }
    }


