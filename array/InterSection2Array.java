package array;

import java.util.HashSet;

/* given two integer arrays, find and return the intersection of the two arrays.
each element in the result should be unique and the result can be in any order.
Example:    
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
*/
public class InterSection2Array {
    public static int[] intersection(int[] arr1, int arr2[]) {
        HashSet<Integer> ans = new HashSet<>();
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr1) {
            if (!seen.contains(num)) {
                seen.add(num);
            }
        }
        for (int num : arr2) {
            if (seen.contains(num)) {
                ans.add(num);
            }
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = (int) ans.toArray()[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 1 };
        int[] arr2 = { 2, 2 };
        int[] result = intersection(arr1, arr2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
