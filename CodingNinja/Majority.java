public class Majority {
    /*
     * You have been given an array/list 'ARR' consisting of 'N' integers. Your task
     * is to find the majority element in the array. If there is no majority element
     * present, print -1.
     * 
     * Note:
     * A majority element is an element that occurs more than floor('N' / 2) times
     * in the array.
     */
    public static int findMajority(int[] arr, int n) {
        int ans = arr[0];
        int count = 0;

        // Step 1: Find candidate
        for (int i = 0; i < n; i++) {
            if (arr[i] == ans) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                ans = arr[i];
                count = 1;
            }
        }

        // Step 2: Verify candidate
        int freq = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ans) {
                freq++;
            }
        }

        if (freq > n / 2) {
            return ans;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2 };
        int n = arr.length;
        int majorityElement = findMajority(arr, n);
        System.out.println("The majority element is: " + majorityElement); // Output: 2
    }
}
