public class E_Longest_Consecutive {
    public static void main(String[] args) {
        int[] arr = { 100, 4, 200, 1, 3, 2 };
        int ans = LongestConsecutive(arr);
        System.out.println(ans);

    }

    public static int LongestConsecutive(int[] arr) {
        int n = arr.length;
        // If the array is empty, no sequence exists
        if (arr.length == 0) {
            return 0;
        }
        // Initialize the longest sequence length to 1 (minimum possible)
        int longest = 1;
        for (int i = 0; i < n; i++) {
            // Store the current number
            int x = arr[i];
            // Start sequence length count from 1
            int count = 1;
            // Search for consecutive numbers starting from x + 1
            while (linearSearch(arr, x + 1) == true) {
                // Move to the next consecutive number
                x += 1;
                // Increase the count of the current sequence
                count++;
            }
            // Update the longest sequence length if the current is longer
            longest = Math.max(longest, count);
        }

        return longest;
    }

    public static boolean linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            // If element matches the number, return true
            if (arr[i] == x) {
                return true;
            }
        }
        // Number not found
        return false;
    }
}
