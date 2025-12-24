package Patterns.TwoPointers;

public class SortColors {
    public void sortColors(int[] nums) {
        int i =0;
        int j =nums.length-1;
        int mid = 0;
        while (mid<=j){
            if (nums[mid]==0){
                swap(i,mid,nums);
                i++;
                mid++;
            } else if (nums[mid]==1) {
                mid++;
            }
            else {
                swap(j,mid,nums);
                j--;
            }
        }
    }
    static void swap(int first, int second,int[] nums){
        int temp = nums[first];
        nums[first]=nums[second];
        nums[second] = temp;
    }
}
