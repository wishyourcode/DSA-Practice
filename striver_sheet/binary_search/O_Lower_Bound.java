package striver_sheet.binary_search;

public class O_Lower_Bound {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 15, 19 };
        int ans = lowerbound(arr, 9);
        System.out.println(ans);

    }

    public static int lowerbound(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;
        while (start <= end) {
            int mid = start + (end - start);
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
