public class AddString {
    /*
     * Problem statement
     * You are given two non-negative integers, ‘NUM1’ and ‘NUM2’, in the form of
     * strings. Return the sum of both strings.
     * Note :
     * You do not need to print anything, it has already been taken care of. Just
     * implement the given function.
     * Example:
     * Let ‘NUM1’ be: “5”
     * Let ‘NUM2’ be: “21”
     * The sum of both numbers will be: “26”.
     */
    public static String stringConcatenation(String num1, String num2) {
        long a = Long.parseLong(num1);
        long b = Long.parseLong(num2);
        long sum = a + b;
        return Long.toString(sum);
    }

    public static void main(String[] args) {
        String num1 = "5";
        String num2 = "21";
        System.out.println(stringConcatenation(num1, num2));
    }
}
