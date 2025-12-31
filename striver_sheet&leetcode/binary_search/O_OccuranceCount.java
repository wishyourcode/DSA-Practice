package Striver_Sheet.Binary_Search;

public class O_OccuranceCount {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 4, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10 };
        int last = LastOccurance(arr, 9);
        int first = firstOccurance(arr, 9);
        int count = last - first + 1;
        System.out.println(count);
    }

    public static int countOccurance(int[] arr, int target) {
        int count = 0;
        int first = firstOccurance(arr, target);
        System.out.println(first);
        int last = LastOccurance(arr, target);
        System.out.println(last);
        count = last - first + 1;
        return count;
    }

    public static int LastOccurance(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int last = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                last = mid;
                start = mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return last;
    }

    public static int firstOccurance(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int first = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return first;
    }
}
