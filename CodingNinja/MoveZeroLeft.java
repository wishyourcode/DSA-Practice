import java.util.Arrays;

public class MoveZeroLeft {
    public static void moveZerosToLeft(int[] arr, int n) {
        int pos = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[pos] = arr[i];
                pos--;
            }
        }
        for (int i = pos; i >= 0; i--) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 0, 1 };
        moveZerosToLeft(arr, 5);
        System.out.println(Arrays.toString(arr));
    }
}
