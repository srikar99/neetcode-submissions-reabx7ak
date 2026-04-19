class Solution {
    private static final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int maxAreaOfIsland(int[][] grid) {
        
        int maxArea = 0;

        int m = grid.length, n = grid[0].length;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    int area = 0;
                    dfs(grid, i, j, m, n, area);
                    maxArea = Math.max(area, maxArea);
                }
            }
        }

        return maxArea;
    }

    void dfs(int[][] grid, int i, int j, int m, int n, int area) {
        if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
            return;
        }

        grid[i][j] = 0;
        area += 1;

        for(int[] direction : directions) {
            dfs(grid, i + direction[0], j + direction[1], m, n, area);
        }
    }
}
