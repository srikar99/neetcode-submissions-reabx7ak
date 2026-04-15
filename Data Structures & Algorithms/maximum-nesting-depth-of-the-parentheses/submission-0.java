class Solution {
    public int maxDepth(String s) {
        
        Stack<Character> stack = new Stack();
        int res = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                res = Math.max(res, stack.size());
            } else if(s.charAt(i) == ')') {
                stack.pop();
            }
        }

        return res;
    }
}