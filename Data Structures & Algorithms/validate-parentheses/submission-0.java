class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else {
                return isValid(stack.pop(), c);
            }
        }

        return stack.isEmpty();
    }

    boolean isValid(char open, char close) {
        return ((open == '[' && close == ']') 
        || (open == '{' && close == '}') 
        || (open == '(' && close == ')'));
    }
}
