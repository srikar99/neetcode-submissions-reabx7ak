class Solution {
    int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;        
        int res = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == '1') {
                    bfs(grid, m, n, i, j);
                    res++;
                }
            }
        }

        return res;
    }

    void bfs(char[][] grid, int m, int n, int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visit = new boolean[m][n];
        q.add(new int[]{i, j});

        

        while(!q.isEmpty()) {
            int size = q.size();

            for(int k = 0; k < size; k++) {
                int[] node = q.poll();
                int r = node[0], c = node[1];

                for(int[] dir : dirs) {
                    int nr = r + dir[0], nc = c + dir[1];

                    if(nr < 0 || nc < 0 || nr >= m || nc >= n || grid[nr][nc] == '0') {
                        continue;
                    }

                    if(grid[nr][nc] == '1') {
                        q.add(new int[]{nr, nc});
                        grid[nr][nc] = '0'; 
                    }
                }
            }
        }
    }
}
