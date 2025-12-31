package logic;

import java.util.Scanner;

public class optimalFindMinMax {
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
        int[] result = findMinMax(arr);
        System.out.println("Min value in the array is: " + result[0]);
        System.out.println("Max value in the array is: " + result[1]);
    }

    static int[] findMinMax(int[] arr) {
        int n = arr.length;
        int max, min, i;
        if (n % 2 == 0) {
            if (arr[0] > arr[1]) {
                max = arr[0];
                min = arr[1];
            } else {
                max = arr[1];
                min = arr[0];
            }
            i = 2;
        } else {
            // odd length: start with first element as both max and min
            max = arr[0];
            min = arr[0];
            i = 1;
        }
        int m = n - 1;
        while (i <= m - 1) { // process elements in pairs (i, i+1)
            if (arr[i] < arr[i + 1]) {
                if (arr[i] < min)
                    min = arr[i];
                if (arr[i + 1] > max)
                    max = arr[i + 1];
            } else {
                if (arr[i + 1] < min)
                    min = arr[i + 1];
                if (arr[i] > max)
                    max = arr[i];
            }
            i += 2;
        }

        // method signature returns int; return max (or change to return both values)
        return new int[] { min, max };
    }
}
