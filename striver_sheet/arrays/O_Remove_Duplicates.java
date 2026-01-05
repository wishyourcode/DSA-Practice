import java.util.Arrays;

public class O_Remove_Duplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4 };
        System.out.println(Arrays.toString(arr));
        int n = removeDuplicate(arr);
        System.out.println("n = " + n);
        System.out.print("Array after removing duplicates: ");
        System.out.println(Arrays.toString(arr));
    }

    // Function to remove duplicates from sorted array
    public static int removeDuplicate(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }
}
