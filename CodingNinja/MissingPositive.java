public class MissingPositive {
    public static int firstMissing(int[] arr, int n) {
        int i = 0;

        // Place each number at its correct position
        while (i < n) {
            int correctIndex = arr[i] - 1;

            if (arr[i] > 0 && arr[i] <= n && arr[i] != arr[correctIndex]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

        // Find the first index where value is incorrect
        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, -1, 3, 4 };
        int n = arr.length;
        System.out.println(firstMissing(arr, n));
    }
}
