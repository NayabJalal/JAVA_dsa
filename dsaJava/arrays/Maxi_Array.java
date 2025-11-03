package arrays;

public class Maxi_Array {
    public static void main(String[] args) {
        int [] arr = {
                3,41,31,67,1
        };
        System.out.println("The minimum in the arrays is : "+ min(arr));
        System.out.println("The maximum in the arrays is : "+ max(arr));
    }
    static int max(int [] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];

            }
        }
        return max;
    }
    static int min(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
