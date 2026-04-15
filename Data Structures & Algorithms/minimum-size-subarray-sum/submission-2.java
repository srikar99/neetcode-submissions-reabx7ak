class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        

        int l = 0, r = 0;
        int sum = 0;
        int max = Integer.MAX_VALUE;

        while(l < nums.length && r < nums.length) {
            sum += nums[r];
            while(sum >= target) {
                max = Math.min((r - l + 1), max);
                sum -= nums[l];
                l++;
            } 

            r++;
        }

        return max == Integer.MAX_VALUE ? 0 : max;
    }
}