public class MakeIt_Palindrome {
    /*
     * You are given an array ‘A’ of length ‘N’ consisting only of positive
     * integers. Your task is to make the given array a palindrome by using a
     * minimum number of operations. In one operation, you can select two adjacent
     * indexes and merge them by adding their values. After every operation, the
     * length of the array decreases by one.
     * 
     * Note: An array of length ‘1’ is a palindrome.
     * 
     * For example: 1 2 3 4 1
     * We select indexes 3 and 4 to merge. The array will look like [1, 2, 7, 1].
     * We select indexes 2 and 3 to merge. The array will look like [1, 9, 1].
     * Now the array is a palindrome. Hence the answer will be 2.
     */
    public static int palindrome(int[] A) {
        int l = 0;
        int r = A.length - 1;
        int count = 0;
        while (l < r) {
            if (A[l] == A[r]) {
                l++;
                r--;
            } else if (A[l] < A[r]) {
                A[l + 1] = A[l] + A[l + 1];
                l++;
                count++;
            } else {
                A[r - 1] = A[r] + A[r - 1];
                r--;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = { 1, 3, 3 };
        System.out.println(palindrome(A));
    }
}