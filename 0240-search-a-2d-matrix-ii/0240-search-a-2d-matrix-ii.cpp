class Solution {
public:
    bool searchMatrix(vector<vector<int>>& a, int t) {
        int n=a.size();
        int m=a[0].size();
        for(int i=0;i<n;i++){
            int l=0,h=m-1;
            while(l<=h){
                int mid=(l+h)/2;
                if(a[i][mid]==t) return true;
                else if(a[i][mid]>t) h=mid-1;
                else l=mid+1;
            }
        }
        return false;
    }
};