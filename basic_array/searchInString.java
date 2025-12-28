package basic_array;

public class searchInString {
    public static void main(String[] args) {
        String name = "Vishal";
        char target = 'a';
        boolean str = search(name, target);
        System.out.println(str);
    }

    static boolean search(String name, char target) {
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
