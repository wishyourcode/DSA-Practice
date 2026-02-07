import java.util.Arrays;

/* You are given an array 'arr' consisting of 'n' integers 
which denote the position of a stall.
You are also given an integer 'k' which denotes the 
number of aggressive cows.
You are given the task of assigning stalls to 'k' cows 
such that the minimum distance between any two of 
them is the maximum possible.
Print the maximum possible minimum distance.
Example:
Input: 'n' = 3, 'k' = 2 and 'arr' = {1, 2, 3}
Output: 2
Explanation: The maximum possible minimum distance will 
be 2 when 2 cows are placed at positions {1, 3}. Here distance
 between cows is 2.*/
public class AggressiveCow {
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(stalls, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static boolean possible(int[] stalls, int k, int mid) {
        int count = 1;
        int lastcow = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastcow >= mid) {
                count++;
                lastcow = stalls[i];
            }
            if (count >= k) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Input stalls
        int[] stalls = { 1, 2, 8, 4, 9 };
        int cows = 3;
        int result = aggressiveCows(stalls, cows);
        System.out.println(result);
    }
}
