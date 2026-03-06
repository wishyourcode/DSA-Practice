package string;

import java.util.HashMap;
import java.util.Map;

public class CharCount3 {
    public static void main(String[] args) {

        String name = "VishalMishra";
        countCharInString(name);
        System.out.println();
        findMaxCharFrequency(name);
    }

    public static void countCharInString(String name) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        String str = name.toLowerCase();

        for (char ch : str.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character Count in '" + name + "':");
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void findMaxCharFrequency(String name) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        String str = name.toLowerCase();

        for (char ch : str.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }
    }
}
