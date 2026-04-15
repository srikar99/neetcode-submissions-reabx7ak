class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int l = 0;
        int zeroes = 0;
        int max = 0;

        for(int r = 0; r < nums.length; r++) {
            if(nums[r] == 0) {
                zeroes++;
            }

            while(zeroes == 2) {
                if(nums[l] == 0) zeroes--;
                l++;
            }

            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}
