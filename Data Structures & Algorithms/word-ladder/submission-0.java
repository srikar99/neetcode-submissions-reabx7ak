class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        if(!wordList.contains(endWord)) return 0;

        Map<String, List<String>> map = new HashMap<>();

        wordList.add(beginWord);

        for(String word : wordList) {
            for(int j = 0; j < word.length(); j++) {
                StringBuilder sb = new StringBuilder();
                sb.append(word.substring(0, j)).append("*").append(word.substring(j + 1));
                String key = sb.toString();
                map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
            }
        }

        // Don't visit same node again
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        // To run BFS
        Queue<String> q = new LinkedList<>();

        q.offer(beginWord);
        int res = 1;

        while(!q.isEmpty()) {
            for(int i = 0; i < q.size(); i++) {
                String curr = q.poll();
                if(curr.equals(endWord)) {
                    return res;
                    
                }

                for(int j = 0; j < curr.length(); j++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(curr.substring(0, j)).append("*").append(curr.substring(j + 1));
                    String key = sb.toString();
                    List<String> neighbors = map.get(key);
                    for(String n : neighbors) {
                        if(!visited.contains(n)) {
                            visited.add(n);
                            q.offer(n);
                        }
                    }
                }
                res += 1;
            }
        }
        return 0;
    }
}
