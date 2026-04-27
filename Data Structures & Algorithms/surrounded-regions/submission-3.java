class Solution {

    int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int m = -1, n = -1;

    public void solve(char[][] board) {
        m = board.length;
        n = board[0].length;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
               if((i == 0 || i == m-1 || j == 0 || j == n-1) && board[i][j] == 'O') {
                    dfs(board, i, j);
               }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X'; // surrounded
                if (board[i][j] == 'T') board[i][j] = 'O'; // safe, restore
            }
        }
    }

    void dfs(char[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != 'O') {
            return;
        }

        grid[i][j] = 'T';

        for(int[] dir : dirs) {
            int nr = i + dir[0], nc = j + dir[1];

            dfs(grid, nr, nc);
        }
    }
}
