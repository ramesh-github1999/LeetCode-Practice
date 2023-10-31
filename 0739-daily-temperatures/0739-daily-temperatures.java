class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]>st=new Stack<>();
        int n=temperatures.length;
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while (st.size()>0 && st.peek()[0]<=temperatures[i])
                st.pop();
            if(st.size()==0) ans[i]=0;
            else ans[i]=st.peek()[1]-i;
            st.push(new int[]{temperatures[i],i});
        }
        return ans;
    }
}