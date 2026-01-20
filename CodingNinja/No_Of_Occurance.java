public class No_Of_Occurance {
    public static int count(int arr[], int n, int x) {
        int first = first(arr, n, x);
        if (first == -1) {
            return 0;
        }
        int last = last(arr, n, x);
        int ans = last - first + 1;
        return ans;
    }

    public static int first(int[] arr, int n, int x) {
        int low = 0;
        int high = n;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                ans = mid;
                high = mid - 1;
            }
            if (x < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int last(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                ans = mid;
                low = mid + 1;
            }
            if (x < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5, 5, 6 };
        int first = first(arr, 8, 5);
        System.out.println("first : " + first);
        int last = last(arr, 8, 5);
        System.out.println("last : " + last);
        int ans = count(arr, 8, 5);
        System.out.println("count : " + ans);
    }
}
