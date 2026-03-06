package string;

public class PalindromeString {
    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "hello";
        String str3 = "madam";

        System.out.println("Is '" + str1 + "' palindrome? " + isPalindrome(str1));
        System.out.println("Is '" + str2 + "' palindrome? " + isPalindrome(str2));
        System.out.println("Is '" + str3 + "' palindrome? " + isPalindrome(str3));
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
