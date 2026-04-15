class Solution {
    public int arrangeCoins(int n) {
        int l = 1, r = n, res = 0;

        while(l <= r) {
            int m = l + (r - l) / 2;

            long numOfCoins = (long) m * (m + 1) / 2;

            if(n < numOfCoins) r = m - 1;
            else {
                res = Math.max(res, m);
                l = m + 1;
            }
        }

        return res;
    }
}