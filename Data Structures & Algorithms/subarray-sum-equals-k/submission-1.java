class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int res = 0, currSum = 0;

        // [2,-1,1,2], k = 2
        // 4

        Map<Integer, Integer> map = new HashMap<>();
        // prefix sum
        map.put(0, 1);

        for(int num : nums) {
            currSum += num;
            int diff = currSum - k;

            res += map.getOrDefault(diff, 0);

            // is currSum already present in map

            int val = map.getOrDefault(currSum, 0);
            map.put(currSum, val + 1);
        }

        return res;
    }
}