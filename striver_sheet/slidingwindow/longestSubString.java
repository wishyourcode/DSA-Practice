package striver_sheet.slidingwindow;

import java.util.Arrays;

public class longestSubString {
    public static void main(String[] args) {
        String s = "aaabbbccc";
        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int hashlength = 256;
        // Hash table to store last occurrence of each character
        int[] hash = new int[hashlength];
        // Initialize hash table with -1 (indicating no occurrence)
        Arrays.fill(hash, -1);
        int count = 0;
        int left = 0;
        int right = 0;
        while (right < n) {

            // current character s.charAt(right) return ascii
            int i = s.charAt(right);

            // If current character s.charAt(right) is already in the substring
            if (hash[i] >= 1) {

                // Move left pointer to the right of the last occurrence of s.charAt(right)
                left = Math.max(hash[i] + 1, right);
            }

            // Calculate the current substring length
            int len = right - left + 1;

            // Update maximum length found so far
            count = Math.max(len, count);

            // Store the index of the current character in the hash table
            hash[i] = right;

            // Move right pointer to next position
            right++;
        }
        return count;
    }

}
