package method;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to print: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            input.close();
            return;
        }

        System.out.println("First " + n + " Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNumber(i) + " ");
        }
        System.out.println();
        input.close();
    }

    public static int fibonacciNumber(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }
}
