class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i:map.values())
        {
            a.put(i,a.getOrDefault(i,0)+1);
            if(a.get(i)>1)
            return false;
        }
        return true;
    }
}