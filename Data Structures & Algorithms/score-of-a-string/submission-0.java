class Solution {
    public int scoreOfString(String s) {
        int res = 0;


        for(int i = 1; i < s.length(); i++) { 
            char prev = s.charAt(i - 1);
            char curr = s.charAt(i);

            res += Math.abs((prev - '0') - (curr - '0'));
        }

        return res;
    }
}