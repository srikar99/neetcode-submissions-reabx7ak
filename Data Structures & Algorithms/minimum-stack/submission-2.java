class MinStack {

    private int min;
    private Stack<Integer> stack;
    private Stack<Integer> pq;
    public MinStack() {
        min = Integer.MAX_VALUE;
        stack = new Stack<>();
        pq = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(pq.isEmpty() || val <= pq.peek()) {
            pq.push(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;

        int top = stack.pop();
        if(top == pq.peek()) pq.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return pq.peek();
    }
}
