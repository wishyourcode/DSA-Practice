public class O_Largest_element {
    public static void main(String[] args) {
        int[] arr = { 0, 1 };
        int ans = largest_element(arr);
        System.out.println(ans);
    }

    private static int largest_element(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
