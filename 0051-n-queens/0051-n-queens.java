class Solution {

    int board[][];

    public List<List<String>> solveNQueens(int n) {

        board = new int[n][n];

        List<List<String>> ans = new ArrayList<>();

        isValid(0, n, ans);

        return ans;
    }

    public boolean isSafe(int row, int col, int n) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n; i--, j++) {

            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public void isValid(int row, int n, List<List<String>> ans) {

        if (row == n) {

            List<String> temp = new ArrayList<>();

            for (int i = 0; i < n; i++) {

                StringBuilder str = new StringBuilder();

                for (int j = 0; j < n; j++) {

                    if (board[i][j] == 1) {
                        str.append('Q');
                    } else {
                        str.append('.');
                    }
                }

                temp.add(str.toString());
            }

            ans.add(temp);
            return;
        }

        for (int col = 0; col < n; col++) {

            if (isSafe(row, col, n)) {

                board[row][col] = 1;

                isValid(row + 1, n, ans);

                board[row][col] = 0;
            }
        }
    }
}