class Solution {
    public int connectSticks(int[] sticks) {
         PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<sticks.length;i++) pq.add(sticks[i]);
        int ans=0;
        while(pq.size()>1){
            int k=pq.poll(); 
            int l=pq.poll();
            ans+=(k+l);
            pq.add(k+l);
        }
        return ans;
    }
}