class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        int n=nums.length;
            PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->{
                return b[0]-a[0];
            });
        int ans=nums[0];
        pq.add(new int[]{nums[0],0});
        for(int i=1;i<=k;i++){
            int temp=Math.max(nums[i],pq.peek()[0]+nums[i]);
            ans=Math.max(ans,temp);
            pq.add(new int[]{temp,i});
        }
        for(int i=k+1;i<n;i++){
            while(i-pq.peek()[1]>k) pq.poll();
            int temp=Math.max(nums[i],pq.peek()[0]+nums[i]);
            ans=Math.max(ans,temp);
            pq.add(new int[]{temp,i});
        }
        return ans;
    }
}