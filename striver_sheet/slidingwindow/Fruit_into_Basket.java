package striver_sheet.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class Fruit_into_Basket {
    public static void main(String[] args) {
        int[] fruits = { 1, 2, 1, 2, 3 };
        System.out.println(maxFruit(fruits)); // Output: 4
    }

    public static int maxFruit(int[] fruits) {
        int left = 0;
        int max = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {

            // 1️⃣ Add current fruit
            addFruit(map, fruits[right]);

            // 2️⃣ Shrink window if more than 2 fruit types
            while (map.size() > 2) {
                removeFruit(map, fruits[left]);
                left++;
            }

            // 3️⃣ Update answer
            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    private static void addFruit(Map<Integer, Integer> map, int fruit) {
        map.put(fruit, map.getOrDefault(fruit, 0) + 1);
    }

    private static void removeFruit(Map<Integer, Integer> map, int fruit) {
        map.put(fruit, map.get(fruit) - 1);
        if (map.get(fruit) == 0) {
            map.remove(fruit);
        }

    }
}
