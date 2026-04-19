class Solution {
    public void sortColors(int[] nums) {
        
        int n = nums.length;

        int zeroes = 0, ones = 0, twos = 0;

        for(int num : nums) {
            if(num == 0) zeroes++;
            else if(num == 1) ones++;
            else twos++;
        }

        for(int i = 0; i < n; i++) {
            if(i < zeroes) {
                nums[i] = 0;
            } else if(i <= ones) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }
}