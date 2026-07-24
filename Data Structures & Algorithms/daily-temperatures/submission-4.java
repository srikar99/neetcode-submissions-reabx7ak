class Pair {
    int temp;
    int index;

    Pair(int temp, int index) {
        this.temp = temp;
        this.index = index;
    }
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Pair> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            int temp = temperatures[i];

            while(!stack.isEmpty() && temp > stack.peek().temp) {
        
                int idx = stack.pop().index;
                res[idx] = i - idx;
            }

            stack.push(new Pair(temp, i));
        }

        return res;
    }
}
