package striver_sheet.binary_search;

import java.util.Arrays;

public class O_KOKO_Banana {
    public static void main(String[] args) {
        int[] arr = { 30, 11, 23, 4, 20 };
        int h = 5;
        int ans = EatingSpeed(arr, h);
        System.out.println(ans);
    }

    public static int EatingSpeed(int[] arr, int h) {
        int start = 1;
        int end = Arrays.stream(arr).max().getAsInt();
        int ans = end;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            double Totalhour = calculatehour(arr, mid);
            if (Totalhour <= h) {
                ans = mid;
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    private static double calculatehour(int[] arr, int mid) {
        double Totalhour = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = (int) Math.ceil((double) arr[i] / mid);
            Totalhour += sum;
        }
        return Totalhour;
    }
}
