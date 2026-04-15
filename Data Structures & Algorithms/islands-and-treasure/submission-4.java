class Solution {
    final int INF = Integer.MAX_VALUE;
    int[][] dirs = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    int M;
    int N;
    boolean[][] visit;
    
    public void islandsAndTreasure(int[][] grid) {
        M = grid.length;
        N = grid[0].length;

        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                if(grid[i][j] == INF) {
                    grid[i][j] = bfs(grid, i, j);
                }
            }
        }
    }

    int bfs(int[][] grid, int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        visit = new boolean[M][N];
        
        visit[i][j] = true;

        int res = 0;

        while(!q.isEmpty()) {
            int size = q.size();

            for(int k = 0; k < size; k++) {
                int[] node = q.poll();
                int r = node[0], c = node[1];

                if(grid[r][c] == 0) {
                    return res;
                }

                for(int[] dir : dirs) {
                    int nr = r + dir[0], nc = c + dir[1];

                    if(nr >= 0 && nc >= 0 && nr < M && nc < N && grid[nr][nc] != -1 && !visit[nr][nc]) {
                        q.add(new int[]{nr, nc});
                        visit[nr][nc] = true;
                    }
                }
            }

            res++;
        }

        return INF;
    }
}
