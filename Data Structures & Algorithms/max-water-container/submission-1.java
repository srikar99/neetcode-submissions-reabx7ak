class Solution {
    public int maxArea(int[] h) {
        
        int n = h.length;
        int res = 0;
        int l = 0, r = n - 1;

        while(l < r) {
            int area = Math.min(h[l], h[r]) * (r - l);
            res = Math.max(res, area);

            if(h[l] <= h[r]) {
                l++;
            } else {
                r--;
            }
        }

        return res;
    }
}
