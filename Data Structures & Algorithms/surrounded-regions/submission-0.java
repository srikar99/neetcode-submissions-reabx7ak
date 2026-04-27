class Solution {

    int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int m = -1, n = -1;

    public void solve(char[][] board) {
        m = board.length;
        n = board[0].length;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                dfs(board, i, j);
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 'O') {
                    board[i][j] = 'X';
                }

                if(board[i][j] == 'T') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    void dfs(char[][] grid, int i, int j) {
        
        for(int[] dir : dirs) {
            int nr = i + dir[0], nc = j + dir[1];

            if(nr < 0 || nc < 0 || nr >= m || nc >= n) {
                if(grid[i][j] == 'O') {
                    grid[i][j] = 'T';
                }
            }
        }
    }
}
