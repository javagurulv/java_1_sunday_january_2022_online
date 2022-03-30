package student_yevgeniy_tolks.lesson_6.level_5_6;

import java.util.Arrays;
import java.util.Scanner;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean winPosForHorizontals = false;

        if ((field[0][0] == playerToCheck) && (field[0][1] == playerToCheck) && (field[0][2] == playerToCheck)) {
            winPosForHorizontals = true;
        } else if ((field[1][0] == playerToCheck) && (field[1][1] == playerToCheck) && (field[1][2] == playerToCheck)) {
            winPosForHorizontals = true;
        } else if ((field[2][0] == playerToCheck) && (field[2][1] == playerToCheck) && (field[2][2] == playerToCheck)) {
            winPosForHorizontals = true;
        }
        return winPosForHorizontals;

    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean winPosForVerticals = false;

        if ((field[0][0] == playerToCheck) && (field[1][0] == playerToCheck) && (field[2][0] == playerToCheck)) {
            winPosForVerticals = true;
        } else if ((field[0][1] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][1] == playerToCheck)) {
            winPosForVerticals = true;
        } else if ((field[0][2] == playerToCheck) && (field[1][2] == playerToCheck) && (field[2][2] == playerToCheck)) {
            winPosForVerticals = true;
        }
        return winPosForVerticals;

    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean winPosForDiagonals = false;

        if ((field[0][0] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][2] == playerToCheck)) {
            winPosForDiagonals = true;
        } else if ((field[0][2] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][0] == playerToCheck)) {
            winPosForDiagonals = true;
        }
        return winPosForDiagonals;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        boolean winPosition = false;
        if (isWinPositionForDiagonals(field, playerToCheck) ||
                isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck)) {
            winPosition = true;
        }
        return winPosition;
    }

    public boolean isAllCellsEmpty(int[][] field) {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isDrawPosition(int[][] field) {
        boolean isDraw = !isWinPosition(field, 0) && !isWinPosition(field, 1)
                && !isAllCellsEmpty(field);
        return isDraw;
    }

    public int[][] createField() {

        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    public Move getNextMove() {
        Scanner coordinates = new Scanner(System.in);
        System.out.println("Enter X: ");
        int getX = coordinates.nextInt();
        while (getX > 2) {
            System.out.println("X out of bounds :\n" + "Enter X: ");
            getX = coordinates.nextInt();
        }
        System.out.println("Enter Y: ");
        int getY = coordinates.nextInt();
        while (getY > 2) {
            System.out.println("Y out of bounds :\n" + "Enter Y: ");
            getY = coordinates.nextInt();
        }
        return new Move(getX, getY);

    }

    public BotMove getNextMoveByBot(int[][] field) {
        int xBot = (int) (Math.random() * 3);
        int yBot = (int) (Math.random() * 3);
        if (canMove(field)) {
            while (field[xBot][yBot] == 1 || field[xBot][yBot] == 0) {
                xBot = (int) (Math.random() * 3);
                yBot = (int) (Math.random() * 3);
            }
        }
        return new BotMove(xBot, yBot);
    }

    public boolean canMove(int[][] field) {
        boolean freeCellToChoose = false;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1) {
                    freeCellToChoose = true;
                    break;
                }
            }
            if (freeCellToChoose) {
                break;
            }
        }
        return freeCellToChoose;
    }

    public boolean botDefenceInHorizontals(int[][] field, int opponentMove, int botMove) {
        boolean defenceInHorizontals = false;
        if ((field[0][0] == opponentMove) && (field[0][1] == opponentMove) && (field[0][2] == -1)) {
            field[0][2] = botMove;
            defenceInHorizontals = true;
        } else if ((field[0][0] == opponentMove) && (field[0][2] == opponentMove) && (field[0][1] == -1)) {
            field[0][1] = botMove;
            defenceInHorizontals = true;
        } else if ((field[0][1] == opponentMove) && (field[0][2] == opponentMove) && (field[0][0] == -1)) {
            field[0][0] = botMove;
            defenceInHorizontals = true;
        } else if ((field[1][0] == opponentMove) && (field[1][1] == opponentMove) && (field[1][2] == -1)) {
            field[1][2] = botMove;
            defenceInHorizontals = true;
        } else if ((field[1][0] == opponentMove) && (field[1][2] == opponentMove) && (field[1][1] == -1)) {
            field[1][1] = botMove;
            defenceInHorizontals = true;
        } else if ((field[1][1] == opponentMove) && (field[1][2] == opponentMove) && (field[1][0] == -1)) {
            field[1][0] = botMove;
            defenceInHorizontals = true;
        } else if ((field[2][0] == opponentMove) && (field[2][1] == opponentMove) && (field[2][2] == -1)) {
            field[2][2] = botMove;
            defenceInHorizontals = true;
        } else if ((field[2][1] == opponentMove) && (field[2][2] == opponentMove) && (field[2][0] == -1)) {
            field[2][0] = botMove;
            defenceInHorizontals = true;
        } else if ((field[2][0] == opponentMove) && (field[2][2] == opponentMove) && (field[2][1] == -1)) {
            field[2][1] = botMove;
            defenceInHorizontals = true;
        }
        return defenceInHorizontals;
    }


    public boolean botDefenceInVerticals(int[][] field, int opponentMove, int botMove) {
        boolean defenceInVerticals = false;
        if ((field[0][0] == opponentMove) && (field[1][0] == opponentMove) && (field[2][0] == -1)) {
            field[2][0] = botMove;
            defenceInVerticals = true;
        } else if ((field[0][0] == opponentMove) && (field[2][0] == opponentMove) && (field[1][0] == -1)) {
            field[1][0] = botMove;
            defenceInVerticals = true;
        } else if ((field[1][0] == opponentMove) && (field[2][0] == opponentMove) && (field[0][0] == -1)) {
            field[0][0] = botMove;
            defenceInVerticals = true;
        } else if ((field[0][1] == opponentMove) && (field[1][1] == opponentMove) && (field[2][1] == -1)) {
            field[2][1] = botMove;
            defenceInVerticals = true;
        } else if ((field[0][1] == opponentMove) && (field[2][1] == opponentMove) && (field[1][1] == -1)) {
            field[1][1] = botMove;
            defenceInVerticals = true;
        } else if ((field[1][1] == opponentMove) && (field[2][1] == opponentMove) && (field[0][1] == -1)) {
            field[0][1] = botMove;
            defenceInVerticals = true;
        } else if ((field[0][2] == opponentMove) && (field[1][2] == opponentMove) && (field[2][2] == -1)) {
            field[2][2] = botMove;
            defenceInVerticals = true;
        } else if ((field[1][2] == opponentMove) && (field[2][2] == opponentMove) && (field[0][2] == -1)) {
            field[0][2] = botMove;
            defenceInVerticals = true;
        } else if ((field[0][2] == opponentMove) && (field[2][2] == opponentMove) && (field[1][2] == -1)) {
            field[1][2] = botMove;
            defenceInVerticals = true;
        }
        return defenceInVerticals;
    }


    public boolean botDefenceInDiagonals(int[][] field, int opponentMove, int botMove) {
        boolean winPosForDiagonals = false;
        if ((field[0][0] == opponentMove) && (field[1][1] == opponentMove) && (field[2][2] == -1)) {
            field[2][2] = botMove;
            winPosForDiagonals = true;
        } else if ((field[1][1] == opponentMove) && (field[2][2] == opponentMove) && (field[0][0] == -1)) {
            field[0][0] = botMove;
            winPosForDiagonals = true;
        } else if ((field[0][0] == opponentMove) && (field[2][2] == opponentMove) && (field[1][1] == -1)) {
            field[1][1] = botMove;
            winPosForDiagonals = true;
        } else if ((field[0][2] == opponentMove) && (field[2][0] == opponentMove) && (field[1][1] == -1)) {
            field[1][1] = botMove;
            winPosForDiagonals = true;
        } else if ((field[1][1] == opponentMove) && (field[2][0] == opponentMove) && (field[0][2] == -1)) {
            field[0][2] = botMove;
            winPosForDiagonals = true;
        } else if ((field[0][2] == opponentMove) && (field[1][1] == opponentMove) && (field[2][0] == -1)) {
            field[2][0] = botMove;
            winPosForDiagonals = true;
        }
        return winPosForDiagonals;
    }

    public boolean botDefencePosition(int[][] field) {
        boolean botInDefence = false;
        if (botDefenceInDiagonals(field, 0, 1)
                || botDefenceInHorizontals(field, 0, 1)
                || botDefenceInVerticals(field, 0, 1)) {
            botInDefence = true;
        }
        return botInDefence;
    }


    public void printFieldToConsole(int[][] field) {
        System.out.println(Arrays.deepToString(field));
        System.out.println("------------------------");
    }

    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);

            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("You Win!!!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("Draw in the game!");
                break;
            }
            printFieldToConsole(field);
            BotMove move1 = getNextMoveByBot(field);
            if (!botDefencePosition(field)) {
                field[move1.getXBot()][move1.getYBot()] = 1;
            } else {
                botDefencePosition(field);
            }
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Bot Win!!!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("Draw in the game!!!");
                break;
            }
        }
    }
}

