class Solution:
    def islandsAndTreasure(self, grid: List[List[int]]) -> None:

        m = len(grid)
        n = len(grid[0])
        dirs = [(0, 1), (1, 0), (0, -1), (-1, 0)]
        INF = 2147483647
        q = deque()
        visited = set()

        for i in range(m):
            for j in range(n):
                if grid[i][j] == 0:
                    visited.add((i, j))
                    q.append([i, j])

        if not q:
            return

        dist = 0

        while q:
            for k in range(len(q)):
                r, c = q.popleft()
                
                grid[r][c] = dist

                for d in dirs:
                    row = r + d[0]
                    col = c + d[1]

                    if min(row, col) < 0 or row >= m or col >= n or grid[row][col] == -1 or (row, col) in visited:
                        continue;

                    visited.add((row, col))
                    q.append([row, col])
            dist += 1
                


        