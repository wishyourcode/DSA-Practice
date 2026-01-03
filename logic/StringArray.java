package logic;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        String[] arr = input();
        print(arr);
    }

    public static void print(String[] arr) {
        System.out.print("Arrays is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static String[] input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the size of the array");
        int n = input.nextInt();
        input.nextLine();
        String[] arr = new String[n];
        System.out.print("Please Enter the element of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextLine();
        }
        input.close();
        return arr;
    }
}
