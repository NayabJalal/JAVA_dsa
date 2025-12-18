package Patterns.TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int left = 1;
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        while (left < nums.length) {
            if (nums[left] != nums[left - 1]) {
                list.add(nums[left]);
            }
            left++;
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
    public int removeDuplicates2(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
