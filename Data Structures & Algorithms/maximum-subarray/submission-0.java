class Solution {
    public int maxSubArray(int[] nums) {

        int[] dp = new int[nums.length];
        dp[0] = nums[0];

        for(int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
        }

        int max = dp[0];

        for(int sum : dp) {
            max = Math.max(max, sum);
        }

        return max;
    }
}
