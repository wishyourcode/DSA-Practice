public class MergeTwoSortedArray {
    /*
     * Ninja has been given two sorted integer arrays/lists ‘ARR1’ and ‘ARR2’ of
     * size ‘M’ and ‘N’. Ninja has to merge these sorted arrays/lists into ‘ARR1’ as
     * one sorted array. You may have to assume that ‘ARR1’ has a size equal to ‘M’
     * + ‘N’ such that ‘ARR1’ has enough space to add all the elements of ‘ARR2’ in
     * ‘ARR1’.
     * For example:
     * ‘ARR1’ = [3 6 9 0 0]
     * ‘ARR2’ = [4 10]
     * After merging the ‘ARR1’ and ‘ARR2’ in ‘ARR1’.
     * ‘ARR1’ = [3 4 6 9 10]
     */
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } else {
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            arr1[k] = arr2[j];
            j--;
            k--;
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 0, 0, 0 };
        int[] arr2 = { 2, 4, 6 };
        int m = 3;
        int n = 3;
        int[] result = ninjaAndSortedArrays(arr1, arr2, m, n);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
