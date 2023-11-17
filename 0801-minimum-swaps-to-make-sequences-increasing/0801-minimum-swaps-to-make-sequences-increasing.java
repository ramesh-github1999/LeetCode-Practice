class Solution {
    int memo[][];
    int solve(int []nums1,int []nums2,int swapped,int idx){
        if(idx==nums1.length) return 0;
        if(memo[idx][swapped]!=-1) return memo[idx][swapped];
         int prev1=nums1[idx-1];
        int prev2=nums2[idx-1];
        if(swapped==1){
            int k=prev1;
            prev1=prev2;
            prev2=k;
        }
        int ans=Integer.MAX_VALUE;
        if(nums1[idx]>prev1  && nums2[idx]>prev2){
           // swapped=0;
            ans=solve(nums1,nums2,0,idx+1);
        }
        if(nums1[idx]>prev2 && nums2[idx]>prev1){
           // swapped=1;
            ans=Math.min(ans,1+solve(nums1,nums2,1,idx+1));
        }
        
        return memo[idx][swapped]=ans;

    }
    public int minSwap(int[] nums1, int[] nums2) {
         int n=nums1.length;
       memo=new int[n+1][2];
       int [] arr1=new int [n+1];
       arr1[0]=-1;
       for(int i=1;i<=n;i++) arr1[i]=nums1[i-1];
        int [] arr2=new int [n+1];
        arr2[0]=-1;
        for(int i=1;i<=n;i++) arr2[i]=nums2[i-1];
       for(int [] it:memo){
           Arrays.fill(it,-1);
        }
      return solve(arr1,arr2,0,1);
    }
}