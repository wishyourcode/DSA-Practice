package array;

import java.util.Arrays;

public class Swaping {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int index1 = 2;
        int index2 = 4;
        swaping_number(arr, index1, index2);
        System.out.println(Arrays.toString(arr));
    }

    static void swaping_number(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
