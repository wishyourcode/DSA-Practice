package arraylist;

import java.util.ArrayList;
import java.util.HashMap;

public class InterSection2Araay {
    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2,
            int m) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num : arr1) {
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        for (int num : arr2) {
            if (seen.containsKey(num) && seen.get(num) > 0) {
                ans.add(num);
                seen.put(num, seen.get(num) - 1);
            }
        }
        if (ans.size() < 1) {
            ans.add(-1);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(2);
        arr1.add(1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(2);
        ArrayList<Integer> result = findArrayIntersection(arr1, arr1.size(), arr2, arr2.size());
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
