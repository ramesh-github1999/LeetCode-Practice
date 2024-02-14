class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        vector<int>a,b,ans;
        for(int i=0;i<nums.size();i++){
            if(nums[i]>0) a.push_back(nums[i]);
            else b.push_back(nums[i]);
        }
        int i=0,j=0, k=0;
        while(i<a.size() && j<b.size()){
           if(k%2==0) ans.push_back(a[i++]);   
            else ans.push_back(b[j++]);  
            k++;
        }
        ans.push_back(b[j]);
        return ans;
        
    }
};