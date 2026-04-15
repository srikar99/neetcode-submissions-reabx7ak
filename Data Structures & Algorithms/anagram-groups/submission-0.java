class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            int[] a = new int[26];
            
            for(char c : str.toCharArray()) {
                a[c - 'a']++;
            }

            String key = Arrays.toString(a);

            if(map.containsKey(key)) {
                List<String> list = map.get(key);
                list.add(str);
                map.put(key, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}
