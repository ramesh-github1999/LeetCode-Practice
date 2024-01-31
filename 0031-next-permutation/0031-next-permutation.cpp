class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int n=nums.size();
        int idx=0;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]) {
                idx=i; break;
             }
       }
        
        if(idx==0) {reverse(nums.begin(),nums.end()); return;}
        if(idx==n-1) {swap(nums[n-2],nums[n-1]); return; }
        
        int i=idx-1;
        int k=-1;
        for(int j=n-1;j>i;j--){
            if(nums[j]>nums[i]){
                k=j;
                break;
            }
        }
        swap(nums[i],nums[k]);
        reverse(nums.begin()+idx,nums.end());
                
        
    }
};