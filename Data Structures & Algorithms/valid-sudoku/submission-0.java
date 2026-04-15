class Solution {
    public boolean isValidSudoku(char[][] board) {
        int r = board.length, c = board[0].length;

        for(int row = 0; row < 9; row++) {
            Set<Character> set = new HashSet<>();

            for(int i = 0; i < 9; i++) {
                if(board[row][i] == '.') continue;
                if(set.contains(board[row][i])) return false;

                set.add(board[row][i]);
            }
        }

        for(int col = 0; col < 9; col++) {
            Set<Character> set = new HashSet<>();

            for(int i = 0; i < 9; i++) {
                if(board[i][col] == '.') continue;
                if(set.contains(board[i][col])) return false;

                set.add(board[i][col]);
            }
        }

        for(int sq = 0; sq < 9; sq++) {
            Set<Character> set = new HashSet<>();

            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    int row = (sq / 3) * 3 + i;
                    int col = (sq % 3) * 3 + j;

                    if(board[row][col] == '.') continue;
                    if(set.contains(board[row][col])) return false;

                    set.add(board[row][col]);
                }
            }
        }

        return true;
    }
}
