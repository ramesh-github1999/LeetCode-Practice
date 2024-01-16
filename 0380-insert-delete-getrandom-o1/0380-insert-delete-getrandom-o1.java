class RandomizedSet {
  Map<Integer,Integer>mp;
    List<Integer>v;
   Random rand=new Random();
    public RandomizedSet() {
        mp=new HashMap<>();
        v=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(mp.containsKey(val)) return false;
        mp.put(val,v.size());
        v.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!mp.containsKey(val)) return false;
        int lastEle=v.get(v.size()-1);
        int idx=mp.get(val);
        v.set(idx,lastEle);
        mp.put(lastEle,idx);
        mp.remove(val);
        v.remove(v.size()-1);
        return true;
    }
    
    public int getRandom() {
        return v.get(rand.nextInt(v.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */