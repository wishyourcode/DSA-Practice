package hashset;

import java.util.HashSet;

public class Contains_Duplicates {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if (nums.length == set.size()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Contains_Duplicates obj = new Contains_Duplicates();
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(obj.containsDuplicate(nums));
    }
}
