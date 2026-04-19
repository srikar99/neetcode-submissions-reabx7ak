class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // intuition
        // keep the current character in set
        // calculate length

        Set<Character> set = new HashSet<>();

        int len = 0;
        int l = 0;
        
        for(int i = 0; i < s.length(); i++) {
            while(set.contains(s.charAt(l))) {
                set.remove(s.charAt(l));
                l++;
            }
            
            set.add(s.charAt(i));
            len = Math.max(len, i - l + 1);
        }

        return len;
    }
}
