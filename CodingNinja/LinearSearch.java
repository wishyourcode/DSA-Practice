
/*
You have been given a random integer array/list(ARR) of size N,
and an integer X. You need to search for the integer X 
in the given array/list using 'Linear Search'.
You have been required to return the index at which X is present 
in the array/list. If X has multiple occurrences in the array/list,
then you need to return the index at which the first occurrence
of X would be encountered. In case X is not present in the array/list,
then return -1.
*/
public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 7, 9, 12, 54, 6, 2, 1, };
        int x = 54;
        int ans = linearSearch(arr, x);
        System.out.println(ans);
    }

    public static int linearSearch(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
