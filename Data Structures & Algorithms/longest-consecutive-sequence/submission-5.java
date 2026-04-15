class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0, n = nums.length;
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        int max = 0;

        for(int num : nums) {
            // find the start of sequence
            if(!set.contains(num - 1)) {
                max = 0;
                while(set.contains(num + max)) max += 1;
            }

            res = Math.max(max, res);
        }

        return res;
    }
}
