class Solution {
    public int minimumSemesters(int n, int[][] relations){
        int []indegree=new int [n+1];
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<=n;i++) graph.add(new ArrayList<>());
        for(int i=0;i<relations.length;i++){
            indegree[relations[i][1]]++;
            graph.get(relations[i][0]).add(relations[i][1]);
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=1;i<=n;i++) if(indegree[i]==0) q.add(i);
        int ans=0;
        while (q.isEmpty()==false){
            ans++;
            int size=q.size();
            for(int i=0;i<size;i++){
                int curr=q.poll();
                List<Integer>l=graph.get(curr);
                for(int j=0;j<l.size();j++){
                    indegree[l.get(j)]--;
                    if(indegree[l.get(j)]==0) q.add(l.get(j));
                }
            }
        }
        for(int i=1;i<=n;i++) if(indegree[i]!=0) return -1;
        return ans;

    } 
    
}