package sorting;

import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int correctindex = arr[i] - 1;
            if (arr[i] != arr[correctindex]) {
                swap(arr, i, correctindex);
            }
        }
    }

    static void swap(int[] arr, int value, int correctindex) {
        int temp = arr[value];
        arr[value] = arr[correctindex];
        arr[correctindex] = temp;
    }
}
