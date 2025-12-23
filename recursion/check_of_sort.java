package recursion;

public class check_of_sort {
    public static int start = 0;
    public static boolean sorted;

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5 };
        System.out.println(Is_sort(arr, 0));
    }

    public static boolean Is_sort(int[] arr, int start) {
        if (start == arr.length - 1) {
            return true;
        }
        if (arr[start] > arr[start + 1]) {
            return false;
        }
        return Is_sort(arr, start + 1);
    }
}
