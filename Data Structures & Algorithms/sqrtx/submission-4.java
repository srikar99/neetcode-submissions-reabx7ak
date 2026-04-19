class Solution {
    public int mySqrt(int x) {
        
        int i;

        for(i = 1; i * i <= x; i++) {
            if(i == x) return i;
        }

        return i - 1;
    }
}