package logic;

public class findDuplicatesSorted {
    public static void main(String[] args) {
        // hard coded iput
        int[] arr = { 1, 1, 3, 4, 5 };
        duplicatesNumber(arr);
    }

    // check for duplicates
    public static void duplicatesNumber(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("Duplicate number is: " + arr[i]);
                System.out.println("Missing number is: " + (arr[i] + 1));
            }
        }

    }
}
