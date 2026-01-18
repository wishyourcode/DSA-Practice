public class Search_in_Rotating_Array {
    public static int search(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[low] <= arr[mid]) { ///// [7,6,5,4,2,1, 2, 3]
                if (key >= arr[low] && key < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = low + 1;
                }
            } else {
                if (key <= arr[high] && key > arr[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 1, 2, 3 };
        int ans = search(arr, 6);
        System.out.println(ans);
    }
}
