package string;

public class PalindromeString2 {
    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "hello";
        String str3 = "madam";

        System.out.println("Is '" + str1 + "' palindrome? " + isPalindromeLoop(str1));
        System.out.println("Is '" + str2 + "' palindrome? " + isPalindromeLoop(str2));
        System.out.println("Is '" + str3 + "' palindrome? " + isPalindromeLoop(str3));
    }

    public static boolean isPalindromeLoop(String str) {
        int n = str.length();

        // Compare characters from both ends using for loop
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
