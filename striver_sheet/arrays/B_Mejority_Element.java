import java.util.HashMap;
import java.util.Map;

public class B_Mejority_Element {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        int ans = MejorityElement(arr);
        System.out.println(ans);
    }

    public static int MejorityElement(int[] arr) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int count = seen.getOrDefault(temp, 0);
            count = count + 1;
            seen.put(temp, count);
        }
        for (Map.Entry<Integer, Integer> entry : seen.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
