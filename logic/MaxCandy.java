package logic;

import java.util.HashSet;

public class MaxCandy {
    public static int findMaxCandy(int[] arr) {
        int ans = 0;
        HashSet<Integer> count = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            count.add(arr[i]);
        }
        ans = count.size();
        int result = arr.length;
        if (ans < result) {
            return ans;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 5, 6, 6 };
        System.out.println(findMaxCandy(arr));
    }
}
