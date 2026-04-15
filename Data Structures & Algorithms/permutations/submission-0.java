class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        int i = 0, n = nums.length;
        boolean[] pick = new boolean[n];

        backtrack(i, n, res, temp, nums, pick);

        return res;
    }

    void backtrack(int i, int n, List<List<Integer>> res, List<Integer> temp, int[] nums, boolean[] pick) {

        if(temp.size() == n) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for(i = 0; i < n; i++) {
            if(!pick[i]) {
                pick[i] = true;
                temp.add(nums[i]);
                backtrack(i + 1, n, res, temp, nums, pick);
                temp.remove(temp.size() - 1);
                pick[i] = false;
            }
        }
    }
}
