package striver_sheet.binary_search;

public class O_Single_Element {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, };
        int ans = singleElement(arr);
        System.out.println(ans);
    }

    public static int singleElement(int[] nums) {
        int left = 0, right = nums.length - 2;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] != nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 2;
            }
        }
        return nums[left];
    }
}
