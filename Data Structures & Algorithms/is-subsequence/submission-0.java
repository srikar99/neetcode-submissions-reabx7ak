class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int slen = s.length(), tlen = t.length();
        int i = 0, j = 0;

        if(slen > tlen) return false;

        while(i < slen && j < tlen) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        if(i < slen) return false;

        return true;
    }
}