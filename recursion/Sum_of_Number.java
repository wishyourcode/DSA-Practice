package recursion;

public class Sum_of_Number {
    public static void main(String[] args) {
        Sum_of_N_Number(1, 5, 0);
    }

    static void Sum_of_N_Number(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        Sum_of_N_Number(i + 1, n, sum);
    }

}
