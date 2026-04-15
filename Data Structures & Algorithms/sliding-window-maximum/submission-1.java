class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;

        int[] res = new int[n - k + 1];

        int l = 0;
        int i = 0;
        while(l < n - k + 1) {
            int max = -10001;

            for(int start = l; start < l + k; start++) {
                max = Math.max(nums[start], max);    
            }

            res[i++] = max;
            l++;
        }

        return res;
    }
}
