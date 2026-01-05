package logic;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD_Sum {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.print("enter the element of the array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        input.close();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
