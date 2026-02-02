package striver_sheet.slidingwindow;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/fruit-into-baskets/description/    
/*ou are visiting a farm that has a single row of fruit trees
 arranged from left to right. The trees are represented by an
  integer array fruits where fruits[i] is the type of fruit the
   ith tree produces.
You want to collect as much fruit as possible. However, 
the owner has some strict rules that you must follow:

You only have two baskets, and each basket can only hold 
a single type of fruit. There is no limit on the amount of 
fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly 
one fruit from every tree (including the start tree) while
 moving to the right. The picked fruits must fit in one of your baskets.
Once you reach a tree with fruit that cannot fit in your 
baskets, you must stop.
Given the integer array fruits, return the maximum number of 
fruits you can pick. */
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
