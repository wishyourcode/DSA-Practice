package striver_sheet.binary_search;

public class O_SquareRoot {
    public static void main(String[] args) {
        int ans = SquareRoot(36);
        System.out.println(ans);
    }

    public static int SquareRoot(int n) {
        int start = 1;
        int end = n;
        int ans = 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid <= n) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
                ;
            }
        }
        return ans;
    }
}
