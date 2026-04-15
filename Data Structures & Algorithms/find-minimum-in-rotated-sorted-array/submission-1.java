class Solution {
    public int findMin(int[] nums) {
        
        // 3, 4, 5, 1, 2
        // 1, 2, 3, 4, 5

        int l = 0, r = nums.length - 1;
        int res = nums[0];

        while(l <= r) {
            if(nums[l] < nums[r]) {
                res = Math.min(res, nums[l]);
                break;
            }

            int m = l + (r-l) / 2;
            res = Math.min(res, nums[m]);

            if(nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return res;
    }
}
