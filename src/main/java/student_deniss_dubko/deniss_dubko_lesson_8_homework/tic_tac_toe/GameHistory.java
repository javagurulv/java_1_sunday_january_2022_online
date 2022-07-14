package student_deniss_dubko.deniss_dubko_lesson_8_homework.tic_tac_toe;

import java.util.ArrayList;
import java.util.List;

class GameHistory {

    private List<Move> moves = new ArrayList<>();

    public void addMove(Move move) {
        moves.add(move);
    }

    public void printHistoryToConsole() {
        System.out.println("Game History: ");
        for (int i = 0; i < moves.size(); i++) {
            Move move = moves.get(i);
            Player player = move.getPlayer();
            System.out.println(
                    i + "."
                            + player.getName()
                            + "[" + move.getX() + "]"
                            + "[" + move.getY() + "]"
                            + " - " + player.getSymbol()
            );
        }
    }

}