package recursion;

public class reverseString {
    public static void main(String[] args) {
        String str = "vishal";
        printrev(str, str.length() - 1);
    }

    private static void printrev(String str, int index) {
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printrev(str, index - 1);
    }

}
