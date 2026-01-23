import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sum_Array {
    /*
     * You are given two numbers 'A' and 'B' in the form of two arrays (A[] and B[])
     * of lengths 'N' and 'M' respectively, where each array element represents a
     * digit. You need to find the sum of these two numbers and return this sum in
     * the form of an array.
     * Note:
     * 1. The length of each array is greater than zero.
     * 2. The first index of each array is the most significant digit of the number.
     * For example, if the array A[] = {4, 5, 1}, then the integer represented by
     * this array is 451 and array B[] = {3, 4, 5} so the sum will be 451 + 345 =
     * 796. So you need to return {7, 9, 6}.
     * 3. Both numbers do not have any leading zeros in them. And subsequently, the
     * sum should not contain any leading zeros.
     */
    public static int[] findArraySum(int[] a, int n, int[] b, int m) {
        int i = n - 1;
        int j = m - 1;
        int carry = 0;
        List<Integer> result = new ArrayList<>();
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a[i];
                i--;
            }
            if (j >= 0) {
                sum += b[j];
                j--;
            }
            result.add(sum % 10);
            carry = sum / 10;
        }
        Collections.reverse(result);
        int[] ans = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            ans[k] = result.get(k);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = { 9, 9, 9 };
        int[] B = { 9, 9, 9 };

        int[] sum = findArraySum(A, A.length, B, B.length);
        System.out.println(Arrays.toString(sum));
    }
}
