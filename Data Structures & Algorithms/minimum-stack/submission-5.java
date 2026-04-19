class MinStack {

    private int min;
    private Stack<Integer> stack;
    private Stack<Integer> heap;

    public MinStack() {
        min = Integer.MAX_VALUE;
        stack = new Stack<>();
        heap = new Stack<>();
    }
    
    public void push(int val) {
        
        stack.push(val);
        if(heap.isEmpty()) {
            min = val;
            heap.push(val);
        } else {
            if(min > val) {
                heap.push(val);
                min = val;
            }
        }
    }
    
    public void pop() {
        int pop = stack.pop();
        if(pop == min) heap.pop();
        min = heap.peek();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}
