class Solution {
    public int mySqrt(int x) {
        int i;
        int res = 1;

        for(i = 1; i <= x; i++) {
            if((long) i * i > x) return i - 1;
        }

        return i;
    }
}