class Solution {
    public int largestUniqueNumber(int[] nums) {
        
        int max = -1;
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            
            if(!set.contains(num)) {
                max = Math.max(max, num);
            } else {
                if(num == max) {
                    max = -1;
                }
            }

            set.add(num);
        }

        return max;
    }
}
