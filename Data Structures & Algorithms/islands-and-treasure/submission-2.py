class Solution:
    def islandsAndTreasure(self, grid: List[List[int]]) -> None:

        dirs = [(1, 0), (0, 1), (-1, 0), (0, -1)]
        m, n = len(grid), len(grid[0])
        INF = 2147483647
        
        q = deque()

        for i in range(m):
            for j in range(n):
                if grid[i][j] == 0:
                    q.append([i, j])

        while q:
            r, c = q.popleft()

            for d in dirs:
                nr, nc = r + d[0], c + d[1]

                if nr < 0 or nc < 0 or nr >= m or nc >= n or grid[nr][nc] != INF:
                    continue;

                if grid[nr][nc] == INF:
                    grid[nr][nc] = 1 + grid[r][c]
                    q.append([nr, nc]) 

        