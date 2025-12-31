import java.util.Arrays;

public class E_Second_largest_Number {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        sortedArray(arr);
    }

    static void sortedArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int secondLargest = second_Large_Element(arr);
        int secondSmallest = second_Smallest_Element(arr);

        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Second Smallest: " + secondSmallest);
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int second_Large_Element(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != arr[i - 1]) {
                return arr[i - 1];
            }
        }
        return -1;
    }

    private static int second_Smallest_Element(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                return arr[i + 1];
            }
        }
        return -1;
    }
}
