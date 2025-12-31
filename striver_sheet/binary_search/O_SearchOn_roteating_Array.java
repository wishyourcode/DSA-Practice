package striver_sheet.binary_search;

public class O_SearchOn_roteating_Array {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 0, 1, 2, 3, 4, 5 };
        int target = 0;
        int ans = SearchElement(nums, target);
        System.out.println(ans);
    }

    public static int SearchElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            // If left part is sorted
            if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = start + 1;
                }
            }
            // Else, search in right half
            else {
                if (target <= arr[end] && target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
