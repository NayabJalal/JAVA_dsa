package search;

import java.util.Arrays;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        int ans = isPivot(arr);
        int ans2 = isNotPivot(arr);
        System.out.println(ans);
        System.out.println(ans2);
    }
    static int isPivot(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // Ascending - peak is on RIGHT
                start = mid + 1;
            } else {
                // Descending - peak is on LEFT (or at mid)
                end = mid;
            }
        }
        return start+1; //{start+1} or the index of minimum num in the arr = index of 1 -> {4,5,6,7,1,2,3}
    }
    //the index of minimum num in the arr = index of 1 -> {4,5,6,7,1,2,3}
    static int isNotPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                // Mid is in larger part, pivot is on RIGHT
                start = mid + 1;
            } else {
                // Mid is in smaller part, pivot is on LEFT (or at mid)
                end = mid;
            }
        }
        return start; //or end
    }
}
