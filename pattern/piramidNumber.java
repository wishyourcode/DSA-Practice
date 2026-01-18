package pattern;

/*Sample Input 1:
5
Sample Output 1:
           1
          232
         34543
        4567654
       567898765 */
import java.util.Scanner;

public class piramidNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();
        // outer loop
        for (int i = 1; i <= N; i++) {
            // space printing
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            // count print
            for (int k = i; k <= (i * 2) - 1; k++) {
                System.out.print(k);
            }
            for (int k = (i * 2) - 2; k >= i; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
