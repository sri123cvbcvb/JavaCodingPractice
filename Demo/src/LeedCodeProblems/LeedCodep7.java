package LeedCodeProblems;

import java.util.Scanner;

/*
 121. Best Time to Buy and Sell Stock
 you are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. 
 Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 */

class Solution7 {
    public int maxProfit(int[] prices) {
    	int min = Integer.MAX_VALUE;
    	int max = 0;
    	
    	for(int price : prices){
    		if(price < min){
    			min = price;
    		}
    		else{
    			int profit = price - min;
    			if(profit > max){
    				max = profit;
    				System.out.println("New maxProfit found: " + max + " (Sell at " + price + ")");
    			}
    		}
    	}
		return 0;
        
    }
}
public class LeedCodep7 {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		
		/*Scanner sc= new Scanner(System.in);
		System.out.println("enter the profit booking day between ");*/
	Solution7 s7 = new Solution7();
	s7.maxProfit(prices);
	}

}
