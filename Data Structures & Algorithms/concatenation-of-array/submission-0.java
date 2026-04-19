class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];

        int j = 0;

        for(int i : nums) {
            ans[j] = i;
            ans[j + n] = i;
        }

        return ans;
    }
}