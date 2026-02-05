package hashset;

import java.util.HashSet;

/* You have been given an integer array/list(ARR) of size N 
which contains numbers from 0 to (N - 2). Each number is present
 at least once. That is, if N = 5, the array/list constitutes
  values ranging from 0 to 3 and among these, there is a single
   integer value that is present twice. You need to find and
    return that duplicate number present in the array.*/
public class find_duplicates {
    public static int duplicateNumber(int nums[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            } else {
                set.add(num);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 3, 1, 2, 3 };
        System.out.println(duplicateNumber(nums));
    }
}
