package logic;

import java.util.ArrayList;
import java.util.List;

public class searchDisapperedNumber {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> ans = searchnumber(arr);
        System.out.println(ans);
    }

    static List<Integer> searchnumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // 1,2,3,
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int value, int correctindex) {
        int temp = arr[value];
        arr[value] = arr[correctindex];
        arr[correctindex] = temp;
    }
}
