package search;

public class CountNegative {
    public static void main(String[] args) {

    }
    static int countNegatives(int[][] grid) {
        int total = 0;
        for (int[] row : grid) {
            total += searchRow(row);
        }
        return total;
    }
    static int searchRow(int[] row) {
        int low = 0;
        int high = row.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (row[mid] < 0) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return row.length - low;
    }
}
