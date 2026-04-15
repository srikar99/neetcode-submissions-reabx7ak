class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int res = 0;

        return map.entrySet()
        .stream()
        .filter(entry -> entry.getValue() > n / 2)
        .map(Map.Entry::getKey)
        .findFirst()
        .get();
    }
}