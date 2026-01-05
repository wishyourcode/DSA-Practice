package logic;

public class twoD_RowSum {
    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] arr2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
        rowSum(arr1);
        System.out.println("===================");
        rowSum(arr2);

    }

    public static void rowSum(int[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr1[i].length; j++) {
                sum = sum + arr1[i][j];
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println(" : " + sum);

        }
    }
}
