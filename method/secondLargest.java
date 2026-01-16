package method;

import java.util.Scanner;

public class secondLargest {
    // 564321
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        input.close();
        int largest = -1;
        largest = a;
        int secondLargest = -1;
        if (b > largest) {
            secondLargest = largest;
            largest = b;
        }
        if (c > largest) {
            secondLargest = largest;
            largest = c;
        } else if (c > secondLargest && c < largest) {
            secondLargest = c;
        }
        if (d > largest) {
            secondLargest = largest;
            largest = d;
        } else if (d > secondLargest && d < largest) {
            secondLargest = d;
        }
        if (e > largest) {
            secondLargest = largest;
            largest = e;
        } else if (e > secondLargest && e < largest) {
            secondLargest = e;
        }
        System.out.println(secondLargest);
    }
}