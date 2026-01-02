package basic_array;

public class Digit_Sum_Till_Single_Digit {
    public static void main(String[] args) {
        int ans = digitsum(12345);
        System.out.println(ans);
    }

    public static int digitsum(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n = n / 10;
            if (n == 0 && sum > 10) {
                n = sum;
                sum = 0;
            }
        }
        return sum;
    }
}
