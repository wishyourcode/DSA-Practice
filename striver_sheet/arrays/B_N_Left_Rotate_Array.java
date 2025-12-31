import java.util.Arrays;

public class B_N_Left_Rotate_Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int d = 1;
        System.out.println(Arrays.toString(arr));
        Rotate(arr, d);
        System.out.println(Arrays.toString(arr));
    }

    public static void Rotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        int index = 0;
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[index];
            index++;
        }
    }
}
