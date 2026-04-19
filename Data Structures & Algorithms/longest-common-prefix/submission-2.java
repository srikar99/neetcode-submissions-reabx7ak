class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++) {
            
            String str = strs[i];
            
            int l = 0;

            while(l < prefix.length() && prefix.charAt(l) == str.charAt(l)) {
                l++;
            }

            prefix = prefix.substring(0, l);
        }

        return prefix;
    }
}