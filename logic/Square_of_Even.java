package logic;

public class Square_of_Even {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        evenNumber(arr);
    }

    public static void evenNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int temp = arr[i];
                square(temp);
            }
        }
    }

    public static void square(int temp) {
        System.out.println(temp + " : is even Number and Square of the " + temp + " is :" + temp * temp);
    }
}
