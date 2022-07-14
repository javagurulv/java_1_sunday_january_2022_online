package student_deniss_dubko.deniss_dubko_lesson_8_homework.tic_tac_toe;

import java.util.Scanner;

class HumanPlayer implements Player {

    private String name;
    private int symbol;

    public HumanPlayer(String name,
                       int symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSymbol() {
        return symbol;
    }

    @Override
    public Move getMove(Board board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinate X from 0 to 2: ");
        int getX = scanner.nextInt();
        while (getX > 3) {
            System.out.println("Wrong coordinate X");
            System.out.println("Enter coordinate X from 0 to 2: ");
            getX = scanner.nextInt();
        }

        System.out.println("Enter coordinate Y from 0 to 2: ");
        int getY = scanner.nextInt();
        while (getY > 3) {
            System.out.println("Wrong coordinate Y");
            System.out.println("Enter coordinate Y from 0 to 2: ");
            getY = scanner.nextInt();
        }
        return new Move(getX, getY, this);
    }

}