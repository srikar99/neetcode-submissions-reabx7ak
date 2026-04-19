class Solution {

    public String encode(List<String> strs) {
        
        StringBuilder sb = new StringBuilder();

        for(String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }
        
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        String delimeter = "#";
        int currentIdx = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '#') {
                int length = Integer.parseInt(str.substring(currentIdx, i));
                
                res.add(str.substring(i + 1, i + 1 + length));
                
                currentIdx = i + 1 + length;
            }   
        }
        
        return res;
    }
}
