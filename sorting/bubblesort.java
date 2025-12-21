package sorting;

import java.util.*;

public class bubblesort {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter the size of Array");
        // int n = input.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter the value");
        // for (int i = 0; i < n; i++) {
        // arr[i] = input.nextInt();
        // }
        // input.close();
        int[] arr = { 6, 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(arr));
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[j - 1]) { // 12,32,43,54,56
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }
}
