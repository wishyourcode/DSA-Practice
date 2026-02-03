package pattern;

/*
n =5
    1
   23
  345
 4567
56789
*/
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // outer loop
        for (int i = 1; i <= n; i++) {
            // space print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            int count = i;
            for (int k = 1; k <= i; k++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
        input.close();
    }

}
