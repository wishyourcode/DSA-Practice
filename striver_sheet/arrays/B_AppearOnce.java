public class B_AppearOnce {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 4, 4 };
        int ans = AppearingOnce(arr);
        System.out.println(ans);
    }

    public static int AppearingOnce(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    count += 1;
                }
            }
            if (count == 1) {
                return num;
            }
        }
        return -1;
    }
}