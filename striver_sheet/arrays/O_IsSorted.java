public class O_IsSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        boolean Is_sorted = IsSorted(arr);
        System.out.println(Is_sorted);
    }

    private static boolean IsSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
//