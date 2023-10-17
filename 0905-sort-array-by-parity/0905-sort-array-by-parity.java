class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int i=0;
        int n=nums.length;
      int j=nums.length-1;
      while (i<=j){
          while(i<n && nums[i]%2==0) i++;
          while(j>=0 && nums[j]%2==1) j--;
         if(j<i) return nums;
          int x=nums[i];
          nums[i]=nums[j];
          nums[j]=x;
          i++;
          j--;
      }
      return nums;
    }
}