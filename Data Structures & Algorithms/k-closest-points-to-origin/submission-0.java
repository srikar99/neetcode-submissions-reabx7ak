class Solution {
    public int[][] kClosest(int[][] points, int k) {
        //sqrt((x1 - x2)^2 + (y1 - y2)^2)); 

        int n = points.length;

        Map<Double, List<int[]>> map = new HashMap<>();
        for(int[] point : points) {
            int x = point[0];
            int y = point[1];

            int xDist = (x - 0) * (x - 0);
            int yDist = (y - 0) * (y - 0);
            double dist = Math.sqrt(xDist + yDist);

            map.computeIfAbsent(dist, z -> new ArrayList<>()).add(point);
        }

        PriorityQueue<Double> pq = new PriorityQueue<Double>();

        for(double d : map.keySet()) {
            pq.offer(d);
        }


        int[][] res = new int[k][2];
        int i = 0;

        while(k > 0) {
            double key = pq.poll();

            List<int[]> list = map.get(key);

            for(int j = 0; j < list.size(); j++) {
                res[i] = list.get(j);
                k--;
                i++;
            }
        }

        return res;
    }
}
