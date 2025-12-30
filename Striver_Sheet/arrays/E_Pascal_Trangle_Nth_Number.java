public class E_Pascal_Trangle_Nth_Number {
    public static void main(String[] args) {
        int n = 10;
        int r = 3;
        int ans = findNthNumber(n, r);
        System.out.println(ans);
    }

    public static int findNthNumber(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;

    }
}
