import java.util.HashSet;

/*You are given an unsorted array/list 'ARR' of 'N' integers. 
Your task is to return the length of the longest consecutive sequence.

The consecutive sequence is in the form ['NUM', 'NUM' + 1, 'NUM' + 2, ..., 'NUM' + L]
 where 'NUM' is the starting integer of the sequence and 'L' + 1 is the length of the sequence.
Note:
If there are any duplicates in the given array we will count
 only one of them in the consecutive sequence.
For example-
For the given 'ARR' [9,5,4,9,10,10,6].
Output = 3
The longest consecutive sequence is [4,5,6].
Follow Up:
Can you solve this in O(N) time and O(N) 
space complexity? */
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
                while (set.contains(currectnum + 1)) {
                    currectnum++;
                    count++;

                }
                longest = Math.max(count, longest);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0 };
        System.out.println(lengthOfLongestConsecutiveSequence(arr, 2));
    }
}