public class LongestSubarray {
    /*
     * You are given an array 'a' of size 'n' and an integer 'k'.
     * Find the length of the longest subarray of 'a' whose sum is equal to 'k'.
     * Example :
     * Input: ‘n’ = 7 ‘k’ = 3
     * ‘a’ = [1, 2, 3, 1, 1, 1, 1]
     * Output: 3
     * Explanation: Subarrays whose sum = ‘3’ are:
     * [1, 2], [3], [1, 1, 1] and [1, 1, 1]
     * Here, the length of the longest subarray is 3, which is our final answer.
     */
    public static int longestSubarrayWithSumK(int[] a, long k) {
        int left = 0;
        long sum = 0;
        int maxlen = 0;
        for (int right = 0; right < a.length; right++) {
            sum += a[right];
            while (sum > k) {
                sum -= a[left];
                left++;
            }
            if (sum == k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3 };
        long k = 2;
        int result = longestSubarrayWithSumK(arr, k);
        System.out.println(result);
    }
}
