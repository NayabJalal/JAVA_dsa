package search;

import java.util.Arrays;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int ans = splitArray(arr,3);
        System.out.println(ans);
    }
    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start,nums[i]); //linear Search
            end += nums[i];
        }
        //binary Search
        while (start<end){
            int mid = start + (end - start) / 2;
            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int n : nums){
                if (sum + n> mid){
                    //Reached max in the subArray, add in another subArray;
                    sum =n;
                    pieces++;
                }
                else {
                    sum+=n;
                }
            }
            if (pieces<=k) end = mid;
            else start = mid+1;//return start as the potential ans
        }
        return start;
    }
}
