package student_deniss_dubko.deniss_dubko_lesson_8_homework.tic_tac_toe;

class AIPlayer implements Player {

    private String name;
    private int symbol;

    public AIPlayer(String name,
                    int symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    @Override
    public Move getMove(Board board) {

        int cellState = board.getCellState(1, 1);
        return null;
    }

    @Override
    public int getSymbol() {
        return symbol;
    }

    @Override
    public String getName() {
        return name;
    }

}