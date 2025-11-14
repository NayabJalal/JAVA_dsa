package search;

public class PeakElement_II {
    public static void main(String[] args) {
        int [][] mat = {{1,4},{3,2}};

    }
    static int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int row = -1;
        int col =-1;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (res == mat[i][j]){
                    row = i;
                    col = j;
                    res =mat[i][j];
                }
            }
        }
        return new int[]{row,col};
    }
}
