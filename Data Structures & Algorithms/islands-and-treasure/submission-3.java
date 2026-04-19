class Solution {
    final int INF = Integer.MAX_VALUE;
    int[][] dirs = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    int M;
    int N;
    boolean[][] visit;

    public void islandsAndTreasure(int[][] grid) {
        M = grid.length;
        N = grid[0].length;
        visit = new boolean[M][N];

        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                if(grid[i][j] == INF) {
                    grid[i][j] = dfs(grid, i, j);
                }
            }
        }
    }

    int dfs(int[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= M || j >= N || grid[i][j] == -1 || visit[i][j]) {
            return INF;
        }

        if(grid[i][j] == 0) {
            return 0;
        }

        visit[i][j] = true;
        int res = INF;

        for(int[] dir : dirs) {
            int curr = dfs(grid, i + dir[0], j + dir[1]);
           
            if(curr != INF) {
                res = Math.min(res, 1 + curr);
            }
        }
        visit[i][j] = false;
        return res;
    }
}
