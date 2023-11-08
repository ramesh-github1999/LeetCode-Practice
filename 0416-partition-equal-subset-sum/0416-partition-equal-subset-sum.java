class Solution {
    public boolean canPartition(int[] nums) {
         int n=nums.length;
        int sum=0;
        for(int it:nums) sum+=it;
        if(sum%2==1) return false;
        int m=sum/2;
        boolean t[][]=new boolean[n+1][m+1];
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=m; j++) {
                if(j==0) t[i][j]=true;
                else if(i==0) t[i][j]=false;
                else if(nums[i-1]<=j) t[i][j]=t[i-1][j] || t[i-1][j-nums[i-1]];
                else t[i][j]=t[i-1][j];
            }
        }
        return t[n][m];
    }
}