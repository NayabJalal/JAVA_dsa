package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] arr = new int[3][3]; // no need to write the columns -> not mandatory
//        int [] [] arr ={
//                {1,2,3,4},
//                {2,3,4},
//                {4,5}
//        };

        // input---->
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
//        //output----->
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println(); // After printing every row print a new line
//        }

        //output----->
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//            // every single element outside the array is array itself
//        }

        //output(Enhanced For Loop)----->
        for (int[] a : arr){
            System.out.println(Arrays.toString(arr));
        }
    }

}
