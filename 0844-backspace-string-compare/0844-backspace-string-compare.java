class Solution {
      public String remove(String s){
        int count=0;
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#') count++;
            else {
                if(count>0) count--;
                else str+=s.charAt(i);
            }
        }
        return str;
    }
     public boolean backspaceCompare(String s, String t){
       return remove(s).equals(remove(t));

    }
   
}
// a 0
// a 0

