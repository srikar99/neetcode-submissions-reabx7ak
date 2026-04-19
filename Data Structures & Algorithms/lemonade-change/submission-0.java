class Solution {
    public boolean lemonadeChange(int[] bills) {
        

        if(bills[0] > 5) {
            return false;
        }

        int currentChange = 0;
        int sum = 0;

        for(int b : bills) {
            if(b > 5 && (b - sum) < currentChange) {
                return false;
            } else {
                currentChange += (b - sum);
            }
            sum = b - currentChange;
        }

        return currentChange >= 0;
    }
}