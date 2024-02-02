package leetcode.arrays_Strings;

public class Q8_BestTimeToBuyAndSellStock2 {

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 }; 
		System.out.println(maxProfit(prices));//7
	}

	public static int maxProfit(int[] prices) {

		int min = Integer.MAX_VALUE;
		int overallProfit = 0;
		int profit = 0;
		int currentProfit = 0;

		for (int i = 0; i < prices.length -1; i++) {
			if(prices[i+1]<prices[i]) {
				min=prices[i+1];
			}else {
				min = prices[i];
			}
			currentProfit = prices[i+1] - min;
			if(profit<currentProfit) {
				profit = currentProfit;
				overallProfit += profit;
				profit =0;
			}
		}
		return overallProfit;
	}
}
