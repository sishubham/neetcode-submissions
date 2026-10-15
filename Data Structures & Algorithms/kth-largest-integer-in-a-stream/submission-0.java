class KthLargest {

    private PriorityQueue<Integer> Q;
    int k = 0;

    public KthLargest(int k, int[] nums) {
        Q = new PriorityQueue<>(k);
        this.k = k;
        for (int i : nums) {
            Q.offer(i);
            if (Q.size()>k)
                Q.poll();
        }
    }
    
    public int add(int val) {
        Q.offer(val);
        if (Q.size() > k)
            Q.poll();
        return Q.peek();
    }
}
