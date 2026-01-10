import java.util.Arrays;

public class MoveZero {
    /*
     * Given an array 'arr' of 'n' non-negative integers, your task is to move all
     * the zeros to the end of the array while keeping the non-zero elements at the
     * start of the array in their original order. Return the modified array.
     * Example :
     * Input: ‘n’ = 5, ‘arr’ = [1, 2, 0, 0, 2, 3]
     * Output: [1, 2, 2, 3, 0, 0]
     * Explanation: Moved all the 0’s to the end of an array, and the rest of the
     * elements retain the order at the start.
     */
    public static int[] moveZeros(int n, int[] arr) {
        int[] arr1 = new int[n];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr1[j] = arr[i];
                j++;
            }
        }
        // for (int i = 0; i < arr1.length; i++) {
        // arr[i] = arr1[i];
        // }
        return arr1;
    }

    public static void main(String[] arg) {
        int[] arr = { 1, 2, 2, 3, 0, 0 };
        int ans[] = moveZeros(6, arr);
        System.out.println(Arrays.toString(ans));

    }
}
