public class uniqueElement {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 6, 3, 6, 2 };
        int ans = findUnique(arr);
        System.out.println(ans);
    }

    public static int findUnique(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {// 1122334
            ans ^= arr[i];
        }
        return ans;
    }
}
