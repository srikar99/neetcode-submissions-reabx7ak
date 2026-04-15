class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int xor = n;

        for(int i = 0; i < n; i++) {
            int x = i ^ nums[i];
            xor ^= x;
        }

        return xor;
    }
}
