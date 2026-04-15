class Solution {
    public int climbStairs(int n) {
        // n = 1, answer = 1
        // n = 2, answer = 1 + 1, 2
        // n = 3, answer = 1 + 1 + 1, 1 + 2, 2 + 1
        // n = 4, answer = 1 + 1 + 1 + 1, 1 + 1 + 2, 1 + 2 + 1, 2 + 1 + 1, 2 + 2

        if(n <= 2) return n;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
