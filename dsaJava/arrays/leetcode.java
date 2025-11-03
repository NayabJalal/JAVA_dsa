package arrays;

public class leetcode {
    public static void main(String[] args) {
    }
    public int[] getConcatenation(int[] nums) {
        int len= nums.length;
        int[] result = new int[len*2];
        for(int i =0; i < len; i++){
            result[i] = nums[i];
            result[len+ i]= nums[i];
        }
        return result;
    }
    public int[] buildArray(int [] nums){
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }

























}
