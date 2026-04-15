class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);

        int i = 0, n = nums.length;

        backtrack(i, n, list, temp, nums);

        return list;
    }

    void backtrack(int i, int n, List<List<Integer>> res, List<Integer> temp, int[] nums) {

        if(i == n) {
            res.add(new ArrayList<>(temp));
            return;
        }

        // Pick the number
        temp.add(nums[i]);
        backtrack(i + 1, n, res, temp, nums);
        temp.remove(temp.size() - 1);

        while(i + 1 < n && nums[i] == nums[i + 1]) {
            i++;
        }

        // Don't pick the number
        backtrack(i + 1, n, res, temp, nums);
    }
}
