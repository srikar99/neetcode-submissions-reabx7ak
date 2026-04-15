class Solution {
    public int calculateTime(String keyboard, String word) {
        
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < keyboard.length(); i++) {
            map.put(keyboard.charAt(i), i);
        }

        int start = 0;

        int res = 0;

        for(char c : word.toCharArray()) {
            int dist = map.get(c);

            res += Math.abs(start - dist);

            start = dist;
        }

        return res;
    }
}
