class Solution {
    public List<List<String>> groupStrings(String[] strings) {        
        Map<String, List<String>> map = new HashMap<>();
        // calculate the difference at each position and add that string to a hashmap
        
        for(String s : strings) {
            StringBuilder hashKey = new StringBuilder();

            for(int i = 1; i < s.length(); i++) {
                hashKey.append((char) (s.charAt(i) - s.charAt(i - 1) + 26) % 26 + 'a');
            }
            

            map.computeIfAbsent(hashKey.toString(), k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
