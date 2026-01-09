public class PrimeNumber {
    /*
     * A prime number is a positive integer that is divisible by exactly 2 integers,
     * 1 and the number itself.
     * You are given a number 'n'.
     * Find out whether 'n' is prime or not.
     * Example :
     * Input: 'n' = 5
     * Output: YES
     * Explanation: 5 is only divisible by 1 and 5. 2, 3 and 4 do not divide 5.
     */
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 5;
        boolean ans = isPrime(n);
        if (ans) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}