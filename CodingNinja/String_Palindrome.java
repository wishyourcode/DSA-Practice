public class String_Palindrome {
    /*
     * You are given a string 'S'. Your task is to check whether the string is
     * palindrome or not. For checking palindrome, consider alphabets and numbers
     * only and ignore the symbols and whitespaces.
     * 
     * Note :
     * 
     * String 'S' is NOT case sensitive.
     * Example :
     * 
     * Let S = “c1 O$d@eeD o1c”.
     * If we ignore the special characters, whitespaces and convert all uppercase
     * letters to lowercase, we get S = “c1odeedo1c”, which is a palindrome. Hence,
     * the given string is also a palindrome.
     */

    public static boolean isPalindrome(String S) {
        // Convert to lowercase and remove non-alphanumeric characters
        String filtered = S.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the filtered string is equal to its reverse
        int left = 0, right = filtered.length() - 1;
        while (left < right) {
            if (filtered.charAt(left) != filtered.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String S = "c1 O$d@eeD o1c";

        if (isPalindrome(S)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
