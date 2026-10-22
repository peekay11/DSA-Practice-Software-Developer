package hard.ex07_n_queens;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;

public class NQueensTest {
    @Test
    public void testCases() {
        TestRunner.assertEquals(1, NQueens.totalNQueens(1));
        TestRunner.assertEquals(0, NQueens.totalNQueens(2));
        TestRunner.assertEquals(0, NQueens.totalNQueens(3));
        TestRunner.assertEquals(2, NQueens.totalNQueens(4));
        TestRunner.assertEquals(92, NQueens.totalNQueens(8));
    }
}
