public class E_IsSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        boolean ans = Is_sorted(arr);
        System.out.println(ans);
    }

    static boolean Is_sorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
