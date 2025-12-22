package leetcode;

import java.util.Arrays;

public class setmismatch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 5 };
        int[] ans = searchnumber(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchnumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // 1,2,3,
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] { arr[index], index + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    static void swap(int[] arr, int value, int correctindex) {
        int temp = arr[value];
        arr[value] = arr[correctindex];
        arr[correctindex] = temp;
    }
}
