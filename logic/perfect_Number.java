package logic;

/**
 * Checks whether a given number is a perfect number.
 * 
 * A perfect number is a positive integer that is equal to the sum of its
 * proper positive divisors (divisors excluding the number itself).
 * 
 * For example:
 * - 6 is a perfect number because 1 + 2 + 3 = 6
 */
public class perfect_Number {
    public static void main(String[] args) {
        int[] arr = { 6, 20, 28, 48 };
        perfectNumber(arr);
    }

    public static void perfectNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 1; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    sum += j;
                }
            }
            if (sum == arr[i]) {
                System.out.println(arr[i] + " : is Perfect Number");
            }
        }
    }
}
