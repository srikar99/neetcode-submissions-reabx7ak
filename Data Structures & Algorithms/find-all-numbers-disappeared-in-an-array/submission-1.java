class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i : nums) {
            int j = Math.abs(i) - 1;
            nums[j] = -Math.abs(nums[j]);
        }
        
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
    }
}