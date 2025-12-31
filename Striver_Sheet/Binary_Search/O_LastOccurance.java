package Striver_Sheet.Binary_Search;

import java.util.Arrays;

public class O_LastOccurance {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 4, 7, 7, 7, 7, 7, 7, 7, 8, 10 };
        int[] ans = first_last(arr, 7);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] first_last(int[] arr, int target) {
        int first = FirstOccurance(arr, target);
        int last = LastOccurance(arr, target);
        return new int[] { first, last };

    }

    public static int LastOccurance(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int last = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                last = mid;
                start = mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return last;
    }

    public static int FirstOccurance(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int first = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return first;
    }
}
