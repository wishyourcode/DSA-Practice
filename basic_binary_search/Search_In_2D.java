package basic_binary_search;

class Pair {
    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Search_In_2D {
    /*
     * You are given a 2D matrix of integers 'matrix' and an integer 'target'. The
     * matrix has the following properties:
     * Each row is sorted in non-decreasing order.
     * Each column is sorted in non-decreasing order.
     * Your task is to find the position of 'target' in the matrix. If 'target' is
     * found, return its position as a pair of integers (row, column). If 'target'
     * is not found, return (-1, -1).
     * Example :
     * Input: matrix = [[1, 4, 7], [2, 5, 8], [3, 6, 9]], target = 5
     * Output: (1, 1)
     * Explanation: The target value 5 is located at row index 1 and column index
     * 1 in the matrix.
     */

    public static Pair search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                Pair ans = new Pair(row, col);
                return ans;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return new Pair(-1, -1);
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
        int target = 5;
        Pair result = search(matrix, target);
        System.out.println("(" + result.x + ", " + result.y + ")");
    }
}
