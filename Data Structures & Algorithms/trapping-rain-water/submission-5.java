class Solution {
    public int trap(int[] h) {
        int res = 0;
        int n = h.length;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // formula min(leftMax, rightMax) - h[i];

        int l = 0;
        leftMax[0] = 0;
        rightMax[n - 1] = 0;

        for(int i = 1; i < n; i++) {
            l = Math.max(l, h[i - 1]);
            leftMax[i] = Math.max(l, leftMax[i - 1]);   
        }
        
        int r = 0;

        for(int i = n - 2; i >= 0; i--) {
            r = Math.max(r, h[i + 1]);
            rightMax[i] = Math.max(r, rightMax[i + 1]);
        }

        for(int i = 0; i < n; i++) {
            int trap = Math.min(leftMax[i], rightMax[i]) - h[i];

            res += trap > 0 ? trap : 0;
        }

        return res;
    }
}
