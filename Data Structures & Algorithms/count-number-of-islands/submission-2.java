class Solution {
    private static final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int numIslands(char[][] grid) {
        
        int numIslands = 0;

        int rows = grid.length, cols = grid[0].length;
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == '1') {
                    dfs(grid, i, j);
                    numIslands++;
                }
            }
        }
        return numIslands;
    }

    void dfs(char[][] grid, int i, int j) {
        
        if(i >= grid.length || i < 0 || j >= grid[0].length || j < 0 || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';

        for(int[] direction : directions) {
            dfs(grid, i + direction[0], j + direction[1]);
        }
    }
}
