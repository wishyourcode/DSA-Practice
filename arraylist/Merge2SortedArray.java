package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Merge2SortedArray {
    public static List<Integer> sortedArray(int[] a, int[] b) {

        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                addIfUnique(ans, a[i]);
                i++;
            } else if (a[i] > b[j]) {
                addIfUnique(ans, b[j]);
                j++;
            } else {
                addIfUnique(ans, a[i]);
                i++;
                j++;
            }
        }

        while (i < a.length) {
            addIfUnique(ans, a[i]);
            i++;
        }

        while (j < b.length) {
            addIfUnique(ans, b[j]);
            j++;
        }

        return ans;
    }

    private static void addIfUnique(List<Integer> ans, int val) {
        if (ans.size() == 0 || ans.get(ans.size() - 1) != val) {
            ans.add(val);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 2, 4, 5 };
        List<Integer> ans = sortedArray(arr1, arr2);
        for (int num : ans) {
            System.out.print(num + " ");
        }

    }
}
