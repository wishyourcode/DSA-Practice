public class B_Missing_Number {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 8, 7 };
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

    public static int missingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }
        return sum;
    }
}
