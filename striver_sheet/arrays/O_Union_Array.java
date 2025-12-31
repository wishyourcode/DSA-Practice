import java.util.ArrayList;

public class O_Union_Array {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = { 2, 3, 5, 6, 7, 8, 9 };
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> ans = union(arr1, arr2, n, m);
        System.out.println(ans);
    }

    public static ArrayList<Integer> union(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> unionArray = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                if (unionArray.size() == 0 || unionArray.get(unionArray.size() - 1) != arr1[i]) {
                    unionArray.add(arr1[i]);
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                if (unionArray.size() == 0 || unionArray.get(unionArray.size() - 1) != arr1[i]) {
                    unionArray.add(arr1[i]);
                }
                i++;
            } else {
                if (unionArray.size() == 0 || unionArray.get(unionArray.size() - 1) != arr2[j]) {
                    unionArray.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < n) {
            if (unionArray.get(unionArray.size() - 1) != arr1[i]) {
                unionArray.add(arr1[i]);
            }
            i++;
        }

        while (j < m) {
            if (unionArray.get(unionArray.size() - 1) != arr2[j]) {
                unionArray.add(arr2[j]);
            }
            j++;
        }

        return unionArray;
    }

}
