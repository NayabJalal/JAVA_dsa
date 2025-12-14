package sorting;

public class SortByParity {
    public int[] sortArrayByParity(int[] nums) {
        int i =0;
        int m = nums.length-1;
        while (i<m){
            if (nums[i]%2!=0){
                swap(nums,i,m);
                m--;
            }
            else i++;
        }
        return nums;
    }
    static void swap(int[] nums, int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second]= temp;
    }
}
