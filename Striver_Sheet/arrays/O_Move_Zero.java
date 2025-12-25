import java.util.Arrays;

public class O_Move_Zero {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 0, 8, 2, 0, 6, 4, 0, 0, 0, 2, 34, 10, 0 };
        System.out.println(Arrays.toString(arr));
        MoveZero(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void MoveZero(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                index = i;
                break;
            }
        }
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, i, index);
                index++;
            }
        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
