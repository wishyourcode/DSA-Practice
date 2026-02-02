package array;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
/*Given an array nums of integers, return how many of them contain an even number of digits.*/
public class Number_with_Even_Digit {
    public static int findNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int num = arr[i];
            while (num != 0) {
                num = num / 10;
                sum += 1;
            }
            if (sum % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 345, 21, 6, 7896 };
        int ans = findNumbers(arr);
        System.out.println(ans);
    }
}
