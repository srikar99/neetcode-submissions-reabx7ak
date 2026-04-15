class Solution {
    public int removeElement(int[] nums, int val) {
        
        int n = nums.length;
        int k = 0;
        int i = 0;

        for(int num : nums) {
            if(num != val) {
                nums[i++] = num;
            } else {
                k++;
            }
        }

        return n - k;
    }
}