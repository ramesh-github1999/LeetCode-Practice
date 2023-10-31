class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
         int n=nums1.length;
        int m=nums2.length;
        int dp[][]=new int [n][m];

        for (int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(i==n-1 && j==m-1) dp[i][j]=nums1[i]*nums2[j];
                else if(i==n-1) dp[i][j]=Math.max(dp[i][j+1],nums1[i]*nums2[j]);
                else if(j==m-1) dp[i][j]=Math.max(dp[i+1][j],nums1[i]*nums2[j]);
                else {
                    int pro=nums1[i]*nums2[j];
                    int max1=Math.max(dp[i+1][j+1],dp[i+1][j+1]+pro);
                    int max2=Math.max(dp[i+1][j],dp[i][j+1]);
                    dp[i][j]=Math.max(pro,Math.max(max1,max2));
                }
            }
        }
      /*  for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }*/
        int maxi=Integer.MIN_VALUE;
        for (int i=n-1;i>=0;i--) {
            for (int j = m - 1; j >= 0; j--) {
                maxi = Math.max(dp[i][j], maxi);
            }
        }
        return maxi;
    }
}