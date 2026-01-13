import java.util.ArrayList;

/*
You are given a sorted array ‘arr’ of ‘n’ numbers such
that every number occurred twice in the array except one,
which appears only once.
Return the number that appears once.
Example:
Input: 'arr' = [1,1,2,2,4,5,5]
Output: 4 
Explanation: 
Number 4 only appears once the array.
Note :
Exactly one number in the array 'arr' appears once. */
public class SingleElement {
    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            sum ^= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(3);

        int result = singleNonDuplicate(arr);
        System.out.println("The single non-duplicate element is: " + result); // Output: 2
    }
}
