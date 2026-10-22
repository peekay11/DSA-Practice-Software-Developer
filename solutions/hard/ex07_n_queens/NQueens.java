package hard.ex07_n_queens;

public class NQueens {
    private static int count;

    public static int totalNQueens(int n) {
        count = 0;
        boolean[] cols = new boolean[n];
        boolean[] diag1 = new boolean[2 * n];
        boolean[] diag2 = new boolean[2 * n];
        backtrack(0, n, cols, diag1, diag2);
        return count;
    }

    private static void backtrack(int row, int n, boolean[] cols, boolean[] d1, boolean[] d2) {
        if (row == n) {
            count++;
            return;
        }
        for (int col = 0; col < n; col++) {
            int id1 = row - col + n;
            int id2 = row + col;
            if (cols[col] || d1[id1] || d2[id2]) continue;

            cols[col] = true;
            d1[id1] = true;
            d2[id2] = true;

            backtrack(row + 1, n, cols, d1, d2);

            cols[col] = false;
            d1[id1] = false;
            d2[id2] = false;
        }
    }
}
