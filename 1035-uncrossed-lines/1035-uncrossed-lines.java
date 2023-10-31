class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
         int n=nums1.length;
        int m=nums2.length;
        int dp[][]=new int [n][m];
        for (int i = n-1; i >=0; i--) {
            for (int j = m-1; j >=0; j--) {
                if(i==n-1 && j==m-1){
                    if(nums1[i]==nums2[j]) dp[i][j]=1;
                    else dp[i][j]=0;
                }
                else if(i==n-1) {
                    if(nums1[i]==nums2[j]) dp[i][j]=1;
                    else dp[i][j]=dp[i][j+1];
                }
                else if(j==m-1){
                    if(nums1[i]==nums2[j]) dp[i][j]=1;
                    else dp[i][j]=dp[i+1][j];
                }
                else {
                    if(nums1[i]==nums2[j]){
                        int max1=1+dp[i+1][j+1];
                        int max2=Math.max(dp[i+1][j],dp[i][j+1]);
                        dp[i][j]=Math.max(max1,max2);
                    }
                    else dp[i][j]=Math.max(dp[i+1][j+1],Math.max(dp[i+1][j],dp[i][j+1]));
                }
            }
        }
        int maxi=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maxi=Math.max(dp[i][j],maxi);
            }
            
        }
        return maxi;
    }
}