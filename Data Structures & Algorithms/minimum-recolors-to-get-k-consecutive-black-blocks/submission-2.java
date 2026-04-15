class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int max = Integer.MAX_VALUE;
        
        int l = 0, r = k - 1;

        int n = blocks.length();

        while(r < n) {
            int black = 0;
            int currMax = 0;
            for(int start = l; start <= r; start++) {
                
                if(blocks.charAt(start) == 'W') {
                    currMax++;
                } else if(blocks.charAt(start) == 'B') {
                    ++black;
                    if(black >= k) {
                        return 0;
                    }
                }
            }

            

            max = Math.min(currMax, max);
            r++;
            l++;

        }

        return max;
    }
}