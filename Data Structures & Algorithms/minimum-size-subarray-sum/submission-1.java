class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        

        int l = 0, r = 0;
        int max = Integer.MAX_VALUE;
        int sum = 0;
        int n = nums.length;
        while(l < n && r < n) {
            sum += nums[r];

            if(sum >= target) {
                max = Math.min(max, (r - l + 1));
                sum -= nums[l];
                sum -= nums[r];
                l++;
            } else {
                r++;
            }
        }

        return max == Integer.MAX_VALUE ? 0 : max;
    }
}