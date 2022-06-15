package student_devids_kropacovs.lesson14.level3_4;

class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] nextGeneration = new boolean[currentGeneration.length][currentGeneration[0].length];
        for(int row = 0; row < currentGeneration.length; row++){
            for(int col = 0; col < currentGeneration[0].length; col++){
                if(currentGeneration[row][col]){
                    nextGeneration[row][col] = rule1(currentGeneration, row, col) &&
                                               rule2(currentGeneration, row, col) &&
                                               rule3(currentGeneration, row, col);
                }else{
                    nextGeneration[row][col] = rule4(currentGeneration, row, col);
                }
            }
        }
        return nextGeneration;
    }

    public boolean rule1(boolean[][] currentGeneration, int row, int col){
        int aliveCells = countAliveNeighbourgs(currentGeneration, row, col);
        return aliveCells >= 2;
    }

    public boolean rule2(boolean[][] currentGeneration, int row, int col){
        int aliveCells = countAliveNeighbourgs(currentGeneration, row, col);
        return aliveCells <= 3;
    }

    public boolean rule3(boolean[][] currentGeneration, int row, int col){
        int aliveCells = countAliveNeighbourgs(currentGeneration, row, col);
        return aliveCells == 2 || aliveCells == 3;
    }

    public boolean rule4(boolean[][] currentGeneration, int row, int col){
        int aliveCells = countAliveNeighbourgs(currentGeneration, row, col);
        return aliveCells == 3;
    }


    public int countAliveNeighbourgs(boolean[][] currentGeneration, int row, int col){
        int aliveCells = 0;
        for (int row1 = row-1; row1 <= row+1;  row1++){
            if(row1 < 0 || row1 >= currentGeneration.length){
                continue;
            }
            for(int col1 = col-1; col1 <= col+1; col1++){
                if(col1 < 0 || col1 >= currentGeneration[0].length){
                    continue;
                }
                    if(!(row1 == row && col1 == col) && currentGeneration[row1][col1] ){
                        aliveCells++;
                    }
                }
            }

        return aliveCells;
    }

    public boolean exitsInField(boolean[][] currentGeneration, int row, int col){
        return row>=0 && col>=0 && row < currentGeneration.length && col< currentGeneration[0].length;
    }
}
