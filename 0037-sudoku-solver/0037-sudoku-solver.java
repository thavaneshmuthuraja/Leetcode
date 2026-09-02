class Solution {

    boolean check(int r, int c, char[][] board, char k) {
        for (int i = 0; i < 9; i++) {
            if (board[r][i] == k)
                return false;
        }

        for (int i = 0; i < 9; i++) {
            if (board[i][c] == k)
                return false;
        }

        int str = (r / 3) * 3;
        int stc = (c / 3) * 3;

        for (int i = str; i < str + 3; ++i) {
            for (int j = stc; j < stc + 3; ++j) {
                if (board[i][j] == k)
                    return false;
            }
        }

        return true;
    }

    boolean func(int i, int j, char[][] board) {
        if (i == 9 && j == 0) {
            return true;
        }
        if (j == 9) {
            if (func(i + 1, 0, board))
                return true;
            return false;
        }

        if (board[i][j] != '.') {
            if (func(i, j + 1, board))
                return true;
            return false;
        }

        for (int k = 1; k <= 9; k++) {
            if (check(i, j, board, (char) (k + '0'))) {
                board[i][j] = (char) (k + '0');
                if (func(i, j + 1, board))
                    return true;
                board[i][j] = '.';
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {

        func(0, 0, board);
    }
}