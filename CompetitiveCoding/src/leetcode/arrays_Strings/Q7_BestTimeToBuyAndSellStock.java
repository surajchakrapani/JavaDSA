package leetcode.arrays_Strings;

public class Q7_BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};//241
		System.out.println(maxProfit(prices));

	}

	public static int maxProfit(int[] prices) {
		
		int min = Integer.MAX_VALUE;
		int overallProfit = 0;
		int currentProfit = 0;
		
		for(int i=0;i<prices.length;i++) {
			int value = prices[i];
			
			if(value<min) {
				min = value;
			}
			
			currentProfit = value - min;
			if(overallProfit<currentProfit) {
				overallProfit = currentProfit;
			}
		}
		return overallProfit;
	}

}
