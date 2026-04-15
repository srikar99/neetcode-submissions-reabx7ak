class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        // 2, 4, -4, -1

        for(int a : asteroids) {
            while(!stack.isEmpty() && a < 0 && stack.peek() > 0) {
                int diff = a + stack.peek();

                if(diff < 0) {
                    stack.pop();
                } else if(diff > 0) a = 0;
                else {
                    a = 0;
                    stack.pop();
                }
            }

            if(a != 0) {
                stack.push(a);
            }
        }

        return stack.stream().mapToInt(a -> a).toArray();
    }
}