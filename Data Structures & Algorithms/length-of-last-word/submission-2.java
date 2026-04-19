class Solution {
    public int lengthOfLastWord(String s) {

        int n = s.length();
        int i = n - 1;
        
       
        while(s.charAt(i) == ' ') {
            i--;
        }

        int len = 0;

        while(s.charAt(i) != ' ') {
            i--;
            len++;
        }

        return len;
    }
}