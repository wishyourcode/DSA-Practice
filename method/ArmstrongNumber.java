package method;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println(" Enter the number");
        // int number = input.nextInt();
        int number;
        for (number = 100; number <= 1000; number++) {
            boolean ans = is_ArmstrongNumber(number);
            if (ans) {
                System.out.print(number + " ");
            }
        }
        input.close();
    }

    static boolean is_ArmstrongNumber(int number) {
        int original = number;
        int sum = 0;
        while (number > 0) {
            int rem = number % 10;
            rem = rem * rem * rem;
            sum = sum + rem;
            number = number / 10;
        }
        if (original == sum) {
            return true;
        }
        return false;
    }
}