import java.util.*;

public class ReveseNumber {
    /*
     * Write a program to generate the reverse of a given number N. Print the
     * corresponding reverse number.
     * Note : If a number has trailing zeros, then its reverse will not include
     * them. For e.g., reverse of 10400 will be 401 instead of 00401.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        System.out.println(reverse);
        input.close();
    }
}
