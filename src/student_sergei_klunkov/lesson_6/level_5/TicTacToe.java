package student_sergei_klunkov.lesson_6.level_5;


import java.util.Arrays;
import java.util.Scanner;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){
        if( field[0][0] == playerToCheck && field [0][1] == playerToCheck && field[0][2] == playerToCheck){
            return true;
        }
        if( field[1][0] == playerToCheck && field[1][1] == playerToCheck && field[1][2] == playerToCheck) {
            return true;
        }
        if( field[2][0] == playerToCheck && field[2][2] == playerToCheck && field[2][1] == playerToCheck) {
            return true;
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field [1][0] == playerToCheck && field[2][0] == playerToCheck){
            return true;
        }
        if (field[0][1] == playerToCheck && field [1][1] == playerToCheck && field[2][1] == playerToCheck){
            return true;
        }
        if (field[0][2] == playerToCheck && field [2][2] == playerToCheck && field[1][2] == playerToCheck){
            return true;
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        } else if (field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck) {
            return true;
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck){
        return isWinPositionForDiagonals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForHorizontals(field, playerToCheck);

    }

    public boolean isDrawPosition(int[][] field){
        return !isWinPosition(field, 0) && !isWinPosition(field, 1);

    }


    public int[][] createField(){

        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = -1;
            }
        }
        return arr;
    }

    public Move getNextMove(){

        Scanner coordinates = new Scanner(System.in);
        System.out.println("Enter X: ");
        int getX = coordinates.nextInt();
        while (getX > 2){
            System.out.println("X out of bounds :\n + Enter X:");
            getX = coordinates.nextInt();
        }
        System.out.println("Enter Y: ");
        int getY = coordinates.nextInt();
        while (getY > 2){
            System.out.println("Y out of bounds :\n + Enter Y:");
            getY = coordinates.nextInt();

        }
        return new Move(getX, getY);
    }

    public void printFieldToConsole(int[][] field) {
        System.out.println(Arrays.deepToString(field));
        System.out.println(".........................");
    }

    public void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);

            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}
