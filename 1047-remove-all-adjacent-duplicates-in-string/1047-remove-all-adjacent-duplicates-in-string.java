class Solution {
    public String removeDuplicates(String s) {
       StringBuilder t=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(t.length()==0) t.append(s.charAt(i));
            else {
                if(t.charAt(t.length()-1)==s.charAt(i))
                    t.deleteCharAt(t.length()-1);
                else t.append(s.charAt(i));
            }
        }
        return t.toString();
    }
}