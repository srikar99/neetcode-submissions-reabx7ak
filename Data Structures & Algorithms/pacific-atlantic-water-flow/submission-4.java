class Solution {
    int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int m = -1, n = -1;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m = heights.length;
        n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        List<List<Integer>> res = new ArrayList<>();

        // run dfs for columns
        for(int c = 0; c < n; c++) {
            dfs(0, c, heights, pacific);
            dfs(m - 1, c, heights, atlantic);
        }

        for(int r = 0; r < m; r++) {
            dfs(r, 0, heights, pacific);
            dfs(r, n - 1, heights, atlantic);
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(pacific[i][j] && atlantic[i][j]) {
                    res.add(List.of(i, j));
                }
            }
        }

        return res;
    }

    void dfs(int i, int j, int[][] grid, boolean[][] ocean) {
        ocean[i][j] = true;

        for(int[] dir : dirs) {
            int nr = i + dir[0], nc = j + dir[1];

            if(nr >= 0 && nc >= 0 && nr < m && nc < n && !ocean[nr][nc] && grid[nr][nc] > grid[i][j]) {
                dfs(nr, nc, grid, ocean);
            }
        }
    }
}
