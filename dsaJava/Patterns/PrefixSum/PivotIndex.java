package Patterns.PrefixSum;

public class PivotIndex {
    public static void main(String[] args) {

    }
    public int pivotIndex(int[] nums) {
        int total = 0,rightSum=0;
        for (int i = 0; i < nums.length; i++) {
            total +=nums[i];
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSum+=nums[i];
            rightSum = total - leftSum - nums[i];
            if (leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
}
