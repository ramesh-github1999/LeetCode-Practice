class Solution {
public:
    bool find132pattern(vector<int>& nums) {
       int n=nums.size();
        if(n<3) return false;
      vector<int>lmin(n,0);
        lmin[0]=nums[0];
        for(int i=1;i<n;i++)
            lmin[i]=min(lmin[i-1],nums[i]);
        
        
        
        stack<int>st;
        st.push(nums[n-1]);
        for(int j=n-2;j>=1;j--){
            while(st.size()>0 && st.top()<=lmin[j-1]) st.pop();
            if(st.size()>0 && st.top()<nums[j] && lmin[j-1]<nums[j]) return true;
            st.push(nums[j]);
        }
        
        return false;
    }
};