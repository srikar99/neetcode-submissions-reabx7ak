class Solution {
    public int maxArea(int[] h) {
        
        int n = h.length;
        int l = 0, r = n - 1;

        int maxArea = Integer.MIN_VALUE;

        while(l < r) {
            maxArea = Math.max(maxArea, Math.min(h[l], h[r]) * (r - l));
            if(h[l] < h[r]) l++;
            else r--;
        }

        return maxArea;
    }
}
