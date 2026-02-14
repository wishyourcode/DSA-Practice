package striver_sheet.slidingwindow;

import java.util.Scanner;

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
