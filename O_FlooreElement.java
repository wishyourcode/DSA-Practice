public class O_FlooreElement {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 4, 7, 8, 10 };
        int ans = floorElement(arr, 9);
        System.out.println(ans);
    }

    public static int floorElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return arr[end];
    }
}
