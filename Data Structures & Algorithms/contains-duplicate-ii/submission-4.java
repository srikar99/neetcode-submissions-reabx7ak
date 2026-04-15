class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Set<Integer> set = new HashSet<>();
        int n = nums.length, l = 0;

        for(int r = 0; r < n; r++) {

            while(r - l > k) {
                set.remove(nums[l++]);
            }

            if(set.contains(nums[r])) {
                return true;
            }

            set.add(nums[r]);
        }

        return false;
    }
}