package array;

import java.util.Arrays;

// Square of a sorted array
public class SortedSquareArray {
    public static int[] sortedSquare(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];

            int j = i;
            while (j > 0 && nums[j] < nums[j - 1]) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
                j--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { -4, -1, 2, 0, 10 };
        int[] ans = sortedSquare(nums);
        System.out.println(Arrays.toString(ans));
    }
}
