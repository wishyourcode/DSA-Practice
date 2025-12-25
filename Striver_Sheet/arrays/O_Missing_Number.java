public class O_Missing_Number {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7 };
        int ans = missNumber(arr);
        System.out.println(ans);
    }

    public static int missNumber(int[] arr) {
        int xorNumber = 0;
        int xorArray = 0;
        int n = arr.length + 1;
        for (int i = 1; i <= n; i++) {
            xorNumber ^= i;
        }
        for (int i = 0; i < arr.length; i++) {
            xorArray = xorArray ^ arr[i];
        }
        return xorArray ^ xorNumber;
    }
}
