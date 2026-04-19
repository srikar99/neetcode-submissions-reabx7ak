class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character> set = new HashSet<>();
        int j = 0;

        for(int i = 0; i < s.lenght(); i++) {
            char c = s.charAt(i);
            while(set.contains(c)) {
                set.remove(s.charAt(j));
                j++;
            }

            set.add(c);
            max = Math.max(max, i - j + 1);
        }

        return max;
    }
}
