package array;

public class Max_Consecutive {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1, 1 };
        int result = findConsecutive(arr);
        System.out.println(result);
    }

    public static int findConsecutive(int[] arr) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }

}