class MyHashMap {

        HashMap<Integer,Integer> map = new HashMap<>();
    public MyHashMap() {
    }
    
    public void put(int key, int value) {
        // map.put(key,map.getOrDefault(key,value)+1);
            map.put(key,value);
        
    }
    
    public int get(int key) {
        if(map.get(key)==null) return -1;
        return map.get(key);
    }
    
    public void remove(int key) {
        map.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */