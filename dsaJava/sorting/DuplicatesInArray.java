package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuplicatesInArray {
    public static void main(String[] args) {

    }
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        cyclicSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!= i+1){
                list.add(nums[i]);
            }
        }
        return list;
    }
    static void cyclicSort(int [] nums){
        int i =0;
        while (i<nums.length){
            int correctIndex = nums[i] -1;
            if (nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else i++;
        }
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    /* optimized
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int targetIndex = nums[i]-1;
            if(nums[targetIndex] != nums[i]){
                int temp = nums[i];
                nums[i] = nums[targetIndex];
                nums[targetIndex] = temp;
            }else{
                i++;
            }
        }

        final List<Integer> duplicates = new ArrayList<>();
        for(int j = 0; j < nums.length ; j++){
            if(nums[j] - 1 != j ){
                duplicates.add(nums[j]);
            }
        }
        return duplicates;
    }
     */
}
