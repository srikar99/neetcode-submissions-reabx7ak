class Solution {
    public int calPoints(String[] operations) {
        
        int res = 0;
        Stack<Integer> stack = new Stack<>();

        for(String op : operations) {
            
            if(op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else if(op.equals("C")) {
                stack.pop();
            } else if(op.equals("D")) {
                int x = stack.peek();
                stack.push(x * 2);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        while(!stack.isEmpty()) {
            int val = stack.pop();
            System.out.println(val);
            res += val;
        }

        return res;
    }
}