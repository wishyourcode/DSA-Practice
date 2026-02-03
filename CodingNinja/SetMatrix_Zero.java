public class SetMatrix_Zero {
    public static void main(String[] args) {
        // hardcode input
        int[][] arr = {
                { 1, 2, 1 },
                { 0, 1, 1 },
                { 1, 1, 1 }
        };
        int[][] result = setmatrixZero(arr);
        // print 2D Array
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] setmatrixZero(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        boolean[] rowZero = new boolean[row];
        boolean[] colZero = new boolean[col];
        // First find zeros
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        // then set the zeros
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rowZero[i] || colZero[j]) {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
}
