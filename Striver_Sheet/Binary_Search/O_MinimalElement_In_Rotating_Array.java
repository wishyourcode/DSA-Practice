package Striver_Sheet.Binary_Search;

public class O_MinimalElement_In_Rotating_Array {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 1, 2 };
        int ans = smallestElement(nums);
        System.out.println(ans);
    }

    public static int smallestElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return arr[start];
    }
}
