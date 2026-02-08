public class SmallestDivisor {
    public static int smallestDivisor(int arr[], int limit) {
        for (int i = 1; i < limit; i++) {
            int sum = 0;
            for (int num : arr) {
                sum += Math.ceil((double) num / i);
                if (sum > limit) {
                    break;
                }
            }
            if (sum <= limit) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 27, 30, 9, 37, 44 };
        int limit = 11;
        int result = smallestDivisor(arr, limit);
        System.out.println(result);
    }
}
