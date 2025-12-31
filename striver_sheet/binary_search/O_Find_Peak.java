package striver_sheet.binary_search;

public class O_Find_Peak {

    public static void main(String[] args) {
        int[] arr = { 1, 10, 13, 7, 6, 5, 4, 3, 2, 1, 0 };
        int ans = findPeak(arr);
        System.out.println(ans);
    }

    public static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            }
            if (arr[mid] > arr[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}