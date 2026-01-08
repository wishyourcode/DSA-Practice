public class Ceil_and_Floor {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 7, 8, 10 };
        int n = arr.length;
        int x = 2;
        int[] result = getFloorAndCeil(arr, n, x);
        System.out.println("Floor: " + result[0]);
        System.out.println("Ceil: " + result[1]);
    }

    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int ans = ceil(a, x);
        int ans2 = floor(a, x);
        return new int[] { ans, ans2 };
    }

    public static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target <= arr[mid]) {
                ans = arr[mid];
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return ans;

    }

    public static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target >= arr[mid]) {
                ans = arr[mid];
                start = mid + 1;
            }
        }
        return ans;

    }
}
