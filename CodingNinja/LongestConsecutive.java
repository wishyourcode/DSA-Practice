import java.util.HashSet;

public class LongestConsecutive {

    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(arr[i]);
        }
        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currectnum = num;
                int count = 1;
                while (set.contains(currectnum)) {
                    currectnum++;
                    count++;

                }
                longest = Math.max(count, longest);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 5, 4, 9, 10, 10, 6 };
        System.out.println(lengthOfLongestConsecutiveSequence(arr, 5));
    }
}