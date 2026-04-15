class Solution {
    public int[] findBuildings(int[] heights) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for(int i = 0; i < heights.length; i++) {
            map.put(heights[i], i);
            max = Math.max(max, heights[i]);
        }

        for(int i = 1; i < heights.length; i++) {
            if(heights[i - 1] > heights[i]) {
                if(heights[i - 1] < max && (i - 1) > map.get(max)) {
                    System.out.println(heights[i - 1] + ":" + heights[i]);
                    list.add(i - 1);
                } else if(heights[i - 1] >= max) {
                    list.add(i - 1);
                }
            }
        }

        list.add(heights.length - 1);

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}