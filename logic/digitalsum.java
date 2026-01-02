package logic;

import java.util.Scanner;

public class digitalsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = digitsum(n);
        System.out.println(ans);
        input.close();
    }

    public static int digitsum(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        return sum;
    }
}
