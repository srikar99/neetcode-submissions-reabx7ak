class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backtrack(0, n, list, temp, nums);

        return list;
    }

    private void backtrack(int i, int n, List<List<Integer>> res, List<Integer> temp, int[] nums) {
        
        if(i == n) {
            res.add(new ArrayList<>(temp));
            return;
        }

        // Don't pick the number at nums[i]
        backtrack(i + 1, n, res, temp, nums);

        // Pick the number at nums[i]
        temp.add(nums[i]);
        backtrack(i + 1, n, res, temp, nums);
        // Remove the current picked number
        temp.remove(temp.size() - 1);
    }
}
