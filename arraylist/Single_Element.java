package arraylist;

import java.util.ArrayList;

public class Single_Element {
    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = ans ^ arr.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        int result = singleNonDuplicate(arr);
        System.out.println("The single non-duplicate element is: " + result);
    }
}
