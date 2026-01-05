package CodingNinja;

public class RemoveDuplicateinArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 5, 5 };
        int n = removeDuplicates(arr, arr.length);
        System.out.println("n = " + n);
    }

    public static int removeDuplicates(int[] arr, int n) {
        int left = 0;
        for (int right = 1; right < arr.length; right++) {
            if (arr[left] != arr[right]) {
                arr[left + 1] = arr[right];
                left++;
            }
        }
        return left + 1;
    }
}
