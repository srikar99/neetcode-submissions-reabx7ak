class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();

        int left = 0, right = 0;

        int length = 0;

        for(right = 0; right < s.length(); right++) {
            
            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            length = Math.max(length, (right - left + 1));
        }

        return length;
    }
}
