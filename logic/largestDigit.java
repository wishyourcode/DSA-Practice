package logic;

public class largestDigit {
    public static int findLargestDigit(int num) {
        int ans = -1;
        while (num != 0) {
            int rem = num % 10;
            if (rem > ans) {
                ans = rem;
            }
            num = num / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findLargestDigit(123456789));
    }
}
