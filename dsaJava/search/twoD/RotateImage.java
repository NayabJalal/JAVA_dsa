package search.twoD;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
    }
    static void rotate(int[][] matrix) {
        int n =matrix.length;
        int top = 0;
        int bottom = n-1;
        while (top<bottom){
            for (int col = 0; col < n; col++) {
                int temp = matrix[top][col];
                matrix[top][col] = matrix[bottom][col];
                matrix[bottom][col] = temp;
            }
            top++;
            bottom--;
        }
        for (int row = 0; row < n; row++) {
            for (int col = row + 1; col < n; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
    }
}
