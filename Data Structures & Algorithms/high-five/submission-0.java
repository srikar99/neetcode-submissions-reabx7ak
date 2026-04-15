class Solution {
    public int[][] highFive(int[][] items) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int[] item : items) {
            map.computeIfAbsent(item[0], k -> new ArrayList<>()).add(item[1]);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[][] res = new int[map.keySet().size()][2];
        int i = 0;

        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            for(int val : entry.getValue()) {
                pq.offer(val);
                if(pq.size() > 5) {
                    pq.poll();
                }
            }

            int total = 0;

            while(!pq.isEmpty()) {
                total += pq.poll();
            }

            int avg = total / 5;
            int[] in = new int[2];
            in[0] = entry.getKey();
            in[1] = avg;

            res[i] = in;
            i++;
        }

        return res;
    }
}
