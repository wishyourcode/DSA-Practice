import java.util.Scanner;

public class Binary_to_Decimal {
    /*
     * Given a binary number as an integer N, convert it into decimal and print.
     * 
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int ans = 0;
        int n = 0;
        while (N != 0) {
            int rem = N % 10;
            ans = ans + rem * pow(2, n);
            N = N / 10;
            n++;
        }
        System.out.println(ans);
        input.close();
    }

    public static int pow(int i, int n) {
        int result = 1;
        for (int j = 1; j <= n; j++) {
            result = result * i;
        }
        return result;
    }
}