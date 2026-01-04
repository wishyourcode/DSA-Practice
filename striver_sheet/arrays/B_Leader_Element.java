import java.util.ArrayList;

public class B_Leader_Element {
    public static void main(String[] args) {
        int[] arr = { 10, 12, 8, 9, 6 };
        ArrayList<Integer> result = Find_Learder(arr);
        System.out.println(result);
    }

    // Function to find all leader elements in the array
    public static ArrayList<Integer> Find_Learder(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader == true) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
