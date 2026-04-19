class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        if(nums == null) return new int[]{-1, -1};
        int l = 0, r = nums.length - 1;

        while(l < r) {
            if(nums[l] + nums[r] == target) return new int[]{l, r};

            if(nums[l] + nums[r] > target) r--;
            else l++;
        }
        return new int[]{-1, -1};
    }
}
