package striver_sheet.binary_search;

public class O_Single_Element {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
        int ans = singleElement(arr);
        System.out.println(ans);
    }

    public static int singleElement(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return -1;
        }
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        }
        int start = 0;
        int end = n - 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                return arr[mid];
            }
            if (mid % 2 == 1 && arr[mid - 1] == arr[mid] || mid % 2 == 0 && arr[mid] == arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
