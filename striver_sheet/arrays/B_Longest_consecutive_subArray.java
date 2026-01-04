
public class B_Longest_consecutive_subArray {
    public static void main(String[] args) {
        int[] a = { 100, 102, 100, 101, 101, 4, 3, 2, 3, 2, 1, 1, 1, 1, 2 };
        int ans = Longest_Consecutive_SubArray(a);
        System.out.println(ans);
    }

    // Function to find the length of the longest consecutive subarray
    public static int Longest_Consecutive_SubArray(int[] arr) {
        int largest = 1;
        sort(arr);
        int count = 1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 == min) {
                count++;
                min = arr[i];
            } else if (arr[i] != min) {
                count = 1;
                min = arr[i];
            }
            largest = Math.max(largest, count);

        }
        return largest;
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
