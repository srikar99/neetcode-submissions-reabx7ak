class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max = 1;
        int res = 1;

        if(nums.length == 0) return 0;
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i - 1] + 1 == nums[i]) {
                max += 1;
            } else if(nums[i - 1] == nums[i]){
                continue;
            } else {
                max = 1;
            }

            res = Math.max(res, max);
        }

        return res;
    }
}
