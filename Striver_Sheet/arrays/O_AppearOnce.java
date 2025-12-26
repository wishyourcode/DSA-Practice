public class O_AppearOnce {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 };
        int ans = Once(arr);
        System.out.println(ans);

    }

    public static int Once(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        return xor;
    }
}
