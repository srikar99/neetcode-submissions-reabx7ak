class Solution {
    public boolean validWordSquare(List<String> words) {
        
        List<String> colWords = new ArrayList<>();

        int i = 0;
        
        for(int j = 0; j < words.size(); j++) {
            StringBuilder sb = new StringBuilder();
            for(String word : words) {
                if(i < word.length())    
                    sb.append(word.charAt(i));
            }

            colWords.add(sb.toString());
            i++;
        }

        Set<String> rWords = new HashSet<>(words);
        Set<String> cWords = new HashSet<>(colWords);

        return rWords.size() == cWords.size();
    }
}
