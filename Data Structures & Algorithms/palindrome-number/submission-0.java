class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int y = 0, z = x;

        while(x > 0) {
            int mod = x % 10;
            y = y * 10 + mod;
            x /= 10;
            
        }

        return z == y;
    }
}