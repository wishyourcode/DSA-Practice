import java.util.Arrays;

public class B_Move_Zero {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 0, 6, 4, 0, 0, 0, 4, 3, 2, 1, 0 };
        System.out.println(Arrays.toString(arr));
        MoreZero(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void MoreZero(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }

        // lower part can be skip becouse by default array value are zero and so
        // available value are replaced and rest will me zero there are no need to
        // insert zero
        // for (int i = temp.length; i < arr.length; i++) {
        // arr[i] = 0;
        // }
    }
}
