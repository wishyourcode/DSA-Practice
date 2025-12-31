package striver_sheet.binary_search;

public class O_Insert_Position {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7 };
        int ans = InsertPosition(arr, 6);
        System.out.println(ans);
    }

    public static int InsertPosition(int[] arr, int target) {

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