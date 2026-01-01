package striver_sheet.binary_search;

import java.util.Arrays;

public class O_Capacity_Of_Ship {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 4, 1, 4 };
        int day = 3;
        int ans = capacity_Of_Ship(arr, day);
        System.out.println(ans);
    }

    public static int capacity_Of_Ship(int[] arr, int day) {
        int start = Arrays.stream(arr).max().getAsInt();
        int end = Arrays.stream(arr).sum();
        int ans = end;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = calculateCapacity(arr, mid);
            if (count <= day) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return ans;

    }

    public static int calculateCapacity(int[] arr, int mid) {
        int load = 0;
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + load > mid) {
                count++;
                load = arr[i];
            } else {
                load = arr[i] + load;
            }
        }
        return count;
    }
}
