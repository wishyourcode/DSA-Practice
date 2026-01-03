package logic;

import java.util.Scanner;

public class DoubleArray {
    public static void main(String[] args) {
        double[] arr = input();
        print(arr);

    }

    public static void print(double[] arr) {
        System.out.print("Arrays is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static double[] input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the size of the array");
        int n = input.nextInt();
        double[] arr = new double[n];
        System.out.println("Please Enter the element of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextDouble();
        }
        input.close();
        return arr;
    }
}
