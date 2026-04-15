class Solution {
    public int arrangeCoins(int n) {
        int res = 0;
        int currentStair = 1;

        while(n > 0) {
            res++;
            n -= currentStair;
            if(n < 0) res--;
            
            currentStair++;
        }

        return res;
    }
}