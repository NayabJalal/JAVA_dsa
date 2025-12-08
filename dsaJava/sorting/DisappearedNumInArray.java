package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumInArray {
    public static void main(String[] args) {

    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        cyclicSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                list.add(i + 1);
            }
        }
        return list;
    }
    static void cyclicSort(int[] arr){
        int i =0;
        while (i<arr.length){
            int correctIndex = arr[i]-1;
            if (arr[i]>=1 && arr[i] <= arr.length && arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else i++;
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
