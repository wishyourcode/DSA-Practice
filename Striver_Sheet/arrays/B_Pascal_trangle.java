public class B_Pascal_trangle {
    public static void main(String[] args) {
        PascalTrangle(6);
    }

    public static void PascalTrangle(int n) {
        for (int i = 0; i < n; i++) {
            int ans = 1;
            System.out.print(ans);
            for (int col = 1; col <= i; col++) {
                ans = ans * (i - col + 1);
                ans = ans / (col);
                System.out.print(" " + ans);
            }
            System.out.println();
        }
    }
}
