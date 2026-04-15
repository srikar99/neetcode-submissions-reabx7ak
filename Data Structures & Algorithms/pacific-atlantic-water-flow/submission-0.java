class Solution {

    private int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    boolean pacific, atlantic;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();

        int m = heights.length, n = heights[0].length;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                pacific = false;
                atlantic = false;
                dfs(heights, i, j, m, n, Integer.MAX_VALUE);

                if(pacific && atlantic) {
                    res.add(List.of(i, j));
                }
            }
        }

        return res;
    }
    

    void dfs(int[][] heights, int i, int j, int m, int n, int prevVal) {
        if(i < 0 || j < 0) {
            pacific = true;
            return;
        }

        if(i >= m || j >= n) {
            atlantic = true;
            return;
        }

        if(heights[i][j] > prevVal) {
            return;
        }

        int tmp = heights[i][j];
        heights[i][j] = Integer.MAX_VALUE;

        for(int[] direction : directions) {
            dfs(heights, i + direction[0], j + direction[1], m, n, tmp);
            if(pacific && atlantic) break;
        }
        heights[i][j] = tmp;
    }
}
