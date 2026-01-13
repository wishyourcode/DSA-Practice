public class Sum_of_2_n_3_inArray {
    /*
     * Find and return the sum of all elements in an array which are either
     * divisible by 2 or by 3.
     * For example, if the input array is {1, 2, 3, 4, 5, 6}, then the output should
     * be 21 because 2 + 3 + 4 + 6 = 15.
     */
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int sum = findSum(arr);
        System.out.println(sum);
    }

    public static int findSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 || arr[i] % 3 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
