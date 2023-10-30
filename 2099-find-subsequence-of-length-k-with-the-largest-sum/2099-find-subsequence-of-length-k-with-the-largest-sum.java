class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int [] ans=new int[k];
        int n=nums.length;
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<n;i++){
            pq.add(new int[]{nums[i],i});
            if(pq.size()>k) pq.poll();
        }
        Set<Integer> st=new HashSet<>();
        while (pq.size()>0){
            st.add(pq.poll()[1]);
        }
        int index=0;
        for(int i=0;i<n;i++){
            if(st.contains(i)) ans[index++]=nums[i];
        }
        return ans;
    }
}