class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        int n = nums.length, i = 0;
        
        backtrack(i, target, res, temp, nums);

        return res;
    }

    void backtrack(int i, int target, 
    List<List<Integer>> res, List<Integer> temp, int[] nums) {

        if(target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        if(target < 0 || i >= nums.length) return;


        // Don't pick the number
        backtrack(i + 1, target, res, temp, nums);

        // Pick the number
        temp.add(nums[i]);
        backtrack(i, target - nums[i], res, temp, nums);
        temp.remove(temp.size() - 1);
    }
}
