class SeatManager {
    PriorityQueue<Integer> seat;
    public SeatManager(int n) {
        seat = new PriorityQueue<>();
        for(int i=1;i<=n;i++)
        {
            seat.offer(i);
        }
    }
    
    public int reserve() {
        if(!seat.isEmpty())
        {
            int reservedSeat = seat.poll(); 
            return reservedSeat; 
        }
        else 
        {
            return -1;
        }
    }
    
    public void unreserve(int seatNumber) {
        seat.offer(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */