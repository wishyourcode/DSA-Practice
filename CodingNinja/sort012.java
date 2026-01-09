import java.util.Arrays;

public class sort012 {
    /*
     * You have been given an integer array/list(ARR) of size 'N'. It only contains
     * 0s, 1s and 2s. Write a solution to sort this array/list.
     * Note :
     * Try to solve the problem in 'Single Scan'. ' Single Scan' refers to iterating
     * over the array/list just once or to put it in other words, you will be
     * visiting each element in the array/list just once.
     */
    public static void sort(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {

                int temp = arr[low];

                arr[low] = arr[mid];

                arr[mid] = temp;

                low++;

                mid++;

            } else if (arr[mid] == 1) {

                mid++;

            } else {

                int temp2 = arr[mid];

                arr[mid] = arr[high];

                arr[high] = temp2;

                high--;

            }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 2 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
