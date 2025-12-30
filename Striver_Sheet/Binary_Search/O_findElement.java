package Striver_Sheet.Binary_Search;

public class O_findElement {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 15, 19 };
        int ans = findElement(arr, 15);
        System.out.println(ans);
    }

    public static int findElement(int[] arr, int target) {
        int n = arr.length; // size of the array
        int low = 0, high = n - 1;

        // Keep searching until low crosses high
        while (low <= high) {
            int mid = (low + high) / 2; // Find the middle index
            if (arr[mid] == target)
                return mid; // Target found
            else if (target > arr[mid])
                low = mid + 1; // Search in right half
            else
                high = mid - 1; // Search in left half
        }
        return -1; // Target not found
    }
}