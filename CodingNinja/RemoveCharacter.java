import java.util.Scanner;

/*
For a given string(str) and a character X, 
write a function to remove all the occurrences of 
X from the given string and return it.
The input string will remain unchanged if the given 
character(X) doesn't exist in the input string. */
public class RemoveCharacter {
    static String removeAllOccurrencesOfChar(String input, char c) {
        char[] arr = new char[input.length()];
        int start = 0;
        int n = input.length();
        for (int i = 0; i < n; i++) {
            if (input.charAt(i) == c) {
                continue;
            }
            arr[start] = input.charAt(i);
            start++;
        }
        return new String(arr, 0, start);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char c = sc.next().charAt(0);
        String ans = removeAllOccurrencesOfChar(input, c);
        System.out.println(ans);
        sc.close();
    }
}
