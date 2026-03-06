package string;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        String name = "VishalMishra";
        countCharInString(name);
    }

    public static void countCharInString(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Empty or null string provided");
            return;
        }
        // use a map to store character counts
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : name.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        System.out.println("Character counts for \"" + name + "\":");
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

}
