class Solution {
public:
    int solve(vector<int>& arr,map<pair<int,int>,int>&mp,int left,int right,vector<vector<int>>&dp){
        if(left==right) return 0;
        if(dp[left][right]!=-1) return dp[left][right];
        int ans=INT_MAX;
        for(int k=left;k<right;k++){
            ans=min(ans,mp[{left,k}]*mp[{k+1,right}]+solve(arr,mp,left,k,dp)+solve(arr,mp,k+1,right,dp));
        }
        return dp[left][right]=ans;
    }
    int mctFromLeafValues(vector<int>& arr) {
        map<pair<int,int>,int>mp; // for storing the maximum value
        int n=arr.size();
        for(int i=0;i<n;i++){
            mp[{i,i}]=arr[i];
            for(int j=i+1;j<n;j++){
                mp[{i,j}]=max(arr[j],mp[{i,j-1}]);
            }
        }
        vector<vector<int>>dp(n,vector<int>(n,-1));
        return solve(arr,mp,0,n-1,dp);
        
    }
};