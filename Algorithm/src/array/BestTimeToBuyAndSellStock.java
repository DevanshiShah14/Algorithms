package array;

/*Dynamic Programming
 * 121. Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), 
design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
Example 2:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
*/
public class BestTimeToBuyAndSellStock {

	public static void main(String args[]) {
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		int profit = 0;
		int b = 0;
		int s = 1;
		
		while(s< prices.length) {
			int buy = prices[b];
			int sell = prices[s];
			profit = Math.max(sell-buy, profit);
			if(sell-buy<0) {
				b = s;
			}
				s++;
		}
		return profit;
	}
}
