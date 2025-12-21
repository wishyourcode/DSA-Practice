package leetcode;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 5 };
        /*
         * int n = arr.length + 1;
         * int total = (n * ((n + 1) / 2));
         * int sum = 0;
         * for (int i = 0; i < n - 1; i++) {
         * sum += arr[i];
         * }
         * int result = (total - sum);
         * System.out.println("Missing number is :" + result);
         */
        int sum = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            sum = sum + i;
            sum = sum - arr[i];
        }
        System.out.println("Missing number is :" + (sum * -1));
    }
}
