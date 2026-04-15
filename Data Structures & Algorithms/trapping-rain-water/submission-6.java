class Solution {
    public int trap(int[] h) {
        int res = 0;
        int n = h.length;

        int l = 0, r = n - 1;
        int leftMax = h[0], rightMax = h[n - 1];

        while(l < r) {
            if(leftMax < rightMax) {
                l++;
                res += (leftMax - h[l]) > 0 ? leftMax - h[l] : 0;
                leftMax = Math.max(leftMax, h[l]);
            } else {
                r--;
                res += (rightMax - h[r]) > 0 ? rightMax - h[r] : 0;
                rightMax = Math.max(rightMax, h[r]);
            }
        }
        return res;
    }
}
