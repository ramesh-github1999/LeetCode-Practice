class Solution {
       public int numSubseq(int[] nums, int target) {
        
       int n=nums.length;
           Arrays.sort(nums);
        int []po=new int[n];
        int mod=1000*1000*1000+7;
        po[0]=1;
        for (int i = 1; i < n; i++) {
            po[i]=(po[i-1]*2)%mod;
            
        }
       int i=0;
       int j=n-1;
           int ans=0;
       while (i<=j){
           if(nums[i]+nums[j]<=target){
               int k=po[j-i];
               ans+=k;
               ans%=mod;
               i++;
           }
          else j--;
       }
       return ans;
    }
    
}