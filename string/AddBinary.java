package string;

public class AddBinary {
    public static String addBinaryString(String a, String b, int n, int m) {
        StringBuilder result = new StringBuilder();
        int i = n - 1;
        int j = m - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {

            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();

    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        int n = a.length();
        int m = b.length();
        String result = addBinaryString(a, b, n, m);
        System.out.println(result);
    }
}