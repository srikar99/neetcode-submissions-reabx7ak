class Solution {

    int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    boolean pacific = false, atlantic = false;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        int m = heights.length, n = heights[0].length;
        boolean canFlow = false;
        List<List<Integer>> res = new ArrayList<>();
        boolean[][] visited = new boolean[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                pacific = false;
                atlantic = false;

                dfs(heights, i, j, m, n, visited, Integer.MAX_VALUE);
                if(pacific && atlantic) {
                    res.add(List.of(i, j));
                }
            }
        }

        return res;
    }

    void dfs(int[][] grid, int i, int j, int m, int n, boolean[][] visited, int temp) {

        if(i < 0 || j < 0) {
            pacific = true;
            return;
        }

        if(i >= m || j >= n) {
            atlantic = true;
            return;
        }

        if(grid[i][j] > temp) {
            return;
        }

        if(visited[i][j]) return;

        int tmp = grid[i][j];
        visited[i][j] = true;

        for(int[] dir : dirs) {
            dfs(grid, i + dir[0], j + dir[1], m, n, visited, tmp);

            if(pacific && atlantic) break;
        }
        
        visited[i][j] = false;
    }
}
