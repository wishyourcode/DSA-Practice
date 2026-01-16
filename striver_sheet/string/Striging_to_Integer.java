package striver_sheet.string;

public class Striging_to_Integer {
    public static int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        int sign = 1;
        int ans = 0;

        // 1. Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Handle sign
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        // 3. Convert digits
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';

            // 4. Check overflow BEFORE updating ans
            if (ans > Integer.MAX_VALUE / 10 ||
                    (ans == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            ans = ans * 10 + digit;
            i++;
        }

        return ans * sign;
    }

    public static void main(String[] args) {
        String s = "   4243  ";
        int ans = myAtoi(s);
        System.out.println(ans);
    }

}
