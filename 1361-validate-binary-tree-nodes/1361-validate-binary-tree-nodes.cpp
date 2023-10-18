class Solution {
public:
    int findroot(int n,vector<int>&left,vector<int>&right){
        unordered_set<int>s;
        s.insert(left.begin(),left.end());
        s.insert(right.begin(),right.end());
        for(int i=0;i<n;i++){
            if(s.find(i)==s.end()) return i;
        }
        return -1;
    }
    bool validateBinaryTreeNodes(int n, vector<int>& left, vector<int>& right) {
        int root=findroot(n,left,right);
        if(root==-1) return false;
        stack<int>st;
        unordered_set<int>seen;
        seen.insert(root);
        st.push(root);
        while(!st.empty()){
            int node=st.top();
            st.pop();
            int leftchild=left[node];
            int rightchild=right[node];
            if(leftchild!=-1){
                if(seen.find(leftchild)!=seen.end()) return false;
                st.push(leftchild);
                seen.insert(leftchild);
            }
            if(rightchild!=-1){
                if(seen.find(rightchild)!=seen.end()) return false;
                st.push(rightchild);
                seen.insert(rightchild);
            }
        }
        return seen.size()==n;
        
    }
};