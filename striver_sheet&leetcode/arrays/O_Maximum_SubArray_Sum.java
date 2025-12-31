
public class O_Maximum_SubArray_Sum {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int ans = Maximum_SubArraySum(arr);
        System.out.println(ans);
    }

    public static int Maximum_SubArraySum(int[] arr) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }

        }
        return max;
    }
}
