package problems.arrays.easy;
/*
121. Best Time to Buy and Sell Stock
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            if (price < minVal) {
                minVal = price;
            } else if (price - minVal > profit) {
                profit = price - minVal;
            }
        }
        return profit;
    }
}
