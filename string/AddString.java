package string;

/*You are given two non-negative integers, 
‘NUM1’ and ‘NUM2’, in the form of strings. 
Return the sum of both strings. */
public class AddString {
    public static String stringConcatenation(String num1, String num2) {
        // Write your code here.
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int sum = n1 + n2;
        return String.valueOf(sum);
    }

    public static void main(String[] args) {
        String num1 = "10";
        String num2 = "10";
        String ans = stringConcatenation(num1, num2);
        System.out.println(ans);
    }
}
