package striver_sheet.slidingwindow;

import java.util.Scanner;

/*Given an array of numbers, find the maximum 
sum of any contiguous subarray of the array.
For example, given the array [34, -50, 42, 14, -5, 86], 
the maximum sum would be 137, since we would take elements 
42, 14, -5, and 86.
Given the array [-5, -1, -8, -9], the maximum sum would be -1. */
public class MaxSumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int currentsum = 0;
        int maxsum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentsum += arr[i];
            if (currentsum < 0) {
                currentsum = 0;
            }
            maxsum = Math.max(maxsum, currentsum);
        }
        input.close();
        System.out.println(maxsum);
    }
}
