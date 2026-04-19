class Solution {
    public boolean isPerfectSquare(int num) {
        
        int l = 1, r = num;

        while(l <= r) {
            int m = l + (r - l) / 2;

            long sq = m * m;

            if(sq > num) {
                r = m - 1;
            } else if(sq < num) {
                l = m + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}