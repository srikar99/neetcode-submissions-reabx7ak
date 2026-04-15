class Solution {
    public boolean isPerfectSquare(int num) {
        
        for(int i = 1; i <= num; i++) {
            long sq = i * i;

            if(sq > num) return false;

            if(sq == num) return true;
        }

        return false;
    }
}