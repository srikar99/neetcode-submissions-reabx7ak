class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int i = 0;
        Set<Character> set = new HashSet<>();
        int res = 0;

        for(int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);

            while(set.contains(c)) {
                set.remove(s.charAt(i));
                i++;
            }

            res = Math.max(j - i + 1, res);
            set.add(c);
        }

        return res;
    }
}
