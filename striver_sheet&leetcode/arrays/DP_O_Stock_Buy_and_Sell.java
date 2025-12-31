public class DP_O_Stock_Buy_and_Sell {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int ans = StockBuyAndSell(prices);
        System.out.println(ans);

    }

    public static int StockBuyAndSell(int[] arr) {
        int MaxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // If current price is less than minPrice, update minPrice
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            }
            // Else calculate profit and update maxProfit if it's greater
            else {
                int temp = arr[i] - minPrice;
                MaxProfit = Math.max(MaxProfit, temp);
            }
        }
        return MaxProfit;
    }
}
