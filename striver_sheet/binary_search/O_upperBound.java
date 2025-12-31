package striver_sheet.binary_search;

public class O_upperBound {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 15, 19 };
        int ans = upperBound(arr, 15);
        System.out.println(ans);
    }

    public static int upperBound(int[] arr, int target) {
        int ans = arr.length;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start);
            if (arr[mid] > target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
