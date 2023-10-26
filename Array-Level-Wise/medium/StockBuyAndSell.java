public class StockBuyAndSell {
  public static int maxProfit(int[] prices) {
    int  min = 99999;
    int profit = 0;
    for (int i = 0; i < prices.length; i++) {
      if(prices[i] < min){
        min = prices[i];
      }
      int p = prices[i] - min;
      if(profit < p){
        profit = p;
      }
    }
    return profit;
  }
  public static void main(String[] args) {
    int[] arr = {7,1,5,3,6,4};
    System.out.println("Profit is "+ maxProfit(arr));
  }

}
