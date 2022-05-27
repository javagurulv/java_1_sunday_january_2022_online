package student_yevgeniy_tolks.lesson_14_JUnit.level3_4.task10_25;

class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] nextGeneration = new boolean[currentGeneration.length][currentGeneration[0].length];
        int nextGeneratedCell;
        for (int row = 0; row < currentGeneration.length; row++) {
            for (int col = 0; col < currentGeneration[0].length; col++) {
                nextGeneratedCell = countNeighbors(currentGeneration, row, col);
                if (rules(nextGeneratedCell, currentGeneration[row][col])) {
                    nextGeneration[row][col] = true;
                }
            }
        }
        return nextGeneration;
    }

    // 4 game rules covered in method bellow
    public boolean rules(int numberOfNeighbors, boolean aliveCell) {
        boolean rulesOfGame = false;
        if (aliveCell && (numberOfNeighbors == 2 || numberOfNeighbors == 3)) {
            rulesOfGame = true;
        } else if (!aliveCell && numberOfNeighbors == 3) {
            rulesOfGame = true;
        }
        return rulesOfGame;
    }

    public int countNeighbors(boolean[][] currentGeneration, int row, int col) {
        int deadOrAlive = currentGeneration[row][col] ? -1 : 0;
        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (insideMatrix(currentGeneration, r, c)
                        && currentGeneration[r][c]) {
                    deadOrAlive++;
                }
            }
        }
        return deadOrAlive;
    }

    public boolean insideMatrix(boolean[][] field, int row, int col) {
        return row >= 0
                && row < field.length
                && col >= 0
                && col < field[0].length;
    }
}