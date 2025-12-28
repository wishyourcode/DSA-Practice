import java.util.ArrayList;

public class O_Leader_Element {
    public static void main(String[] args) {
        int[] arr = { 10, 12, 8, 9, 6 };
        ArrayList<Integer> result = find_Leader(arr);
        System.out.println(result);
    }

    public static ArrayList<Integer> find_Leader(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length - 1;
        int maxi = Integer.MIN_VALUE;
        for (int i = n; i >= 0; i--) {
            int max = arr[i];
            if (arr[i] > maxi) {
                ans.add(arr[i]);
            }
            maxi = Math.max(max, maxi);
        }
        return ans;
    }
}
