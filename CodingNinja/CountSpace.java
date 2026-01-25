import java.util.Scanner;

public class CountSpace {
    public static int countWords(String input) {
        int n = input.length();
        if (n == 0) {
            return 0;
        }
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (input.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int output = countWords(input);
        System.out.println(output);
        sc.close();
    }
}