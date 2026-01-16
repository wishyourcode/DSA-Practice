package method;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = input.nextInt();
        boolean ans = isPrime(number);
        if (ans) {
            System.out.println(number + " : is Prime number");
        } else
            System.out.println(number + " : is not prime number");
        input.close();

    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        int n = 2;
        while (n * n <= number) {
            if (number % n == 0) {
                return false;
            }
            n++;
        }
        return true;
    }
}