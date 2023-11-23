class Solution {
public:
    
    int numberOfArithmeticSlices(vector<int>& nums) {
        
        int n=nums.size();
        int ans=0;
        for(int i=0;i<n-2;i++){
           int d1=nums[i+1]-nums[i];
            for(int j=i+2;j<n;j++){
                int d2=nums[j]-nums[j-1];
                if(d1==d2) {
                    ans++;
                  //  cout<<i<<" "<<j<<" "<<d1<<endl;
                  //  break;
                }
               
                else break;
            }
        }
        return ans;
    }
};