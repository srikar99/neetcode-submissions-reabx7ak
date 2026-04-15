class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            char[] key = new char[26];

            for(int i = 0; i < str.length(); i++) {
                key[str.charAt(i) - 'a']++;
            }

            String mapKey = Arrays.toString(key);

            map.computeIfAbsent(mapKey, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
