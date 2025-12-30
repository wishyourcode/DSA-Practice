package Striver_Sheet.Binary_Search;

public class O_ceilElement {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 4, 7, 8, 10 };
        int ans = ceilingElement(arr, 9);
        System.out.println(ans);
    }

    public static int ceilingElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                ans = arr[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
