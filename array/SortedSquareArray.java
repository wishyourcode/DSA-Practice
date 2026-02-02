package array;

import java.util.Arrays;

// Square of a sorted array
public class SortedSquareArray {
    public static int[] sortedSquare(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        int[] ans = sortedSquare(nums);
        System.out.println(Arrays.toString(ans));
    }
}
