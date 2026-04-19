class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens) {

            if(!isSymbol(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int x = stack.pop();
                int y = stack.pop();

                if(token.equals("+")) {
                    stack.push(x + y);
                }

                if(token.equals("-")) {
                    stack.push(x - y);
                }

                if(token.equals("*")) {
                    stack.push(x * y);
                }

                if(token.equals("/")) {
                    stack.push(x / y);
                }
            }
        }

        return Math.abs(stack.pop());
    }

    boolean isSymbol(String s) {
        return (s.equals("*") || s.equals("-") || s.equals("+") || s.equals("/"));
    }
}
