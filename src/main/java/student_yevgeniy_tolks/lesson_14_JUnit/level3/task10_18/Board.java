package student_yevgeniy_tolks.lesson_14_JUnit.level3.task10_18;

import java.util.Arrays;

class Board {
    private int[][] gameField;
    private int rows;
    private int cols;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        gameField = new int[rows][cols];
    }

    public int get(int row, int col) {
        return gameField[row][col];
    }

    public void set(int row, int col, int value) {
        gameField[row][col] = value;
    }

    public int getRows() {
        return gameField.length;
    }

    public int getCols() {
        return gameField[0].length;
    }

    @Override
    public String toString() {
        return  Arrays.toString(gameField);
    }
}
