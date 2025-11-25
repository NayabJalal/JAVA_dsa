package search.twoD;

import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        int arr[][] = { //sorted row and col
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int arr2[][] = { // sorted matrix
                {1,2,3,4},
                {5,6,7,8,},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target = 37;
        int [] ans;
        int [] ans2;
        ans2 = searchIn2D2(arr2,14);
        System.out.println(Arrays.toString(ans2));
        ans = searchIn2D(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchIn2D(int [][] arr , int target){ //only when the array is sorted row and column wise;
        int row  = 0;
        int column = arr[0].length-1;
        while (row < arr.length && column >= 0){
            if (arr[row][column] == target ){
                return new int[]{row , column};
            }
            else if (arr[row][column] < target){
                row++;
            }
            else column --;
        }
        return new int[]{-1,-1};
    }
    static int[] searchIn2D2(int [][] arr , int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        int start = 0;
        int end = rows * cols - 1;  // treat matrix like a 1D array

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int r = mid / cols;     // convert 1D index -> row
            int c = mid % cols;     // convert 1D index -> col

            if (arr[r][c] == target) {
                return new int[]{r, c};
            } else if (arr[r][c] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}
