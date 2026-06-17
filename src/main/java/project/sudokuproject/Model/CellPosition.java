package project.sudokuproject.Model;

/**
 * Represents a row and column inside the 6x6 Sudoku board.
 */
public final class CellPosition {

    private final int row;
    private final int column;

    /**
     * Creates an immutable board position.
     *
     * @param row board row.
     * @param column board column.
     */
    public CellPosition(int row, int column) {
        this.row = row;
        this.column = column;
    }

    /**
     * @return row index.
     */
    public int getRow() {
        return row;
    }

    /**
     * @return column index.
     */
    public int getColumn() {
        return column;
    }
}
