import java.util.ArrayList;
import java.util.Arrays;

public class B_RearrangeArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -4, -5 };
        int[] ans = Rearrange(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] Rearrange(int[] arr) {
        ArrayList<Integer> Positive = new ArrayList<>();
        ArrayList<Integer> Negative = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                Positive.add(arr[i]);
            } else {
                Negative.add(arr[i]);
            }
        }
        for (int i = 0; i < n / 2; i++) {
            arr[2 * i] = Positive.get(i);
            arr[2 * i + 1] = Negative.get(i);
        }
        return arr;
    }
}
