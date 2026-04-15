class Solution {
    public int maxArea(int[] h) {
        
        int res = 0, l = 0, r = h.length - 1;

        while(l < r) {
            int min = Math.min(h[l], h[r]);

            int area = min * (r - l);

            res = Math.max(area, res);

            if(h[l] < h[r]) {
                l++;
            } else {
                r--;
            }
        }

        return res;
    }
}
