package string;

public class PalindromeString3 {
    public static void main(String[] args) {
        String str1 = "race car";
        String str2 = "hello world";
        String str3 = "a man a plan a canal panama";

        System.out.println("Is '" + str1 + "' palindrome? " + isPalindromeWithSpace(str1));
        System.out.println("Is '" + str2 + "' palindrome? " + isPalindromeWithSpace(str2));
        System.out.println("Is '" + str3 + "' palindrome? " + isPalindromeWithSpace(str3));
    }

    public static boolean isPalindromeWithSpace(String str) {
        // Remove all spaces and convert to lowercase
        String cleaned = str.replaceAll(" ", "").toLowerCase();
        int n = cleaned.length();

        // Use for loop to compare characters from both ends
        for (int i = 0; i < n / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
