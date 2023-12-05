class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int []>q = new PriorityQueue<>((a,b)->a[0]+a[1]-b[0]-b[1]);
        List<List<Integer>> res = new ArrayList<>();
        if(nums1.length==0||nums2.length==0||k==0) return res;
        for(int i=0;i<nums1.length&&i<k;i++) q.offer(new int[]{nums1[i],nums2[0],0});
        while(k-->0 && !q.isEmpty())
        {
            int[] curr = q.poll();
            res.add(List.of(curr[0],curr[1]));
            if(curr[2]==nums2.length-1) continue;
            q.offer(new int[]{curr[0],nums2[curr[2]+1],curr[2]+1});
        }
        return res;
    }
}