import java.util.Arrays;

public class O_N_Left_Rotate_Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int d = 6;
        int n = arr.length;
        rotate(arr, d, n);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int d, int n) {
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
