class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        int l = 0, r = 1;

        while(l < nums.length && r < nums.length) {
            while((r - l) <= k) {
                if(nums[r] == nums[l]) {
                    return true;
                } else {
                    r++;
                }
            }
            r++;
            l++;
        }

        return false;
    }
}