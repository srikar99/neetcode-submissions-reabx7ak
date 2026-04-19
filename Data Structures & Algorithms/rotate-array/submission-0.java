class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
 
        for(int i = 0; i < n / 2; i++) {
            int idx = k % n;

            int tmp = nums[i + idx];
            nums[i + idx] = nums[i];
            nums[i] = tmp;
        }
    }
}