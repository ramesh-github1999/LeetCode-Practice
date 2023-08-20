class Solution {
    public:
    void dfs(vector<vector<int>>& grid,vector<vector<bool>>&visited , int i, int j, int c,int n,int m,int key){
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]!=key|| visited[i][j]==true) return;
        visited[i][j]=true;
        dfs(grid,visited,i+1,j,c,n,m,key);
        dfs(grid,visited,i-1,j,c,n,m,key);
        dfs(grid,visited,i,j-1,c,n,m,key);
        dfs(grid,visited,i,j+1,c,n,m,key);
        
    }
    
    
    vector<vector<int>> colorBorder(vector<vector<int>>& grid, int row, int col, int color) {
        vector<vector<int>>original=grid;
        
        int n=grid.size();
        int m=grid[0].size();
        vector<vector<bool>>visited(n,vector<bool>(m,false));
        dfs(grid,visited,row,col,color,n,m,grid[row][col]);
        
       for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==true){
                    int cnt=4;
                    if(j>=1 && visited[i][j-1]) cnt--;
                    if(j+1<m && visited[i][j+1]) cnt--;
                    if(i>=1 && visited[i-1][j]) cnt--;
                    if(i+1<n && visited[i+1][j]) cnt--;
                    if(cnt!=0) {
                            grid[i][j]=color;
                    }
                }
            }
        }
        return grid;
    }
};