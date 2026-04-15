class Solution {
    public int trap(int[] h) {
        int res = 0;
        int n = h.length;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // formula min(leftMax, rightMax) - h[i];
        leftMax[0] = h[0];
        rightMax[n - 1] = h[n - 1];

        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(h[i], leftMax[i - 1]);   
        }

        for(int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(h[i], rightMax[i + 1]);
        }

        for(int i = 0; i < n; i++) {
            res += Math.min(leftMax[i], rightMax[i]) - h[i];
        }

        return res;
    }
}
