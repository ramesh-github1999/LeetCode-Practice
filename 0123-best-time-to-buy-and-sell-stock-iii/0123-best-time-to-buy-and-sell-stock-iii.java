class Solution {
    public int maxProfit(int[] prices) {
        // aaj ya aaj ke phle sell krte h to maxm
        int n=prices.length;
        int []ltr=new int [n];
        int mini=prices[0];
        int profit=0;
        for (int i = 0; i < n; i++) {
            mini=Math.min(mini,prices[i]);
            ltr[i]=Math.max(profit,prices[i]-mini);
            profit=ltr[i];
        }
        // agr aaj ya aaj ke bad buy krke kitna maxm kma skte h
        int []rtl=new int[n];
        int maxi=prices[n-1];
        profit=0;
        for (int i=n-1;i>=0;i--){
            maxi=Math.max(maxi,prices[i]);
            rtl[i]=Math.max(profit,maxi-prices[i]);
            profit=rtl[i];
        }
        int ans=0;
        for (int i = 0; i < n; i++) {
            ans=Math.max(ans,ltr[i]+rtl[i]);
        }
        return ans;
    }
}