package arraylist;

import java.util.ArrayList;

public class moveZeroAtEnd {
    public static void pushZerosAtEnd(ArrayList<Integer> arr) {
        int pos = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != 0) {
                arr.set(pos, arr.get(i));
                pos++;
            }
        }
        for (int j = pos; j < arr.size(); j++) {
            arr.set(j, 0);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(-2);
        arr.add(3);
        arr.add(4);
        arr.add(0);
        arr.add(5);
        arr.add(-27);
        arr.add(9);
        arr.add(0);
        pushZerosAtEnd(arr);
        System.out.println(arr);
    }
}
