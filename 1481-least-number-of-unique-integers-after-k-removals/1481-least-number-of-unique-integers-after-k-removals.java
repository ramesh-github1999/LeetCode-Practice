class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
         Map<Integer,Integer> mp=new HashMap<>();
      for(int it:arr){
          mp.put(it,mp.getOrDefault(it,0)+1);
      }
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
      for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
          pq.add(new int[]{entry.getValue(),entry.getKey()});
      }
      while (!pq.isEmpty()){
          if(pq.peek()[0]<=k){
              k-=pq.peek()[0];
              pq.poll();
          }
          else return pq.size();
      }
      return 0;
    }
}