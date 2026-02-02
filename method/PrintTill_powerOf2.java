package method;

public class PrintTill_powerOf2 {
    public static void main(String[] args) {
        int n = 6;
        printPower_2(n);
    }

    public static void printPower_2(int n) {
        // outer loop
        int count = 1;
        for (int i = 0; i < n; i++) {
            int result = power(i);
            // inner loop
            for (int j = 0; j < result; j++) {
                System.out.print(count);
                count++;
                if (count > 9) {
                    count = 1;
                }
            }
            System.out.println();
        }
    }

    public static int power(int i) {
        int n = 1;
        int power = 1;
        while (n <= i) {
            power *= 2;
            n = n + 1;
        }
        return power;
    }
}
