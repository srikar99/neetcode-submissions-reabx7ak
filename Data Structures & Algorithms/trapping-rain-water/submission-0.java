class Solution {
    public int trap(int[] h) {
        int trappedWater = 0;

        int n = h.length;

        for(int i = 0; i < n; i++) {
            int leftMax = h[i];
            int rightMax = h[i];

            for(int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, h[j]);
            }

            for(int k = i + 1; k < n; k++) {
                rightMax = Math.max(rightMax, h[k]);
            }

            int min = Math.min(leftMax, rightMax);
            
            if(min - h[i] < 0) trappedWater += 0;
            else trappedWater += min - h[i];
        }

        return trappedWater;
    }
}
