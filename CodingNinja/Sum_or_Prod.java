package CodingNinja;

public class Sum_or_Prod {
    public static void main(String[] args) {
        int n = 17;
        int q = 1;
        long ans = sumOrProduct(n, q);
        System.out.println(ans);
    }

    public static long sumOrProduct(int n, int q) {
        long res = 1;
        if (q == 1) {
            long sum = 0;
            while (n > 0) {
                sum += n;
                n--;
            }
            res = sum;

        }
        if (q == 2) {
            long prod = 1;
            while (n > 0) {
                prod *= n;
                n--;
            }
            res = prod;
        }
        return res;
    }
}
