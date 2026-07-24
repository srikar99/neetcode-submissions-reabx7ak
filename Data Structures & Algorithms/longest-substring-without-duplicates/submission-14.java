class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();

        int l = 0, r = 0;
        int max = 0;

        for(l = 0; l < s.length(); l++) {
            char c = s.charAt(l);

            while(set.contains(c)) {
                set.remove(s.charAt(r));
                r++;
            }
            max = Math.max((l - r + 1), max);
            set.add(c);
        }

        return max;
    }
}
