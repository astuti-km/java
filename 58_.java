import java.util.*;

class Solution {

    public int numIslands(char[][] grid) {

        int count = 0;

        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == '1') {

                    bfs(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    public void bfs(char[][] grid, int row, int col) {

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{row, col});

        grid[row][col] = '0';

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {

            int[] curr = q.poll();

            for (int i = 0; i < 4; i++) {

                int nr = curr[0] + dr[i];
                int nc = curr[1] + dc[i];

                if (nr >= 0 && nc >= 0 &&
                    nr < grid.length &&
                    nc < grid[0].length &&
                    grid[nr][nc] == '1') {

                    q.offer(new int[]{nr, nc});
                    grid[nr][nc] = '0';
                }
            }
        }
    }
}
