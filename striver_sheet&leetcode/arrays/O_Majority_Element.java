public class O_Majority_Element {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 1, 2, 2 };
        int ans = findMejority(arr);
        System.out.println(ans);
    }

    public static int findMejority(int[] arr) {
        int n = arr.length;
        int count = 0;
        int Element = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                Element = arr[i];
                count = 1;
            } else if (arr[i] == Element) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == Element) {
                count1++;
            }
        }
        if (count1 > (n / 2)) {
            return Element;
        }
        return -1;
    }
}
