class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        int maxLength = 0;
        Set<Integer> set = new HashSet<>();

        for(int n : nums) {
            set.add(n);
        }

        for(int n : nums) {
            if(!set.contains(n - 1)) {
                int maxTillNow = 0;
                while(set.contains(n + maxTillNow)) maxTillNow += 1;

                maxLength = Math.max(maxTillNow, maxLength);
            }
        }

        return maxLength;
    }
}
