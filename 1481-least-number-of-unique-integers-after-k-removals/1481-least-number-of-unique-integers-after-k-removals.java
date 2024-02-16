class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }   
         List<Map.Entry<Integer, Integer>> elements = new ArrayList<>(map.entrySet());
         elements.sort((a,b)->a.getValue()-b.getValue());
         for (Map.Entry<Integer, Integer> entry : elements) {
            if (entry.getValue() <= k) {
                k -= entry.getValue();
                map.remove(entry.getKey());
            } else {
                break;
            }
        }
        return map.size();
    }
}