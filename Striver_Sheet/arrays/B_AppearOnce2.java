public class B_AppearOnce2 {
    public static void main(String[] args) {

    }

    public static int Appear_once(int[] arr) {
        int n = arr.length;
        int maxI = arr[0];
        for (int i = 0; i < n; i++) {
            maxI = Math.max(maxI, arr[i]);
        }
        int[] hash = new int[maxI = 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1) {
                return arr[i];
            }
        }
        return -1;
    }
}
