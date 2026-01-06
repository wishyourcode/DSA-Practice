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