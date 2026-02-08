public class MergeArray {
    /*
     * Given two non-decreasing sorted arrays, ‘A’ and ‘B’, having ‘N’ and ‘M’
     * elements, respectively.
     * You must merge these arrays, ‘A’ and ‘B’, into a sorted array without using
     * extra space. Of all the 'N + M' sorted elements, array 'A' should contain the
     * first 'N' elements, and array 'B' should have the last 'M' elements.
     * Note:
     * You must perform the merge operation in place and must not allocate any extra
     * space to merge the two arrays.
     * For example:
     * When ‘N’ = 4, ‘A’ = {1, 4, 5, 7} and ‘M’ = 3, ‘B’ = {2, 3, 6}.
     * We can merge these two arrays into {1, 2, 3, 4, 5, 6, 7} (The elements of ‘A’
     * are {1, 2, 3, 4} ) and 'B' are { 5, 6, 7}.
     */
    public static void mergeTwoSortedArraysWithoutExtraSpace(long[] a, long[] b) {
        int n = a.length;
        int m = b.length;
        for (int i = 0; i < n; i++) {
            if (a[i] > b[0]) {
                long temp = a[i];
                a[i] = b[0];
                b[0] = temp;
                long first = b[0];
                int k;
                for (k = 1; k < m && b[k] < first; k++) {
                    b[k - 1] = b[k];
                }
                b[k - 1] = first;
            }
        }
    }

    public static void main(String[] args) {
        long[] a = { 1, 4, 5, 7 };
        long[] b = { 2, 3, 6 };
        mergeTwoSortedArraysWithoutExtraSpace(a, b);
        System.out.println("Array A: ");
        for (long i : a) {
            System.out.print(i + " ");
        }
        System.out.println("\nArray B: ");
        for (long i : b) {
            System.out.print(i + " ");
        }
    }
}
