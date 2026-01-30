package arraylist;

import java.util.ArrayList;

public class Search_in_Rotated_Array {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr.get(mid) == k) {
                return mid;
            }

            // Left half is sorted
            if (arr.get(low) <= arr.get(mid)) {
                if (arr.get(low) <= k && k < arr.get(mid)) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (arr.get(mid) < k && k <= arr.get(high)) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(1);
        arr.add(2);
        int k = 4;
        int n = arr.size();
        int result = search(arr, n, k);
        System.out.println("Element found at index: " + result);
    }
}
