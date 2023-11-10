class Solution {
    Map<Integer, List<Integer>>mp=new HashMap<>();
    int []ans;
    void dfs(int node,int prev,int i){
        ans[i]=node;
        for (int neighbor : mp.get(node)) {
            if (neighbor != prev) {
                dfs(neighbor, node,i+1);
            }
        }
    }
    public int[] restoreArray(int[][] adjacentPairs) {
        int n = adjacentPairs.length;
        for (int[] edge : adjacentPairs) {
            int x = edge[0];
            int y = edge[1];

            if (!mp.containsKey(x)) {
                mp.put(x, new ArrayList());
            }

            if (!mp.containsKey(y)) {
                mp.put(y, new ArrayList());
            }

            mp.get(x).add(y);
            mp.get(y).add(x);
        }
        ans=new int[mp.size()];
        int root = 0;
        for (int it:mp.keySet()) {
            if (mp.get(it).size() == 1) {
                root = it;
            }
        }

        dfs(root, Integer.MAX_VALUE,0);
        return ans;
 }

}