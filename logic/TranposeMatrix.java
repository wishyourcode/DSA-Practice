package logic;

public class TranposeMatrix {
    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] arr2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
        transpose(arr1);
    }

    public static void transpose(int[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                int temp = arr1[i][j];
                arr1[i][j] = arr1[j][i];
                arr1[j][i] = temp;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
