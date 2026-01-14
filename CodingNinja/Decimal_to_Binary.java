import java.util.Scanner;

public class Decimal_to_Binary {
    /*
     * Given a decimal number N, convert it into binary and print.
     * 
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();
        String binary = "";
        while (N != 0) {
            int rem = N % 2;
            binary = rem + binary; // prepend
            N = N / 2;
        }

        System.out.println(binary);
    }
}