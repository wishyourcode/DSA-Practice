package array;

import java.util.Arrays;

public class SquareSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int[] ans = new int[n];
        int right = n - 1;
        int k = n - 1;
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                ans[k] = leftSquare;
                left++;
            } else {
                ans[k] = rightSquare;
                right--;
            }
            k--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        int[] ans = sortedSquares(nums);
        System.out.println(Arrays.toString(ans));
    }
}
