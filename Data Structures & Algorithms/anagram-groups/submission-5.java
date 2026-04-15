class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            int[] c = new int[26];

            for(char cc : str.toCharArray()) {
                c[cc - 'a']++;
            }

            String key = Arrays.toString(c);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
