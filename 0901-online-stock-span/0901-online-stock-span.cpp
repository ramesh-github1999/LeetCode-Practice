class StockSpanner {
public:
   StockSpanner() {
        
    }
    int i=0;
   
    stack<pair<int,int>> s;
    int next(int price) {
     
        while(!s.empty() && s.top().first<=price){
            s.pop();
             
        }
        int k=0;
        if(s.size()==0) k=i+1;
        else k= i-s.top().second;
        s.push({price,i});
        i++;
       return k;
    }
};


    

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner* obj = new StockSpanner();
 * int param_1 = obj->next(price);
 */