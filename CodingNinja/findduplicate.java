import java.util.ArrayList;

class findduplicate {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        int result = findDuplicate(arr);
        System.out.println(result);
    }

    /*
     * You are given an array ‘ARR’ of size ‘N’ containing each number between 1 and
     * ‘N’ - 1 at least once. There is a single integer value that is present in the
     * array twice. Your task is to find the duplicate integer value present in the
     * array.
     * For example: Consider ARR = [1, 2, 3, 4, 4], the duplicate integer value
     * present in the array is 4. Hence, the answer is 4 in this case.
     * Note : A duplicate number is always present in the given array.
     */
    public static int findDuplicate(ArrayList<Integer> arr) {
        ArrayList<Integer> seen = new ArrayList<>();
        for (int i : arr) {
            if (!seen.contains(i)) {
                seen.add(i);
            } else {
                return i;
            }

        }
        return -1;
    }
}