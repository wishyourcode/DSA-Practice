import java.util.ArrayList;
import java.util.List;

/*Given an array/list 'ARR' of integers and a position ‘M’. 
You have to reverse the array after that position.
Example:
We have an array ARR = {1, 2, 3, 4, 5, 6} and M = 3 , considering 0 
based indexing so the subarray {5, 6} will be reversed and our 
output array will be {1, 2, 3, 4, 6, 5}.
*/
public class ReverseArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        int m = 3;
        reverseArray(arr, m);
        System.out.println(arr);
    }

    public static void reverseArray(ArrayList<Integer> arr, int m) {
        int start = m + 1;
        int end = arr.size() - 1;
        while (start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }

    }
}
