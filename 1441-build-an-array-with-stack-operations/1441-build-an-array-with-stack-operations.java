class Solution {
    public List<String> buildArray(int[] target, int n) {
         List<String> ans=new ArrayList<>();
        int size=target.length;
        int curr=0;
        for (int i = 0; i < size; i++) {
            while (curr<target[i]-1){
                ans.add("Push");
                ans.add("Pop");
                curr++;
            }
            ans.add("Push");
            curr++;
        }
        return ans;
    }
}