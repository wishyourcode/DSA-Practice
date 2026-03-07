package string;

/*You are given a string 'STR'. You have to convert 
the first alphabet of each word in a string to UPPER CASE.
For example:
If the given string 'STR' = ”I am a student of the final year” 
so you have to transform this string to ”I Am A Student Of The Final Year" */
public class ConvertString {
    public static String convertString(String str) {
        StringBuilder result = new StringBuilder();
        result.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ') {
                result.append(Character.toUpperCase(str.charAt(i)));
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "I am final Year student";
        String ans = convertString(str);
        System.out.println(ans);
    }
}
