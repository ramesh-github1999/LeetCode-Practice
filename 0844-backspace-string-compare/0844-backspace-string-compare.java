class Solution {
    public boolean backspaceCompare(String s, String t) {
        String a="";
        String b="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#') a+=s.charAt(i);
            else{
                if(a.length()>0) a=a.substring(0,a.length()-1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#') b+=t.charAt(i);
            else{
                if(b.length()>0) b=b.substring(0,b.length()-1);
            }
        }

        if(a.equals(b)) return true;
        else return false;
    }
}