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
            int temp = temperatures[i];

            while(!stack.isEmpty() && temp > stack.peek().temp) {
                Pair pair = stack.pop();

                int idx = pair.index;

                res[idx] = i - idx;
            }

            stack.push(new Pair(temp, i));
        }

        return res;
    }
}
