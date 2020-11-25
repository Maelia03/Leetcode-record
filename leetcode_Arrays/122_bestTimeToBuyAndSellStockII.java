//题目：一个数组，低买高卖，计算最大盈利。
//我的解题思路：有些取巧，因为判断只要比前一个大就计算差，将差算和。


class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i=1; i < prices.length; i++){
            if (prices[i] >= prices[i-1]){
                profit = profit + (prices[i]-prices[i-1]);
            }
            else{
                continue;
            }                
        }
        return profit;
    }
}
