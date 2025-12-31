public class B_Longest_SubArray {
    public static void main(String[] args) {
        int[] nums = { -3, 2, 1 };
        int k = 6;
        int ans = Largest_SubArray_sum(nums, k);
        System.out.println(ans);
    }

    public static int Largest_SubArray_sum(int[] arr, int k) {
        int leng = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                int temp = 0;
                if (sum == k) {
                    temp = j - i + 1;
                    leng = Math.max(temp, leng);
                }
            }
        }
        return leng;
    }
}
