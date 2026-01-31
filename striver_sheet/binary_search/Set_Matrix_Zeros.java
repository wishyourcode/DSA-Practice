public class Set_Matrix_Zeros {
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
        int rows = arr.length;
        int cols = arr[0].length;
        boolean[] rowFlag = new boolean[rows];
        boolean[] colFlag = new boolean[cols];
        // First find zeros
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    rowFlag[i] = true;
                    colFlag[j] = true;
                }
            }
        }

        // then set the zeros
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowFlag[i] || colFlag[j]) {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
}
