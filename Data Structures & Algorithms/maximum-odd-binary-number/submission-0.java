class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count = 0;

        for(char c : s.toCharArray()) {
            if(c == '1') count++;
        }

        int n = s.length();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < count - 1; i++) {
            sb.append('1');
        }

        for(int i = count; i < n; i++) {
            sb.append('0');
        }
        sb.append('1');
        
        return sb.toString();
    }
}