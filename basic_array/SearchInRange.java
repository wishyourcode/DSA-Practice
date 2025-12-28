package basic_array;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 18, 12, -7, 3, 14, 28 };
        int target = -7;
        int start = 1;
        int end = 4;
        boolean prersent = search(arr, target, start, end);
        if (prersent) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    static boolean search(int[] arr, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (target == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
