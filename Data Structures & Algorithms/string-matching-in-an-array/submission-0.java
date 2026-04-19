class Solution {
    public List<String> stringMatching(String[] words) {
        
        List<String> res = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < words.length; j++) {
                if(words[j].equals(words[i])) continue;

                if(words[i].indexOf(words[j]) != -1) {
                    res.add(words[j]);
                }
            }
        }

        return res;
    }
}