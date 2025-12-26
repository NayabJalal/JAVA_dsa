package Patterns.SlidingWindow;

public class Buy_and_Sell {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int left =0;
        int right = 1;
        int profit = 0;
        while (right<prices.length){
            if (prices[left]<prices[right]){
                int curProfit = prices[right] - prices[left];
                profit = Math.max(profit,curProfit);
            }
            else {
                left = right;
            }
            right++;
        }
        return profit;
    }
}
