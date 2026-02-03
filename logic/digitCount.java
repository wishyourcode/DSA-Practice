package logic;

public class digitCount {
    public static int DigitCount(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(DigitCount(123456));
    }
}
