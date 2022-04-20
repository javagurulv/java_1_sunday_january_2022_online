package student_sergei_klunkov.lesson_6.level_5;

class AiPlayer implements Player {

    private String name;
    private int symbol;

    public AiPlayer(String name, int symbol) {
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
    public String getName(){return name;}

}
