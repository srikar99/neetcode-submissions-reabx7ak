class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()) {
            return "";
        }

        Map<Character, Integer> window = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for(char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        int l = 0, res = Integer.MAX_VALUE;
        int[] currPointer = new int[]{-1, -1};

        int need = tMap.size();
        int have = 0;

        for(int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if(tMap.containsKey(c) && tMap.get(c) == window.get(c)) {
                have += 1;
            }

            while(have == need) {
                if((r - l + 1) < res) {
                    currPointer[0] = l;
                    currPointer[1] = r;

                    res = r - l + 1;
                }
                
                char leftC = s.charAt(l);
                window.put(leftC, window.get(leftC) - 1);
                if(tMap.containsKey(leftC) && tMap.get(leftC) > window.get(leftC)) {
                    have -= 1;
                }
                l += 1;
            }
        }

        return res == Integer.MAX_VALUE ? "" 
        : s.substring(currPointer[0], currPointer[1] + 1);
    }
}
