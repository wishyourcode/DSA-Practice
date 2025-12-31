import java.util.Arrays;
import java.util.HashSet;

public class E_Remove_Duplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4 };
        System.out.println(Arrays.toString(arr));
        int n = removeDuplicates(arr);
        System.out.println("n = " + n);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicates(int[] arr) {
        HashSet<Integer> container = new HashSet<>();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!container.contains(arr[i])) {
                container.add(arr[i]);
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }
}
