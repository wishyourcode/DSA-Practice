package striver_sheet.binary_search;

import java.util.Arrays;

public class AggressiveCow {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 4, 9 };
        // Number of cows
        int cows = 3;
        int ans = mindistance(arr, cows);
        System.out.println(ans);
    }

    /*
     * You are given an array 'arr' of size 'n' which denotes the position of
     * stalls. You are also given an integer 'k' which denotes the number of
     * aggressive cows.
     * You are given the task of assigning stalls to 'k' cows such that the minimum
     * distance between any two of them is the maximum possible. Find the maximum
     * possible minimum distance.
     */
    public static int mindistance(int[] arr, int cow) {
        Arrays.sort(arr);
        int start = 1;
        int end = arr[arr.length - 1] - arr[0];
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (canPlace(arr, cow, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    // Function to check if cows can be placed with distance d(mid)
    public static boolean canPlace(int[] arr, int cow, int mid) {
        int count = 1;
        int lastpos = arr[0];
        for (int i = 0; i < arr.length; i++) {
            // If stall is at least d away from last placed cow
            if (arr[i] - lastpos >= mid) {
                count++;
                lastpos = arr[i];
            }
            // If all cows are placed successfully
            if (count >= cow) {
                return true;
            }
        }
        return false;
    }
}
