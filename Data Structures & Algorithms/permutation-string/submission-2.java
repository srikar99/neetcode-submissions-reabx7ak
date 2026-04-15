class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length()) return false;

        int[] s1Arr = new int[26];

        for(char c : s1.toCharArray()) {
            s1Arr[c - 'a']++;
        }

        Set<String> set = new HashSet<>();

        set.add(java.util.Arrays.toString(s1Arr));

        int k = s1.length();
        int i = 0;

        int[] s2Arr = new int[26];

        for(int j = 0; j < k; j++) {
            s2Arr[s2.charAt(j) - 'a']++;
        }

        if(set.contains(java.util.Arrays.toString(s2Arr))) {
            return true;
        }

        for(int j = k; j < s2.length(); j++) {
            s2Arr[s2.charAt(j) - 'a']++;
            s2Arr[s2.charAt(j - k) - 'a']--;

            if(set.contains(java.util.Arrays.toString(s2Arr))) {
                return true;
            }
        }

        return false;
    }
}
