package striver_sheet.slidingwindow;

import java.util.Arrays;

/* Given a string s, find the length of the longest substring without duplicate characters. */
public class longestSubString {
    public static void main(String[] args) {
        String s = "aaabbbccc";
        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] temp = new int[256];
        Arrays.fill(temp, -1);

        int left = 0;
        int right = 0;
        int maxLen = 0;

        while (right < n) {
            int ch = s.charAt(right);

            // If character already exists in current window
            if (temp[ch] >= left) {
                left = temp[ch] + 1;
            }

            temp[ch] = right;
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }

}
