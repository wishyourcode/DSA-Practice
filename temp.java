import java.util.*;

class temp {
    // Function to find the lower bound index
    public static int lowerBound(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= x) {
                return i; // First index where element >= x
            }
        }
        return arr.length; // If x is greater than all elements
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 15, 19 };
        int ans = lowerBound(arr, 9);
        System.out.println(ans);
    }
}
