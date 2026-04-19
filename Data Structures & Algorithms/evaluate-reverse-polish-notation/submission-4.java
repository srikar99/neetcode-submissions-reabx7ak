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
                    stack.push(y - x);
                }

                if(token.equals("*")) {
                    stack.push(x * y);
                }

                if(token.equals("/")) {
                    int div = Math.max(x, y);
                    int divisor = Math.min(x, y);

                    if(divisor == 0) stack.push(0);
                    else stack.push(div/divisor);
                }
            }
        }

        return stack.pop();
    }

    boolean isSymbol(String s) {
        return (s.equals("*") || s.equals("-") || s.equals("+") || s.equals("/"));
    }
}
