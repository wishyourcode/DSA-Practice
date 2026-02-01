package striver_sheet.slidingwindow;

/* There are several cards arranged in a row, and each card
 has an associated number of points. The points are given 
 in the integer array cardPoints.
In one step, you can take one card from the beginning or 
from the end of the row. You have to take exactly k cards.
Your score is the sum of the points of the cards you have taken.
Given the integer array cardPoints and the integer k, return 
the maximum score you can obtain.
  */
public class Max_point {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 1, 2 };
        int k = 3;
        System.out.println(findMaxPoint(arr, k));
    }

    public static int findMaxPoint(int[] arr, int k) {
        int lsum = 0;
        int rsum = 0;
        int maxsum = 0;
        for (int i = 0; i < k; i++) {
            lsum += arr[i];
        }
        maxsum = lsum;
        int right = arr.length - 1;
        for (int i = k - 1; i >= 0; i--) {
            lsum -= arr[i];
            rsum += arr[right];
            right--;
            maxsum = Math.max(maxsum, lsum + rsum);

        }
        return maxsum;
    }
}
