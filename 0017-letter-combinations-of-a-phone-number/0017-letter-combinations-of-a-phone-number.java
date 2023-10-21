class Solution {
    static String []l={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> res=new ArrayList<>();
    public  void fun(String digits,String ans,int i){
        if(i==digits.length()) {
            res.add(ans);
            return;
        }
        int index=digits.charAt(i)-'0';
        String str=l[index];
        for(int j=0;j<str.length();j++) {
            //ans += str.charAt(j);
            fun(digits, ans+str.charAt(j), i + 1);
        }

    }

    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) {
            //List<String>l=new ArrayList<>();
          //  return l;
            return new ArrayList<>();
        }
        fun(digits,"",0);
        return res;
    }
}