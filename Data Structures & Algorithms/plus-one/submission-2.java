class Solution {
    public int[] plusOne(int[] digits) {
        
        int one = 1;
        int i = 0;
        boolean carry = true;

        for(int j = digits.length - 1; i >= 0; i--) {
            if(carry) {
                if(digits[j] == 9) {
                    digits[j] = 0;
                } else {
                    digits[j]++;
                    carry = false;
                }
            }
        }

        if(carry) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            
            System.arraycopy(digits, 0, 1, result);

            return result;
        }

        return digits;    
    }
}
