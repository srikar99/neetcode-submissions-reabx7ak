class MinStack {

    private int min;
    private Stack<Integer> stack;
    private PriorityQueue<Integer> pq;
    public MinStack() {
        min = Integer.MAX_VALUE;
        stack = new Stack<>();
        pq = new PriorityQueue<>();
    }
    
    public void push(int val) {
        pq.add(val);
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
        pq.poll();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return pq.peek();
    }
}
