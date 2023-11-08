class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if (sx==fx && sy==fy){
            if(t==1) return false;
            return true;
        }
        return Math.max(Math.abs(sx-fx),Math.abs(sy-fy))<=t;
    }
}