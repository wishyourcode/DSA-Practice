package logic;

public class Prime_IN_Array {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 9, 8, 11, 6, 13, 15, 17 };
        checkPrime(arr);
    }

    public static void checkPrime(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= arr[i] / 2; j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(arr[i] + " : is a Prime Number");
            }
        }
    }
}
