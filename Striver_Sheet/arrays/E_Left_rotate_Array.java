import java.util.Arrays;

public class E_Left_rotate_Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(" before left Rotation: " + Arrays.toString(arr));
        Left_Rotate(arr);
        System.out.println(" After left Rotation: " + Arrays.toString(arr));
    }

    public static void Left_Rotate(int[] arr) {
        int temp = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }
}
