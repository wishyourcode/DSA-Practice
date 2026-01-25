import java.util.Scanner;

public class PrimeIn_Interval {
    public static void main(String args[]) {
        CountPrime obj = new CountPrime();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(obj.totalPrime(s, e));
        sc.close();
    }
}

class CountPrime {

    public int totalPrime(int s, int e) {
        int count = 0;
        for (int i = s; i <= e; i++) {
            if (isprime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isprime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}