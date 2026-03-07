package string;

public class ConvertString2 {
    public static String Convert(String str) {
        char[] ch = str.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);
        for (int i = 1; i < ch.length; i++) {
            if (ch[i - 1] == ' ') {
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String str = "radhe radhe radhe radhe";
        String ans = Convert(str);
        System.out.println(ans);
    }
}
