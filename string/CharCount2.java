package string;

import java.util.HashMap;
import java.util.Map;

public class CharCount2 {
    public static void main(String[] args) {
        String name = "VishalMishra";
        countCharInString(name);
    }

    public static void countCharInString(String name) {
        HashMap<Character, Integer> charMap = new HashMap<>();

        // Convert string to lowercase for case-insensitive counting
        String str = name.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (charMap.containsKey(ch)) {
                // If character exists, increase count
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                // If character doesn't exist, add it with count 1
                charMap.put(ch, 1);
            }
        }

        // Print the results
        System.out.println("Character Count in '" + name + "':");
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
