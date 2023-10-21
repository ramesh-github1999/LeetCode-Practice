class Solution {
    static String []l={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> res=new ArrayList<>();
    public void fun(String que,String ans){
        if(que.length()==0){
            res.add(ans);
            return;
        }
        
        int first=que.charAt(0)-'0';
        String roq=que.substring(1,que.length());
        String chcode=l[first];
        for(int i=0;i<chcode.length();i++){
            fun(roq,ans+chcode.charAt(i));
        }
    }

    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) {
            //List<String>l=new ArrayList<>();
          //  return l;
            return new ArrayList<>();
        }
        fun(digits,"");
        return res;
    }
}