class Solution {

    int[][] dirs = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    private int m = -1, n = -1;

    public int orangesRotting(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        int fresh = 0;

        Queue<int[]> q = new LinkedList<>();

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

        int time = 0;

        while(fresh > 0 && !q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                int[] node = q.poll();
                int r = node[0], c = node[1];

                for(int[] dir : dirs) {
                    int nr = r + dir[0], nc = c + dir[1];

                    if(nr >= 0 && nc >= 0 && nr < m && nc < n && grid[nr][nc] == 1) {
                        fresh--;
                        grid[nr][nc] = 2;
                        q.add(new int[]{nr, nc});
                    }
                }
            }
            time++;
        }

        return fresh == 0 ? time : -1;
    }
}
