class Solution {
   public int binarySearch(int []v,int target){
        int ans=-1;
        int l=0;
        int r=v.length-1;
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
    public int minOperations(int[] nums) {
        int n=nums.length;
       Set<Integer>st=new TreeSet<>();
        for(int it:nums)
            st.add(it);
        int []v=new int[st.size()];
        int index=0;
        int ans=n;
        for(int num:st) v[index++]=num;
        for(int i=0;i<v.length;i++){
            int left=v[i];
            int right=left+n-1;
            int j=binarySearch(v,right);
            int count=j-i;
            ans=Math.min(ans,n-1-count);
           // cout<<j<<endl;
        }
        return ans;
        
    }
}