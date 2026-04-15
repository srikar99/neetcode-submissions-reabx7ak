class Solution {
    public void islandsAndTreasure(int[][] grid) {
        
        final int INF = Integer.MAX_VALUE;

        Queue<int[]> q = new LinkedList<>();
        int m = grid.length, n = grid[0].length;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 0) {
                    q.add(new int[] {i, j});
                }
            }
        }

        if(q.isEmpty()) return;

        int[][] dirs = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

        while(!q.isEmpty()) {
            int[] gate = q.poll();
            int row = gate[0];
            int col = gate[1];

            for(int[] dir : dirs) {
                int r = row + dir[0];
                int c = col + dir[1];

                if(r < 0 || c < 0 || r >= m || c >= n || grid[r][c] != INF) {
                    continue;
                }

                q.add(new int[] {r, c});
                
                grid[r][c] = grid[row][col] + 1;
            }
        }
    }
}
