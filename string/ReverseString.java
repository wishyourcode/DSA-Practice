package string;

/* Reverse the given string word wise. That is, 
the last word in given string should come at 1st place, 
last second word at 2nd place and so on. Individual words 
should remain as it is.*/
public class ReverseString {

    public static String reverseWordWise(String input) {
        input = input.trim();
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "I love Java programming";
        System.out.println(reverseWordWise(str));
    }
}
