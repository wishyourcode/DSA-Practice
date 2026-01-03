package logic;

import java.util.Scanner;

public class IntArray {
    public static void main(String[] args) {
        int[] arr = input();
        print(arr);
    }

    public static void print(int[] arr) {
        System.out.print("Arrays is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int[] input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the size of the array");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Please Enter the element of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
        return arr;
    }
}
