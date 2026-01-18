import java.util.Arrays;

public class moreZero {
    /*
     * You have been given a random integer array/list(ARR) of size N. You have been
     * required to push all the zeros that are present in the array/list to the end
     * of it. Also, make sure to maintain the relative order of the non-zero
     * elements.
     * Note:
     * Change in the input array/list itself. You don't need to return or print the
     * elements.
     * You need to do this in one scan of array only. Don't use extra space.
     */

    public static void pushZerosAtEnd(int[] arr) {
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[pos] = arr[i];
                pos++;
            }
        }
        while (pos < arr.length) {
            arr[pos] = 0;
            pos++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 0, 0, 5, 0, 4, 0 };
        pushZerosAtEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
