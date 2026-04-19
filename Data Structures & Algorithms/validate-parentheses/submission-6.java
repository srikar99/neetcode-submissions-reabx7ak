class Solution {
    public boolean isValid(String s) {
        
       Stack<Character> stack = new Stack<>();

       for(char i : s.toCharArray()) {
            if(i == '[' || i == '{' || i == '(') {
                stack.push(i);
            } else if(!stack.isEmpty()){
                if(!isValid(stack.peek(), i)) {
                    return false;
                } else {
                    stack.pop();
                }
            }
       }

       return stack.isEmpty();
    }

    private boolean isValid(char open, char close) {
        return (open == '[' && close == ']') 
        || (open == '{' && close == '}') 
        || (open == '(' && close == ')');
    }
}
