class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        PriorityQueue<Double> pq=new PriorityQueue<>();
        for (int i = 0; i < dist.length; i++) {
            pq.add( (double)dist[i]/speed[i]);
        }
       
        int ans=0;
        while (pq.size()>0 && pq.peek()>ans){
            ans++;
            pq.poll();
        }
        return ans;
    }
}