public class BestTimeToBuyAndSellStock {

    static int maxProfit(int[] prices) {

        // Lowest price seen so far
        int minPrice = prices[0];

        // Maximum profit found so far
        int maxProfit = 0;

        // Traverse the array once
        for (int i = 1; i < prices.length; i++) {

            // Update minimum price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate profit if we sell today
            int profit = prices[i] - minPrice;

            // Update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);

        System.out.println(result);
    }
}