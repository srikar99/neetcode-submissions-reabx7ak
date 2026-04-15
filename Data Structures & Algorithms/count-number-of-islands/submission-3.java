class Solution {
    private static final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int numIslands(char[][] grid) {
        
        int numIslands = 0;
        int rows = grid.length, cols = grid[0].length;
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == '1') {
                    bfs(grid, i, j, rows, cols);
                    numIslands++;
                }
            }
        }
        return numIslands;
    }

    void bfs(char[][] grid, int i, int j, int m, int n) {
        Queue<int[]> q = new LinkedList<>();
        grid[i][j] = '0';

        q.add(new int[]{i, j});

        while(!q.isEmpty()) {
            int[] node = q.poll();

            int r = node[0];
            int c = node[1];
            
            for(int[] dir : directions) {
                int nr = r + dir[0], nc = c + dir[1];

                if(nr >= 0 && nc >= 0 &&
                nr < m && nc < n && grid[nr][nc] == '1') {
                    q.add(new int[]{nr, nc});
                    grid[nr][nc] = '0';
                }
            }
        }
    }
}
