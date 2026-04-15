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
        int[] res = new int[temperatures.length];
        Stack<Pair> stack = new Stack<>();

        for(int i = 0; i < temperatures.length; i++) {
            int t = temperatures[i];

            while(!stack.isEmpty() && t > stack.peek().temp) {
                Pair pair = stack.pop();
                res[pair.index] = i - pair.index;
            }

            stack.push(new Pair(t, i));
        }

        return res;
    }
}
