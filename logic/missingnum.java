package logic;

public class missingnum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int result = missingnumber(arr);
        System.out.println(result);
    }

    static int missingnumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctindex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctindex]) {
                swap(arr, i, correctindex);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int value, int correctindex) {
        int temp = arr[value];
        arr[value] = arr[correctindex];
        arr[correctindex] = temp;
    }
}
