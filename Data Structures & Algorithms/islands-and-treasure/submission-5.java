class Solution {
    public void islandsAndTreasure(int[][] grid) {
        
        final int INF = Integer.MAX_VALUE;
        int[][] dirs = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

        Queue<int[]> q = new LinkedList<>();
        int m = grid.length, n = grid[0].length;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 0) {
                    q.add(new int[]{i, j});
                }
            }
        }

        while(!q.isEmpty()) {
            int[] node = q.poll();

            int r = node[0], c = node[1];
            
            for(int[] dir : dirs) {
                int nr = r + dir[0], nc = c + dir[1];

                if(nr < 0 || nc < 0 || nr >= m || nc >= n || grid[nr][nc] != INF) {
                    continue;
                }

                q.add(new int[]{nr, nc});
                grid[nr][nc] = 1 + grid[r][c];
            }
        }
    }
}
