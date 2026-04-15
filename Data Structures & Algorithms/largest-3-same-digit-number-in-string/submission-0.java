class Solution {
    public String largestGoodInteger(String num) {
        
        int i = -1;


        for(int l = 0; l < num.length() - 2; l++) {
            if(num.charAt(l) == num.charAt(l + 1) && num.charAt(l) == num.charAt(l + 2)) {
                i = Math.max(i, num.charAt(l) - '0');
            }
        }

        return i != -1 ? String.valueOf(i).repeat(3) : "";
    }
}