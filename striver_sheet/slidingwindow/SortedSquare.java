package striver_sheet.slidingwindow;

import java.util.Arrays;

public class SortedSquare {
    public static void main(String[] args) {
        int[] nums = { -4, -1, 2, 0, 10 };
        int[] ans = sortedSquares(nums);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int[] result = new int[n];
        int pos = n - 1;
        while (left <= right) {
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];
            if (leftsq > rightsq) {
                result[pos] = leftsq;
                left++;
            } else {
                result[pos] = rightsq;
                right--;
            }
            pos--;
        }
        return result;
    }
}
