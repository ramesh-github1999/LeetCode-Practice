class Solution {
    public String removeStars(String s) {
         String a="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*') a+=s.charAt(i);
            else {
                if(a.length()>0) a=a.substring(0,a.length()-1);
            }
        }
       return a;
    }
}