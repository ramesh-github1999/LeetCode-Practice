class Solution {
public:
    int binarySearch(vector<int>&v,int target){
        int ans=-1;
        int l=0;
        int r=v.size()-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(v[mid]<=target){
                ans=mid;
                l=mid+1;
            }
            else r=mid-1;
        }
        return ans;
    }
    int minOperations(vector<int>& nums) {
       int n=nums.size();
       set<int>st;
        for(auto it:nums)
            st.insert(it);
        vector<int>v;
        int ans=n;
        for(auto it:st) v.push_back(it);
        for(int i=0;i<v.size();i++){
            int left=v[i];
            int right=left+n-1;
            int j=binarySearch(v,right);
            int count=j-i;
            ans=min(ans,n-1-count);
           // cout<<j<<endl;
        }
        return ans;
        
    }
};