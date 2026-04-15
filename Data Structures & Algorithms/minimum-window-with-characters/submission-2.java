class Solution {
    public String minWindow(String s, String t) {
        // edge case
        if(t.isEmpty()) return "";

        // keep character count and window in a map
        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for(char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        
        // need represents the substring needed
        int need = tMap.size();
        // have represents the current substring that has the matching characters
        int have = 0;

        // the window where the substring is present
        int[] currWindow = {-1, -1};
        // the current length
        int minLen = Integer.MAX_VALUE;
        // the left pointer
        int l = 0;

        for(int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);

            // check if curr char is present in t string, and check if the values
            // equal with count in window
            if(tMap.containsKey(c) && tMap.get(c) == window.get(c)) {
                have++;
            }
            // we need a loop here, because when moving the window
            // we may have chars not in t, so have will be equal to need
            // but the window moves on
            while(have == need) {
                char leftChar = s.charAt(l);
                
                // calculate the current min length of substring
                if(r - l + 1 < minLen) {
                    currWindow[0] = l;
                    currWindow[1] = r;
                    minLen = r - l + 1;
                }
                
                // move the window
                window.put(leftChar, window.get(leftChar) - 1);
                // if the char is visited and present in the t
                // reduce have
                if(tMap.containsKey(leftChar) && window.get(leftChar) < tMap.get(leftChar)) {
                    have--;
                }

                l++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" :
        s.substring(currWindow[0], currWindow[1] + 1);
    }
}
