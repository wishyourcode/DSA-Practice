package leetcode;

public class evendigit {
    public static void main(String[] args) {
        int[] arr = { 12, 345, 2, 6, 7896, 12345, 123456 };
        findDigit(arr);
    }

    static void findDigit(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int nums = arr[i];
            while (nums > 0) {
                nums = nums / 10;
                count++;
            }
            if (count % 2 == 0) {
                System.out.print(arr[i]);
            }
        }
    }
}
