package recursion;

public class x_power_n {
    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = find_X_power_N(x, n);
        System.out.println(ans);

    }

    public static int find_X_power_N(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int xpower1 = find_X_power_N(x, n - 1);
        int xpower = x * xpower1;
        return xpower;
    }
}
