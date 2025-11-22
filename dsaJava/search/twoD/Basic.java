package search.twoD;

import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        int arr[][] = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 37;
        int [] ans;
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
}
