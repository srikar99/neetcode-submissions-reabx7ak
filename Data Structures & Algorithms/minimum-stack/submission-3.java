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
        if(heap.isEmpty() || heap.peek() >= val) {
            heap.push(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int top = stack.pop();

        if(top == heap.peek()) {
            heap.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return heap.peek();
    }
}
