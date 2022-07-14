package student_deniss_dubko.deniss_dubko_lesson_8_homework.tic_tac_toe;

class TicTacToeGame {

    private Board board;
    private Player player1;
    private Player player2;
    private GameHistory gameHistory;

    public TicTacToeGame() {
        this.board = new Board();
        this.player1 = new HumanPlayer("Player 1", 0);
        this.player2 = new HumanPlayer("Player 2", 1);
        this.gameHistory = new GameHistory();
    }

    public void play() {
        Player currentPlayer = player1;
        while (true) {
            board.printFieldToConsole();
            Move move = currentPlayer.getMove(board);
            board.doMove(move);
            gameHistory.addMove(move);
            board.printFieldToConsole();
            if (board.isWinPosition(currentPlayer.getSymbol())) {
                System.out.println("Player " + currentPlayer.getName() + " WINS");
                break;
            }
            if (board.isDrawPosition()) {
                System.out.println("DRAW");
                break;
            }

            currentPlayer = currentPlayer == player1 ? player2 : player1;
        }

        gameHistory.printHistoryToConsole();
    }

}