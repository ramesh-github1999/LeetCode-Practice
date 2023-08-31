class NumMatrix {
public:
vector<vector<int>>v,mat;
        int n,m;
        map<pair<int,int>,int>mp;
    NumMatrix(vector<vector<int>>& matrix) {
        mat=matrix;
         n=matrix.size();
        m=matrix[0].size();
        v.resize(n+1,vector<int>(m+1,0));
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                // v[i][j]+=v[i-1][j]+v[i][j-1]-v[i-1][j-1]; addd 1 in its index
                v[i+1][j+1]+=v[i][j+1]+v[i+1][j]-v[i][j]+matrix[i][j];
            }
        }
    }
    
    void update(int row, int col, int val) {
        val-=mat[row][col];
        
       // cout<<val<<endl;
        if(mp.find({row,col})!=mp.end()) {
            pair<int,int>f;
            mp.erase({row,col});
            mp.insert({{row,col},val});
        }
        else
        mp.insert({{row,col},val});
    }
    
    int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0;
        for(auto i:mp){
            pair<int,int>it=i.first;
           // cout<<it.first<<" "<<it.second<<" "<<i.second<<endl;
            if(it.first>=row1 && it.first<=row2 && it.second>=col1 && it.second<=col2 )
            sum+=i.second;

        }
     //   cout<<sum<<endl;
        return sum+v[row2+1][col2+1]-v[row1][col2+1]-v[row2+1][col1]+v[row1][col1];

    }
};

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix* obj = new NumMatrix(matrix);
 * obj->update(row,col,val);
 * int param_2 = obj->sumRegion(row1,col1,row2,col2);
 */