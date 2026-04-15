class Solution {
    public int tribonacci(int n) {
        
        if(n == 1) return 1;
        if(n == 2) return 1;
        
        int t0 = 0, t1 = 1, t2 = 1;

        int res = 0;

        for(int i = 3; i <= n; i++) {
            res = t0 + t1 + t2;

            t0 = t1;
            t1 = t2;
            t2 = res;
        }

        return res;
    }
}