package arraylist;

import java.util.ArrayList;

public class First_Last_Position {
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int first = firstPosition(arr, n, k);
        if (first == -1) {
            return new int[] { -1, -1 };
        }
        int last = lastPosition(arr, n, k);
        return new int[] { first, last };
    }

    public static int firstPosition(ArrayList<Integer> arr, int n, int k) {
        int low = 0;
        int ans = -1;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == k) {
                ans = mid;
                high = mid - 1;
            } else if (arr.get(mid) < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int lastPosition(ArrayList<Integer> arr, int n, int k) {
        int low = 0;
        int ans = -1;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == k) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        int k = 2;
        int n = arr.size();
        int[] result = firstAndLastPosition(arr, n, k);
        System.out.println("First and Last Position of " + k + ": [" + result[0] + ", " + result[1] + "]");
    }
}
