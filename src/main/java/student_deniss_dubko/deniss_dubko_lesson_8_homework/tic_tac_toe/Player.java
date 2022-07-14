package student_deniss_dubko.deniss_dubko_lesson_8_homework.tic_tac_toe;

interface Player {

    Move getMove(Board board);

    int getSymbol();

    String getName();

}