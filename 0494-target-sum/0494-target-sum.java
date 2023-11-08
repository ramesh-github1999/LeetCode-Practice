class Solution {
    public int findTargetSumWays(int[] nums, int target) {
         int n=nums.length;
        int sum=0;
        for(int it:nums) sum+=it;
        if(target>sum) return 0;
        if((sum+target)%2!=0) return 0;
        int m=(sum+target)/2;
        if(m<0) return 0;
        int t[][]=new int[n+1][m+1];
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=m ; j++) {
                if(j==0 && i==0) t[i][j]=1;
                else if(i==0) t[i][j]=0;
                else if(nums[i-1]<=j) t[i][j]=t[i-1][j]+t[i-1][j-nums[i-1]];
                else t[i][j]=t[i-1][j];
            }
        }
        return t[n][m];
    }
}