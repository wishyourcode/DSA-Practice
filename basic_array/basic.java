package basic_array;
import java.util.Arrays;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n = input.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the array number");
        for (int i = 0; i < n; i++) {
            arr1[i] = input.nextInt();
        }

        // for (int i = 0; i < arr1.length; i++) {
        // System.out.print(arr1[i] + " ");
        // }
        // for (int i : arr1) {
        // System.out.print(arr1[i] + " ");
        // }
        System.out.println(Arrays.toString(arr1));
        input.close();
    }
}
