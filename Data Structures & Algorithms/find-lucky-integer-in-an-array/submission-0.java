class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return map.entrySet()
        .stream()
        .filter(entry -> entry.getValue() == entry.getKey())
        .mapToInt(entry -> entry.getValue())
        .max().orElse(-1);
    }
}