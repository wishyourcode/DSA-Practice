package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the value :");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
