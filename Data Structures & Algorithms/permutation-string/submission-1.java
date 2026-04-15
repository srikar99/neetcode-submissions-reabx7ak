class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length()) return false;
        
        int[] carr = new int[26];

        for(char c : s1.toCharArray()) {
            carr[c - 'a']++;
        }

        Map<String, Integer> map = new HashMap<>();

        map.put(java.util.Arrays.toString(carr), 1);

        int l = 0;
        int k = s1.length();

        int[] s2arr = new int[26];

        for(int i = 0; i < k; i++) {
            s2arr[s2.charAt(i) - 'a']++;
        }

        String key = java.util.Arrays.toString(s2arr);

        if(map.containsKey(key)) return true;
        for(int i = k; i < s2.length(); i++) {
            s2arr[s2.charAt(i) - 'a']++;
            s2arr[s2.charAt(i - k) - 'a']--;
            key = java.util.Arrays.toString(s2arr);
            if(map.containsKey(key)) return true;
        }

        return false;
    }
}
