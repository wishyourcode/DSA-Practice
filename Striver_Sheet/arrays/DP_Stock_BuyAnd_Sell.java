public class DP_Stock_BuyAnd_Sell {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int ans = stockBuyandSell(prices);
        System.out.println(ans);
    }

    public static int stockBuyandSell(int[] arr) {
        int MaxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int profit = arr[j] - arr[i];
                MaxProfit = Math.max(MaxProfit, profit);
            }
        }
        return MaxProfit;
    }
}
