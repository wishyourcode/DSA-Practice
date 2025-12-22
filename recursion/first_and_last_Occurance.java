package recursion;

public class first_and_last_Occurance {
    public static int first = -1;
    public static int last = -1;

    public static void main(String[] args) {
        String str = "aasasdakala";
        find_Occurance(str, 0, 'a');
    }

    public static void find_Occurance(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.print(first + " ");
            System.out.print(last);
            return;
        }
        if (str.charAt(idx) == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        find_Occurance(str, idx + 1, element);
    }
}
