import java.util.ArrayList;

public class RotateArray {
    /*
     * Given an array 'arr' with 'n' elements, the task is to rotate the array to
     * the left by 'k' steps, where 'k' is non-negative.
     * Example:
     * 'arr '= [1,2,3,4,5]
     * 'k' = 1 rotated array = [2,3,4,5,1]
     * 'k' = 2 rotated array = [3,4,5,1,2]
     * 'k' = 3 rotated array = [4,5,1,2,3] and so on.
     */
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        k = k % n; // handle large k

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);

        return arr;
    }

    public static void reverse(ArrayList<Integer> arr, int first, int second) {
        while (first < second) {
            int temp = arr.get(first);
            arr.set(first, arr.get(second));
            arr.set(second, temp);
            first++;
            second--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int k = 3; // number of steps to rotate

        ArrayList<Integer> rotatedArr = rotateArray(arr, k);
        System.out.println(rotatedArr); // Output: [3, 4, 5, 1, 2]

    }

}