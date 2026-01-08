import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 6, 2, 7, 1, 9, 8, 4 };
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        int end = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = findmin(arr, i, end);
            swap(arr, minIndex, i);
        }
    }

    public static int findmin(int[] arr, int start, int end) {
        int minIndex = start;
        int min = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
