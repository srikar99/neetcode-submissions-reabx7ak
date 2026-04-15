class Solution {
    public int largestUniqueNumber(int[] nums) {
        
        int max = -1;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            
            if(map.containsKey(nums[i])) {
                map.remove(nums[i]);
            } else {
                map.put(nums[i], i);
            }
        }
        
        return map.keySet().stream().max(Integer::compareTo).orElse(-1);
    }
}
