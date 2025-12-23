import java.util.Arrays;

public class E_Largest_Element {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 6, 5 };
        System.out.println(Arrays.toString(arr));
        int ans = insertionsort(arr);
        System.out.println(ans);
    }

    static int insertionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
        return arr[arr.length - 1];
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
