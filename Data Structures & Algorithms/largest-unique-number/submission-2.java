class Solution {
    public int largestUniqueNumber(int[] nums) {
        
        int max = -1;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            
            if(set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        
        return set.stream().max(Integer::compareTo).orElse(-1);
    }
}
