class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map=new HashMap<>();
        List<String> list=new ArrayList<>();
        int sum=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++) map.put(list1[i],i);
        for(int i=0;i<list2.length;i++){
            Integer k=map.get(list2[i]);
            if(k!=null && k+i<sum){
                list.clear();
                sum=k+i;
                list.add(list2[i]);
            }
            else if(k!=null && k+i<=sum){
                list.add(list2[i]);
            }
        }
        return list.toArray(new String[list.size()]); 
    }
}