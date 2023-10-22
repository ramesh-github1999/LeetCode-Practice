class Solution {
    public int maximumScore(int[] nums, int k) {
     int n=nums.length;

        int i=k,j=k,res=nums[k],currMin=nums[k];
        while (i>0 || j<n-1){
            if(i==0) j++;
            else if(j==n-1) i--;
           else if(nums[i-1]<nums[j+1]) {
                j++;
            }
            else {
                i--;
            }
           currMin=Math.min(currMin,Math.min(nums[i],nums[j]));
            res=Math.max(currMin*(j-i+1),res);


        }
        return res;

    }
}


