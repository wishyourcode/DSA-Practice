package striver_sheet.binary_search;

public class O_How_Many_Times_Rotated {
    public static void main(String[] args) {
        int[] nums = {};
        int ans = TimesRotated(nums);
        System.out.println(ans);
    }

    public static int TimesRotated(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
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
        return end;
    }
}
