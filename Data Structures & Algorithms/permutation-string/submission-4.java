class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int s1Lenght = s1.length();
        int i = 0;

        while(i < s2.length() - s1Lenght) {
            if(!isPermutation(s1, s2.substring(i, i + s1Lenght))) {
                i++;
            } else {
                return true;
            }
        }

        return false;
    }

    private boolean isPermutation(String s1, String s2) {
        
        int[] a = new int[26];
        int[] b = new int[26];

        for(int i = 0; i < s1.length(); i++) {
            a[s1.charAt(i) - 'a']++;
            b[s2.charAt(i) - 'a']++;
            
        }

        for(int i = 0; i < 26; i++) {
            if(a[i] != b[i]) return false;
        }

        return true;
    }
}
