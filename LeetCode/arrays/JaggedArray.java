package arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,4,2},
                {3,2,1},
                {6,5,7,8,9}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
