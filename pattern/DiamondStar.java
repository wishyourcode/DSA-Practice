package pattern;

import java.util.Scanner;

/*
          *
         ***
        *****
         ***
          * 
  * */
public class DiamondStar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();

        int mid = N / 2;

        // Upper half (including middle)
        for (int i = 0; i <= mid; i++) {

            // Print spaces
            for (int s = 0; s < mid - i; s++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = mid - 1; i >= 0; i--) {

            // Print spaces
            for (int s = 0; s < mid - i; s++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
