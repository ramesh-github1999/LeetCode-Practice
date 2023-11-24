class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        // 2,4,1,2,7,8
        // 1 2 2 4 7 8 9 10 11 
        int ans=0;
        int n=piles.length;
        for(int i=n-2;i>=n/3;i-=2){
            ans+=piles[i];
        }
        return ans;
    }
}