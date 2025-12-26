import java.util.Arrays;
import java.util.HashMap;

public class BE_Two_Sum {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 9;
        int[] ans = checkTwoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] checkTwoSum(int[] arr, int number) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = number - arr[i];
            if (map.containsKey(temp)) {
                return new int[] { map.get(temp), i };
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[] { -1, -1 };
    }
}
