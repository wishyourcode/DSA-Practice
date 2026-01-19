import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array_By_Recursive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        reverse(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
        input.close();

    }

    public static void reverse(int[] arr, int start, int end) {
        if (start >= end)
            return; // Base Case

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start + 1, end - 1); // Tail-recursive style
    }

}