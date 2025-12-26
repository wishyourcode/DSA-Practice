import java.util.Arrays;

public class B_Two_sum {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        int number = 14;
        int[] ans = checkSum(arr, number);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] checkSum(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == number) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
