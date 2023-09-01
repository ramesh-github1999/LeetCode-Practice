class Solution {
public:
    int firstMissingPositive(vector<int>& A) {
        int n=A.size();
    vector<int>v(n+2,0);
    for(int i=0;i<n;i++){
        if(A[i]<=0 || A[i]>n+1) continue;
        else v[A[i]]++;
    }
    for(int i=1;i<=n+1;i++){
        if(v[i]==0) return i;
    }
    return -1;
    }
};