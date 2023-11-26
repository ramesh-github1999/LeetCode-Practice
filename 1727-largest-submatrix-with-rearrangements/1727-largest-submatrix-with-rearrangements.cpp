class Solution {
public:
    int largestSubmatrix(vector<vector<int>>& matrix) {
        int n = matrix.size(); 
    int m = matrix[0].size();

    vector<vector<int>> dp(n, vector<int>(m, 0));

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (matrix[i][j] == 0)
                dp[i][j] = 0;
            else {
                dp[i][j] = (i > 0) ? dp[i - 1][j] + 1 : 1;
            }
        }
    }

    /*for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cout << dp[i][j] << " ";
        }
        cout << endl;
    }*/
    
        int ans=0;
        for(int i=0;i<n;i++){
            vector<int>curr=dp[i];
            sort(curr.rbegin(),curr.rend());
            for(int j=0;j<m;j++){
                ans=max(ans,curr[j]*(j+1));
            }
        }
        return ans;

    }
};