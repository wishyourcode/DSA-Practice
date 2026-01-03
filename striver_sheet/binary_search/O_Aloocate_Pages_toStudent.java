package striver_sheet.binary_search;

import java.util.Arrays;

public class O_Aloocate_Pages_toStudent {
    public static void main(String[] args) {
        int[] arr = { 25, 46, 28, 49, 24 };
        int m = 4;
        int ans = minimumnumber(arr, m);
        System.out.println(ans);
    }

    /*
     * Problem Statement: Given an array ‘arr of integer numbers, ‘ar[i]’ represents
     * the number of pages in the ‘i-th’ book. There are a ‘m’ number of students,
     * and the task is to allocate all the books to the students.
     * Allocate books in such a way that:
     * Each student gets at least one book.
     * Each book should be allocated to only one student.
     * Book allocation should be in a contiguous manner.
     */
    public static int minimumnumber(int[] arr, int m) {
        int start = Arrays.stream(arr).max().getAsInt();
        int end = Arrays.stream(arr).sum();
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int students = countStudent(arr, mid);
            if (students > m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static int countStudent(int[] arr, int mid) {
        int students = 1;
        long pagesStudent = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pagesStudent + arr[i] <= mid) {
                pagesStudent += arr[i];
            } else {
                students++;
                pagesStudent = arr[i];
            }
        }
        return students;
    }
}
