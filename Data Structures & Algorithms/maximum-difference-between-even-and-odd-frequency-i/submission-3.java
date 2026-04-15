class Solution {
    public int maxDifference(String s) {
        
        int[] count = new int[26];

        for(char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        int oddMax = 0, evenMin = s.length();

        for(int c : count) {
            if((c & 1) == 1) {
                oddMax = Math.max(oddMax, c);
            } else if(c > 0){
                evenMin = Math.min(evenMin, c);
            }
        }

        return oddMax - evenMin;
    }
}