public class E_Majority_Element {
    public static void main(String[] args) {
        int[] nums = { 7, 0, 0, 1, 7, 7, 2, 7, 7 };
        int ans = findMejorityElement(nums);
        System.out.println(ans);
    }

    public static int findMejorityElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count += 1;
                }
                if (count > n / 2) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
