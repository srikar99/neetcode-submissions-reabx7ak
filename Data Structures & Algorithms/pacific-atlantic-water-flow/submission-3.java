class Solution {
    int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int m = -1, n = -1;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m = heights.length;
        n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        for(int j = 0; j < n; j++) {
            dfs(0, j, pacific, heights);
            dfs(m - 1, j, atlantic, heights);
        }

        for(int i = 0; i < m; i++) {
            dfs(i, 0, pacific, heights);
            dfs(i, n - 1, atlantic, heights);
        }

        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(pacific[i][j] && atlantic[i][j]) {
                    res.add(List.of(i, j));
                }
            }
        }

        return res;
    }

    void dfs(int i, int j, boolean[][] reachable, int[][] grid) {
        reachable[i][j] = true;

        for(int[] dir : dirs) {
            int nr = i + dir[0];
            int nc = j + dir[1];

            if(nr >= 0 && nc >= 0 && nr < m && nc < n && grid[nr][nc] >= grid[i][j] && !reachable[nr][nc]) {
                dfs(nr, nc, reachable, grid);
            }
        }
    }
}
