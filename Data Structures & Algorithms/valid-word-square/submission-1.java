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

        for(int k = 0; k < words.size(); k++) {
            if(!words.get(k).equals(colWords.get(k))) 
                return false;
        }

        return true;
    }
}
