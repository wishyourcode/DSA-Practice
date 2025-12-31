import java.util.ArrayList;
import java.util.Arrays;

public class B_Rearrange_Array {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, -2, -5, -4, 1, 4 };
        int[] ans = Rearrange_array(arr);
        System.out.println(Arrays.toString(ans));
    }

    // if positive and negative are not equal
    public static int[] Rearrange_array(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }
        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }
            int index = neg.size() * 2;
            for (int j = neg.size(); j < pos.size(); j++) {
                arr[index] = pos.get(j);
                index++;
            }
        } else {
            for (int i = 0; i < pos.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }
            int index = pos.size() * 2;
            for (int j = pos.size(); j < neg.size(); j++) {
                arr[index] = neg.get(j);
                index++;
            }
        }
        return arr;
    }
}
