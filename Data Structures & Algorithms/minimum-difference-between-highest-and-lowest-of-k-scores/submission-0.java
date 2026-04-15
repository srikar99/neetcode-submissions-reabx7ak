class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        int n = nums.length;
        Arrays.sort(nums);

        int r = k - 1;
        int l = 0;

        int minDiff = Integer.MAX_VALUE;

        while(r < n) {
            minDiff = Math.min(minDiff, nums[r] - nums[l]);

            l++;
            r++;
        }
        
        return minDiff;
    }
}