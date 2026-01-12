public class StringUpperChar {
    /*
     * Problem statement
     * You are given a string 'STR'. You have to convert the first alphabet of each
     * word in a string to UPPER CASE.
     * For example:
     * If the given string 'STR' = ”I am a student of the third year” so you have to
     * transform this string to ”I Am A Student Of The Third Year"
     * Note:
     * 'STR' will contains only space and alphabets both uppercase and lowercase.
     * The words will be separated by space.
     */
    public static String convertString(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                String rest = word.substring(1);
                result.append(firstChar).append(rest).append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String str = "I am a student of the third year";
        System.out.println(convertString(str));
    }
}
