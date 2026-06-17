package project.sudokuproject.Model;

import java.util.Random;

/**
 * Provides random 6x6 Sudoku puzzles and their complete solution.
 */
public class SudokuPuzzle {

    private static final Random RANDOM = new Random();

    private static final int[][][] PUZZLES = {

            // Plantilla 1
            {
                    {1, 0, 0, 4, 0, 0},
                    {0, 5, 0, 0, 2, 0},
                    {2, 0, 0, 5, 0, 0},
                    {0, 6, 0, 0, 3, 0},
                    {3, 0, 0, 6, 0, 0},
                    {0, 1, 0, 0, 4, 0}
            },

            // Plantilla 2
            {
                    {0, 2, 0, 0, 5, 0},
                    {4, 0, 0, 1, 0, 0},
                    {0, 3, 0, 0, 6, 0},
                    {5, 0, 0, 2, 0, 0},
                    {0, 4, 0, 0, 1, 0},
                    {6, 0, 0, 3, 0, 0}
            },

            // Plantilla 3
            {
                    {1, 0, 0, 0, 5, 0},
                    {0, 0, 6, 1, 0, 0},
                    {2, 0, 0, 0, 6, 0},
                    {0, 0, 1, 2, 0, 0},
                    {3, 0, 0, 0, 1, 0},
                    {0, 0, 2, 3, 0, 0}
            }
    };

    private static final int[][] SOLUTION = {
            {1, 2, 3, 4, 5, 6},
            {4, 5, 6, 1, 2, 3},
            {2, 3, 4, 5, 6, 1},
            {5, 6, 1, 2, 3, 4},
            {3, 4, 5, 6, 1, 2},
            {6, 1, 2, 3, 4, 5}
    };

    private final int selectedPuzzle;

    /**
     * Selects a random template when a new game is created.
     */
    public SudokuPuzzle() {
        selectedPuzzle = RANDOM.nextInt(PUZZLES.length);
    }

    /**
     * @return copy of a random puzzle.
     */
    public int[][] copyPuzzle() {
        return copyMatrix(PUZZLES[selectedPuzzle]);
    }

    /**
     * @return copy of the complete solution.
     */
    public int[][] copySolution() {
        return copyMatrix(SOLUTION);
    }

    private int[][] copyMatrix(int[][] source) {
        int[][] copy = new int[SudokuBoard.SIZE][SudokuBoard.SIZE];

        for (int row = 0; row < SudokuBoard.SIZE; row++) {
            System.arraycopy(source[row], 0, copy[row], 0, SudokuBoard.SIZE);
        }

        return copy;
    }
}