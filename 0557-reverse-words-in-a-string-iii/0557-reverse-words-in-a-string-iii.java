class Solution {
    public String reverseWords(String input) {
         StringBuilder nb=new StringBuilder();
        String str="";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)!=' ') nb.append(input.charAt(i));
            else{
                nb.reverse();
                str+=nb.toString();
                str+=" ";
                nb=new StringBuilder();
            }
        }
        nb.reverse();
        str+=nb.toString();
        return str;
    }
}
