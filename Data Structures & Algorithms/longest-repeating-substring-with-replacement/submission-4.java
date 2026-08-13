class Solution {
    public int characterReplacement(String s, int k) {
        
        int l = 0, max = 0;
        int maxFreq = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            map.put(c, map.getOrDefault(c, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(c));
            // XYYX
            while((r - l + 1) - maxFreq > k) {
                map.put(s.charAt(l), map.get(s.charAt(l) - 1));
                l++;
            }

            max = Math.max(r - l + 1, max);
        }

        return max;
    }

    
}
