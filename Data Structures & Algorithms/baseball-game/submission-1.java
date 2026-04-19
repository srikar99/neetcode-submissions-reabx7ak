class Solution {
    public int calPoints(String[] operations) {
        
        int res = 0;
        Stack<Integer> stack = new Stack<>();

        for(String op : operations) {
            
            if(op.equals("+")) {
                int y = stack.pop();
                int z = stack.pop();
                int a = z + y;
                stack.push(y);
                stack.push(z);
                stack.push(a);
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