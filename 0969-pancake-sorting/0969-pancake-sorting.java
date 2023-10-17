class Solution {
        public static int find(int[] arr, int k){
        for(int i=0;i<arr.length;i++)
            if(arr[i]==k)return i;
        return 0;
    }

    public static void flip(int[] arr, int i){
       for(int idx=0;idx<i/2;idx++){
           int temp=arr[idx];
           arr[idx]=arr[i-1-idx];
           arr[i-1-idx]=temp;
       }
    }
    public List<Integer> pancakeSort(int[] arr) {

        int n=arr.length;
        List<Integer>l=new ArrayList<>();
        for(int k=n;k>0;k--){
            int i=find(arr,k);
            if(i==k-1) continue;
            if(i!=0){
              l.add(i+1);
              flip(arr,i+1);
            }
            l.add(k);
            flip(arr,k);
        }
        return l;

    }
    
   
}