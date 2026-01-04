public class B_Count_SubArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
        int ans = countSubArray(arr, 3);
        System.out.println(ans);
    }

    // Function to count the number of subarrays with sum equal to k
    public static int countSubArray(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
