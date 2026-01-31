package logic;

import java.util.Scanner;

public class MysteryNumber {
    public static void main(String[] args) {
        // Dynamic Read for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number to find the number is mystery or not");
        int num = input.nextInt();
        boolean result = isMysteryNumber(num);
        if (result) {
            System.out.println(num + " : Given number is mystery Number");
        } else {
            System.out.println(num + " : Given number is'not mystery Number");
        }
        input.close();
    }

    // check for the mystery number
    public static boolean isMysteryNumber(int num) {
        for (int i = 0; i < num; i++) {
            int reverase = reverse(i);
            if ((reverase + i) == num) {
                return true;
            }
        }
        return false;
    }

    // reverse the number
    public static int reverse(int i) {
        int rev = 0;
        while (i != 0) {
            int digit = i % 10;
            rev = rev * 10 + digit;
            i = i / 10;
        }
        return rev;
    }
}
