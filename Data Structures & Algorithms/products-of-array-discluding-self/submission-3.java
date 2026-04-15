class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int zeroes = 0;
        int product = 1;

        for(int num : nums) {
            if(num == 0) zeroes++;
            else {
                product *= num;
            }
        }

        int[] res = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            if(zeroes > 1) {
                res[i] = 0;
            } else if(zeroes == 1 && nums[i] == 0) {
                res[i] = product;
            } else if(zeroes == 1 && nums[i] != 0) {
                res[i] = 0;
            } else {
                res[i] = product / nums[i];
            }
        }

        return res;
    }
}  
