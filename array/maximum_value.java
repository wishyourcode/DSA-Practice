package array;

import java.util.Arrays;
import java.util.Scanner;

public class maximum_value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the size of the array");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println(" Enter the number of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("maximun value of the array is: " + max);
        input.close();
    }
}
