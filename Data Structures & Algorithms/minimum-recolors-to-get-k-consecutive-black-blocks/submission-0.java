class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int max = 0;
        
        int l = 0, r = k - 1;

        int n = blocks.length();

        while(r < n) {
            int currMax = 0;
            for(int start = l; start < r; start++) {
                if(blocks.charAt(start) == 'W') {
                    currMax++;
                }
            }

            max = Math.max(currMax, max);
            r++;
            l++;

        }

        return max;
    }
}