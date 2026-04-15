class Solution {
    public int[][] merge(int[][] intervals) {
        
        int n = intervals.length;
        
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        list.add(intervals[0]);
        
        for(int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];

            int lastEnd = list.get(list.size() - 1)[1];

            if(lastEnd >= start) {
                list.get(list.size() - 1)[1] = Math.max(end, lastEnd);
            } else {
                list.add(interval);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}
