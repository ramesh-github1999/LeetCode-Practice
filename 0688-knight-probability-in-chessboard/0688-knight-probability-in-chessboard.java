class Solution {
       
    public double knightProbability(int n, int k, int row, int column) {
        double curr[][]=new double[n][n];
        double next[][]=new double[n][n];
        curr[row][column]=1;
        int di[]={1,2,1,2,-1,-1,-2,-2};
        int dj[]={2,1,-2,-1,2,-2,1,-1};
        for (int step = 0; step <k ; step++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <n; j++) {
                    if(curr[i][j]!=0){
                        for(int y=0;y<8;y++){
                            int ni=i+di[y];
                            int nj=j+dj[y];
                            if(ni>=0 && ni<n && nj>=0 && nj<n){
                                next[ni][nj]+=curr[i][j]/8.0;
                            }
                        }
                    }
                }
            }
            double next2[][]=new double[n][n];
            curr=next;
            next=next2;

        }
        double ans=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                ans+=curr[i][j];
            }
        }
        return ans;

    }

}