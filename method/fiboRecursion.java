package method;

public class fiboRecursion {
    public static void fibSeries(int a, int b, int n) {
        if (n == 0)
            return;

        int c = a + b;
        System.out.print(c + " ");
        fibSeries(b, c, n - 1);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.print("0 1 ");
        fibSeries(0, 1, n - 2);
    }
}
