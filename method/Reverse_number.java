package method;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        int number = input.nextInt();
        int reverse = 0;
        while (number > 0) {
            int temp = number % 10;
            number = number / 10;
            reverse = reverse * 10 + temp;
        }
        System.out.println("Reversed number: " + reverse);
        input.close();
    }
}