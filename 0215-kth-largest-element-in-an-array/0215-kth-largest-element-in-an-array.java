class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i:nums)
        {
            q.offer(i);
            if(q.size()>k)
            {
                q.poll();
            }
        }
        return q.peek();
    }
}