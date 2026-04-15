class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            int[] a = new int[26];
            
            for(char c : str.toCharArray()) {
                a[c - 'a']++;
            }

            String key = Arrays.toString(a);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
