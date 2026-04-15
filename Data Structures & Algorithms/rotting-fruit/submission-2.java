class Solution {
    int[][] dirs = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    private int m = -1, n = -1;

    public int orangesRotting(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    fresh++;
                }
                if(grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                }
            }
        }

        int res = 0;

        while(!q.isEmpty() && fresh > 0) {
            int size = q.size();

            for(int k = 0; k < size; k++) {
                int[] node = q.poll();
                int r = node[0], c = node[1];

                if(grid[r][c] == 1) {
                    grid[r][c] = 2;
                    fresh--;
                }

                for(int[] dir : dirs) {
                    int nr = r + dir[0], nc = c + dir[1];

                    if(nr >= 0 && nc >= 0 && nr < m && nc < n && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;
                        q.add(new int[]{nr, nc});
                        fresh--;
                    }
                }
            }

            res++;
        }

        return fresh == 0 ? res : -1;
    }
}
