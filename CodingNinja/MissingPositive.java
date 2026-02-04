public class MissingPositive {
    /*
     * You are given an array 'ARR' of integers of length N. Your task is to find
     * the first missing positive integer in linear time and constant space. In
     * other words, find the lowest positive integer that does not exist in the
     * array. The array can have negative numbers as well. For example, the input
     * [3, 4, -1, 1] should give output 2 because it is the smallest positive number
     * that is missing in the input array.
     */
    public static int firstMissing(int[] arr, int n) {
        int i = 0;
        while (i < n) {
            int correctIndex = arr[i] - 1;

            if (arr[i] > 0 && arr[i] <= n && arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
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
