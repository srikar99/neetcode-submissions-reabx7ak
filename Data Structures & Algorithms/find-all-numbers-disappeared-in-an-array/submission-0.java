class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        List<Integer> res = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            if(!set.contains(i)) res.add(i);
        }

        return res;
    }
}