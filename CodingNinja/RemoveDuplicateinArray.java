package CodingNinja;

public class RemoveDuplicateinArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 5, 5 };
        int n = removeDuplicates(arr, arr.length);
        System.out.println("n = " + n);
    }

    /*
     * You are given a sorted integer array 'arr' of size 'n'.
     * You need to remove the duplicates from the array such that each element
     * appears only once.
     * Return the length of this new array.
     * Note:
     * Do not allocate extra space for another array. You need to do this by
     * modifying the given input array in place with O(1) extra memory.
     */
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
