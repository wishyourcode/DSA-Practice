package array;

import java.util.Arrays;

public class duplicate_Zeros {
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;

        // Count zeros that can be duplicated
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }

        int i = n - 1;
        int j = n + zeros - 1;

        // Traverse from the end
        while (i >= 0) {
            if (j < n) {
                arr[j] = arr[i];
            }

            if (arr[i] == 0) {
                j--;
                if (j < n) {
                    arr[j] = 0;
                }
            }

            i--;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
