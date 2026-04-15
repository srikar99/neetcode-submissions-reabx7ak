class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backtrack(0, n, res, temp, nums);

        return res;
    }

    private void backtrack(int i, int n, List<List<Integer>> res, List<Integer> temp, int[] nums) {
        if(i == n) {
            res.add(new ArrayList<>(temp));
            return;
        }

        backtrack(i + 1, n, res, temp, nums);

        temp.add(nums[i]);
        backtrack(i + 1, n, res, temp, nums);
        temp.remove(temp.size() - 1);
    }
}
