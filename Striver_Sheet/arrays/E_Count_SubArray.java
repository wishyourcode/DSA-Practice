public class E_Count_SubArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
        int ans = CountSubArrays(arr, 3);
        System.out.println(ans);
    }

    public static int CountSubArrays(int[] arr, int d) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum == d) {
                    count++;
                }
            }
        }
        return count;
    }
}
