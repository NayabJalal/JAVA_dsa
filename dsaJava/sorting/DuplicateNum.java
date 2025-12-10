package sorting;

public class DuplicateNum {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        cyclicSort(arr);
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] nums) {
        cyclicSort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]!=i+1){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
    static void cyclicSort(int[] nums){
        int i =0;
        while (i<nums.length){
            int correctIndex = nums[i];
            if (nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else i++;
        }
    }
    static void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
