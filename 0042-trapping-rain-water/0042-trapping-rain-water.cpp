class Solution {
public:
    int trap(vector<int>& A) {
        int n=A.size();
    int i=0,j=n-1;
    int maxL=0,maxR=0;
    int ans=0;
    while(i<j){
        if(A[i]<=A[j]){
            if(maxL<=A[i]) maxL=A[i];
            else ans+=maxL-A[i];
            i++;
        }
        else{
            if(maxR<=A[j]) maxR=A[j];
            else ans+=maxR-A[j];
            j--;
        }
    }
    return ans;
    }
};

