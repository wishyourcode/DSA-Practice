import java.util.Scanner;

public class ReverseEachWord {

    static String reverseEachWord(String input) {
        char[] arr = input.toCharArray();
        int start = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                reverse(arr, start, i - 1);
                start = i + 1;
            }
        }

        // Reverse last word
        reverse(arr, start, arr.length - 1);
        return new String(arr);
    }

    static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(reverseEachWord(input));
        sc.close();
    }
}
