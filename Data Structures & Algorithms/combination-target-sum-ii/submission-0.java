class Solution {

    List<List<Integer>> res;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        int i = 0, n = candidates.length, sol = 0;

        backtrack(i, n, target, temp, candidates, sol);

        return res;
    }

    void backtrack(int i, int n, int target, List<Integer> temp, int[] nums, int sol) {

        if(res.contains(temp)) return;
        
        if(sol == target) {
            res.add(new ArrayList<>(temp));
        }

        if(sol > target || i >= n) {
            return;
        }

        // Don't pick the number
        backtrack(i + 1, n, target, temp, nums, sol);

        // Pick the number
        temp.add(nums[i]);
        backtrack(i + 1, n, target, temp, nums, sol + nums[i]);
        temp.remove(temp.size() - 1);

    }
}
