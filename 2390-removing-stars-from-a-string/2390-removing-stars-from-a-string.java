class Solution {
    public String removeStars(String s) {
          int count=0;
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='*') count++;
            else {
                if(count>0) count--;
                else str+=s.charAt(i);
            }
        }
        StringBuilder str1=new StringBuilder(str);
        str1.reverse();
        return str1.toString();
    }
}