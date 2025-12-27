public class B_Maximum_SubArray_Sum {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int ans = MaxSubArray(nums);
        System.out.println(ans);
    }

    public static int MaxSubArray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
