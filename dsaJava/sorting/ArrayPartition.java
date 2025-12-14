package sorting;

public class ArrayPartition {
    public static void main(String[] args) {

    }
    public int arrayPairSum(int[] nums) {
        int max =0;
        int n = nums.length;
         int i =0;
         while (i<n) {
            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else i++;
        }
        for (int j = 0; j < n; j++) {
            max += nums[j];
        }
         return max;
    }
}
