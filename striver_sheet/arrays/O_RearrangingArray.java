import java.util.Arrays;

public class O_RearrangingArray {
    public static void main(String[] args) {
        int[] arr = { 3, 1, -2, -5, 2, -4 };
        ArrangeArray(arr);

    }

    public static void ArrangeArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int posIndex = 0;
        int negIndex = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans[posIndex] = arr[i];
                posIndex += 2;
            } else {
                ans[negIndex] = arr[i];
                negIndex += 2;
            }
        }
        System.out.println(Arrays.toString(ans));

    }
}
