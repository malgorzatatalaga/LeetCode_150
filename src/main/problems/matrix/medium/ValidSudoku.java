package problems.matrix.medium;

import java.util.HashSet;
import java.util.Set;

/*
36. Valid Sudoku
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> strings = new HashSet();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentVal = board[i][j];
                if (currentVal != '.') {
                    if (!strings.add(currentVal + "row" + i)
                            || !strings.add(currentVal + "col" + j)
                            || !strings.add(currentVal + "sub-box" + i / 3 + "-" + j / 3)) return false;
                }
            }
        }
        return true;
    }
}
