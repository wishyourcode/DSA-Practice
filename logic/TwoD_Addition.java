package logic;

public class TwoD_Addition {
    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] arr2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
        add(arr1, arr2);
    }

    public static void add(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr2.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
