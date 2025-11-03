package search;

public class Linear {
    public static void main(String[] args) {
        int[] arr = {
                1,4,2,1,7
        };
        System.out.println(linear(arr , 7));

    }
    static int linear(int arr[] , int target){
        if(arr.length == 0 ) return -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) return i; //if you want to return the element itself use enhanced for loop and return arr[i];
            // and in the default return use Integer.MAX_VALUE(as -1 maybe present in the array)
        }
        return -1;
    }
}
