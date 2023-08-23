class Pair implements Comparable<Pair> {
            int v;
            char ch;

            public Pair(int v, char ch) {
                this.v = v;
                this.ch = ch;
            }

            @Override
            public int compareTo(Pair that) {
                return this.v- that.v;
            }
        }

class Solution {
   
    public String reorganizeString(String s) {
        int n=s.length();
        Map<Character,Integer>mp=new HashMap<>();
       // for(char c:s.toCharArray())
          //  mp.put(c,mp.getOrDefault(c,0)+1);
        for(int i=0;i<n;i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
       
        for(Map.Entry<Character,Integer> it:mp.entrySet()){
            if(n%2==0 && it.getValue()>(n/2)) return "";
            else if(n%2!=0 && it.getValue()>(n+1)/2) return "";
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(Map.Entry<Character,Integer>it:mp.entrySet()){
            pq.add(new Pair(it.getValue(),it.getKey()));

        }
       char []charArray=new char[n];
        int i=0;
        while(pq.isEmpty()==false){
            Pair p=pq.poll();
            int k=p.v;
            char c=p.ch;
           // System.out.println(k+" "+c);
            while(k>0){
                if(i<n){
                charArray[i]=c;
                    i+=2;
                }
                if(i>=n) i=1;
                k--;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int j=0;j<n;j++){
            ans.append(charArray[j]);
        }
        
        return ans.toString();
    }
}