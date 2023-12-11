class Solution {
public:
    int findSpecialInteger(vector<int>& arr) {
        int n=arr.size();
        if(n==1) return arr[0];
        int k=n/4;
        
        for(int i=0;i<n-k;i++){
            if(arr[i]==arr[i+k]) return arr[i];
        }
        return 0;
        
    }
};