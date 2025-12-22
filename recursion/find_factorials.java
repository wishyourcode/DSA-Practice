package recursion;

public class find_factorials {
    public static void main(String[] args) {
        int ans = factorials(5);
        System.out.println(ans);
    }

    private static int factorials(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact = factorials(n - 1);
        int fact_n = n * fact;
        return fact_n;
    }
}
