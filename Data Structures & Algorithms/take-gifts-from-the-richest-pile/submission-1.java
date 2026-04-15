class Solution {
    public long pickGifts(int[] gifts, int k) {
        
        PriorityQueue<Long> pq = new PriorityQueue<Long>((a, b) -> Long.compare(b, a));

        for(long g : gifts) {
            pq.offer(g);
        }

        while(k > 0) {
            long top = pq.poll();
            long newTop = (long) Math.floor(Math.sqrt(top));
            pq.add(newTop);
            k--;
        }

        long res = 0;

        while(!pq.isEmpty()) {
            res += pq.poll();
        }

        return res;
    }
}