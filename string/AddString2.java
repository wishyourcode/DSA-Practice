package string;

public class AddString2 {
    public static String stringConcatenation(String num1, String num2) {

        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int d1;
            int d2;

            if (i >= 0) {
                d1 = num1.charAt(i) - '0';
            } else {
                d1 = 0;
            }

            if (j >= 0) {
                d2 = num2.charAt(j) - '0';
            } else {
                d2 = 0;
            }

            int sum = d1 + d2 + carry;

            result.insert(0, sum % 10); // insert at beginning
            carry = sum / 10;

            i--;
            j--;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String num1 = "10";
        String num2 = "10";
        String ans = stringConcatenation(num1, num2);
        System.out.println(ans);
    }
}
