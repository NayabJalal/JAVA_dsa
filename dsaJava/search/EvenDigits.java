package search;

public class EvenDigits {
    public static void main(String[] args) {
        int [] nums = {13,45,1,2,1};
        System.out.println(count(nums));
    }
    static int count(int[] nums){
        int count =0;
        for (int n : nums){
            if(even(n)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num) {
        int noOfDigits = digit(num);
        return noOfDigits % 2==0;
    }
    static int digit(int num){
        if(num<0) num = num * -1;
        return (int)Math.log10(num) + 1;
    }
}
