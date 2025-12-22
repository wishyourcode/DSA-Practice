package recursion;

public class fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        int n = 7;
        fibonacci_series(first, second, n - 2);
    }

    private static void fibonacci_series(int first, int second, int n) {
        if (n == 0) {
            return;
        }
        int c = first + second;
        System.out.println(c);
        fibonacci_series(second, c, n - 1);
    }

}
