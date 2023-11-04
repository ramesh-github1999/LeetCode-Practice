class Solution {
    public int maxProfit(int[] prices) {
         int n=prices.length;
        int mini=prices[0];
        int ans=0;
        for (int i = 1; i < n; i++) {
            ans=Math.max(ans,prices[i]-mini);
            mini=Math.min(prices[i],mini);
        }
        return ans;
    }
}