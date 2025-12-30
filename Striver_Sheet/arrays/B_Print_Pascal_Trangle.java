public class B_Print_Pascal_Trangle {
    public static void main(String[] args) {
        int n = 5;
        PrintPascalTrangle(n);

    }

    // print nth entire row
    public static void PrintPascalTrangle(int n) {
        int ans = 1;
        System.out.print(ans);
        for (int col = 1; col < n; col++) {
            ans = ans * (n - col);
            ans = ans / (col);
            System.out.print(" " + ans);
        }
    }
}
