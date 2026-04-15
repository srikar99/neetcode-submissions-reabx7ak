class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        int n = nums.length, sol = 0, i = 0;
        
        backtrack(i, target, res, temp, nums, sol);

        return res;
    }

    void backtrack(int i, int target, 
    List<List<Integer>> res, List<Integer> temp, int[] nums, int sol) {

        if(sol == target) {
            res.add(new ArrayList<>(temp));
            return;
        }

        if(sol > target || i >= nums.length) return;

        
        // Don't pick the number
        backtrack(i + 1, target, res, temp, nums, sol);

        // Pick the number
        temp.add(nums[i]);
        backtrack(i, target, res, temp, nums, sol + nums[i]);
        temp.remove(temp.size() - 1);
    }
}
