class Solution {
    public int removeElement(int[] nums, int val) {
        
        int n = nums.length;
        int k = 0;

        for(int num : nums) {
            if(num != val) {
                nums[k++] = num;
            }
        }

        return k;
    }
}