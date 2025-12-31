
import java.util.Arrays;

public class O_TwoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 6, 5, 8, 11 };
        int target = 14;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] twoSum(int[] arr, int number) {
        sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = 0;
            sum = arr[left] + arr[right];
            if (sum == number) {
                return new int[] { left, right };
            }
            if (sum > number) {
                right--;
            } else {
                left++;
            }
        }
        return new int[] { -1, -1 };
    }
}
