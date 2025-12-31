public class O_Longest_SubArray {
    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 7, 1, 9 };
        int k = 15;
        int ans = longest_SubArray_with_sum(nums, k);
        System.out.println(ans);
    }

    public static int longest_SubArray_with_sum(int[] arr, int k) {
        int leng = 0;
        int left = 0;
        int sum = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                int temp;
                temp = right - left + 1;
                leng = Math.max(temp, leng);
            }
        }
        return leng;
    }
}
