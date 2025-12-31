public class O_Max_Consecutive {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1 };
        int ans = MaximumConsecutive(arr);
        System.out.println(ans);
    }

    public static int MaximumConsecutive(int[] arr) {
        int maxI = 0;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt += 1;
                maxI = max(maxI, cnt);
            } else {
                cnt = 0;
            }

        }
        return maxI;
    }

    private static int max(int maxI, int cnt) {
        if (maxI > cnt) {
            return maxI;
        } else {
            return cnt;
        }
    }
}