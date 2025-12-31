import java.util.Arrays;

public class O_Next_permutation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int[] ans = Next_permulation_Number(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] Next_permulation_Number(int[] arr) {
        int n = arr.length;
        int index = -1;
        // Find the first decreasing element from end
        for (int i = n - 2; i >= 0; i--) {
            // If smaller found
            if (arr[i] < arr[i + 1]) {
                // Store index
                index = i;
                break;
            }
        }
        // If no index found
        if (index == -1) {
            // Reverse the entire array
            rev(arr, 0, n - 1);
            return arr;
        }
        // if index found Find just larger element from the index element
        for (int i = n - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                // Swap them
                swap(arr, i, index);
                break;
            }
        }
        // Reverse part after index
        rev(arr, index + 1, n - 1);
        return arr;
    }

    private static void rev(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
