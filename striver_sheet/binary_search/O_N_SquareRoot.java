package striver_sheet.binary_search;

public class O_N_SquareRoot {
    public static void main(String[] args) {
        int ans = NSquareRoot(3, 125);
        System.out.println(ans);
    }

    public static int NSquareRoot(int n, int m) {
        int start = 0;
        int end = m;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (pow(mid, n) == m) {
                return mid;
            }
            if (pow(mid, n) > m) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int pow(int mid, int n) {
        int ans = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                ans = ans * mid;
                n = n - 1;
            } else {
                mid = mid * mid;
                n = n / 2;
            }
        }
        return ans;
    }
}
