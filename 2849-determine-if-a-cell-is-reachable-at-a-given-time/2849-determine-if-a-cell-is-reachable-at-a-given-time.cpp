class Solution {
public:
    bool isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(sx==fx &&sy==fy){
            if(t==1) return false;
            else return true;
        }
        int k=sqrt(pow(fx-sx,2)+pow(fy-sy,2));
        int k2=abs(sx-fx);
        int k3=abs(sy-fy);
        int mini=min(k,max(k2,k3));
       //  cout<<k<<" "<<mini;
        return mini<=t;
    }
};