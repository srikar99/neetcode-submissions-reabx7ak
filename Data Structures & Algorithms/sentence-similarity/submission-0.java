class Solution {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        
        int n = sentence1.length;
        int m = sentence2.length;

        if(n != m) return false;

        for(int i = 0; i < n; i++) {
            String word1 = sentence1[i];
            String word2 = sentence2[i];

            if(similarPairs.size() == 0 && word1.equals(word2)) {
                return true;
            }

            //for(int j = 0; j < 2; j++) {
                if(!word1.equals(similarPairs.get(i).get(0)) && word2.equals(similarPairs.get(i).get(1))) {
                    return false;
                }
            //}
        }

        return true;
    }
}
