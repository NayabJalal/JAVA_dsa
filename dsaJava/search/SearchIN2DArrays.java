package search;

import java.util.Arrays;

public class SearchIN2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {12,45,32,67},
                {2,8,9},
                {13,56,89},
        };
        int target = 89;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static boolean search2(int [][] arr, int target){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt == target) return true;
            }
        }
        return false;
    }
    static int[] search(int [][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length;j++) {
                if(arr[i][j] == target) return new int[]{i, j};
            }
        }
        return new int[]{-1,-1};
    }
}
