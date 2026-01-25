import java.util.Scanner;

public class SubString {
    static void printSubstrings(String input) {
        int n = input.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.println(input.substring(i, j + 1));
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printSubstrings(input);
        sc.close();
    }
}
