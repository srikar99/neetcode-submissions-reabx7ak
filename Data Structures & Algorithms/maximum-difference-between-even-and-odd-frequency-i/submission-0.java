class Solution {
    public int maxDifference(String s) {
        
        int res = 0;

        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }

        int odd = map.values().stream().filter(i -> i % 2 != 0).mapToInt(i -> i).max().getAsInt();
        int even = map.values().stream().filter(i -> i % 2 == 0).mapToInt(i -> i).max().getAsInt();

        return odd > even ? odd - even : even - odd;
    }
}