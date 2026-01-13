import java.util.Arrays;

public class Swap_Alternative {
    public static void main(String[] args) {
        int arr[] = { 9, 3, 6, 12, 4, 32 };
        swapAlternate(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swapAlternate(int arr[]) {
        int i = 0;
        int n = arr.length;
        while (i < n) {
            if (i + 1 < n) {
                swap(arr, i, i + 1);
                i += 2;
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}