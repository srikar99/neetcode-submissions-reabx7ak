class Solution {
    public int trap(int[] h) {
        int n = h.length;

        int[] lm = new int[n];
        int[] rm = new int[n];

        lm[0] = 0;
        rm[n - 1] = 0;

        for(int i = 1; i < n; i++) {
            lm[i] = Math.max(lm[i - 1], h[i]);
        }

        for(int i = n - 2; i >= 0; i--) {
            rm[i] = Math.max(rm[i + 1], h[i]);
        }

        int[] minArr = new int[n];

        for(int i = 0; i < n; i++) {
            minArr[i] = Math.min(lm[i], rm[i]);
        }

        int res = 0;

        for(int i = 0; i < n; i++) {
            if(minArr[i] - h[i] >= 0) {
                res += minArr[i] - h[i];
            }
        }

        return res;
    }
}
