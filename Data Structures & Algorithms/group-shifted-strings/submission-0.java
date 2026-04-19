class Solution {
    public List<List<String>> groupStrings(String[] strings) {        
        Map<String, List<String>> map = new HashMap<>();
        // calculate the difference at each position and add that string to a hashmap
        
        for(String s : strings) {
            char[] diff = new char[26];
            diff[0] = 0;

            for(int i = 1; i < s.length(); i++) {
                diff[Math.abs(s.charAt(i) - s.charAt(i - 1)) % 24]++;
            }
            String key = Arrays.toString(diff);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
