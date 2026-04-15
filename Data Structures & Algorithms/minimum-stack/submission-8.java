class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> heap;

    public MinStack() {
        stack = new Stack<>();
        heap = new Stack<>();
    }
    
    public void push(int val) {
        
        stack.push(val);
        if(heap.isEmpty() || val <= heap.peek()) {
            heap.push(val);
        }
    }
    
    public void pop() {
        int pop = stack.pop();
        if(pop == heap.peek()) heap.pop();

    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return heap.peek();
    }
}
