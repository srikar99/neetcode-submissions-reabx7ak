class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];

        int zeroes = 0;

        int product = 1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeroes++;
                continue;
            }
            product *= nums[i];
        }

        for(int i = 0; i < nums.length; i++) {
            if(zeroes > 1) {
                result[i] = 0;
            } else if(zeroes == 1 && nums[i] == 0) {
                result[i] = product;
            } else if(zeroes == 1 && nums[i] != 0) {
                result[i] = 0;
            } else {
                result[i] = product / nums[i];
            }
        }

        return result;
    }
}  
