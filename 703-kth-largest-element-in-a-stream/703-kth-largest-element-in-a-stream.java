class KthLargest {
    int k;
    private Queue<Integer> q;

    public KthLargest(int k, int[] nums) {
        q = new PriorityQueue<>();
        this.k = k;
        for(int i = 0; i < nums.length; i++){
            this.add(nums[i]);
        }
    }
    
    public int add(int val) {
        if(q.size() < k){
            q.offer(val);
        } else {
            if(q.peek() < val){
                q.poll();
                q.offer(val);
            }
        }
        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */