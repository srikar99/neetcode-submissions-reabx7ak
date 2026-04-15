class Solution {
    public int characterReplacement(String s, int k) {
        
        int max = 0;
        int left = 0;
        Map<Character, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;

        for(int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);
            freqMap.put(curr, freqMap.getOrDefault(curr, 0) + 1);
            
            maxFreq = Math.max(maxFreq, freqMap.get(curr));

            // make window valid
            while((right - left + 1) - maxFreq > k) {
                freqMap.put(s.charAt(left), freqMap.get(s.charAt(left)) - 1);
                left++;
            }

            max = Math.max(right - left + 1, max);
        }

        return max;
    }
}
