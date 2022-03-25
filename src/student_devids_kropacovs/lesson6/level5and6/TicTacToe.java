package student_devids_kropacovs.lesson6.level5and6;

import java.util.Scanner;

class TicTacToe {

    public int[][] createField(){
        int[][] field= new int[3][3];
        for( int i = 0; i< field.length; i++){
            for( int j =0; j< field[i].length; j++){
                field[i][j] = -1;
            }
        }
        return field;
    }

    /*
        0,0 | 0,1 | 0,2
        1,0 | 1,1 | 1,2
        2,0 | 2,1 | 2,2
 */
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){
        if (field[0][0] == playerToCheck && field[0][1] == playerToCheck && field[0][2] == playerToCheck){
            return true;
        }else if(field[1][0] == playerToCheck && field[1][1] == playerToCheck && field[1][2] == playerToCheck){
            return true;
        }else if(field[2][0] == playerToCheck && field[2][1] == playerToCheck && field[2][2] == playerToCheck){
            return true;
        }else{
            return false;
        }
    }
    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck){
         if(field[0][0] == playerToCheck && field[1][0] == playerToCheck && field[2][0] == playerToCheck){
            return true;
         }else if(field[0][1] == playerToCheck && field[1][1] == playerToCheck && field[2][1] == playerToCheck){
             return true;
         }else if(field[0][2] == playerToCheck && field[1][2] == playerToCheck && field[2][2] == playerToCheck){
             return true;
         }else{
             return false;
         }
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){
        if(field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck){
            return true;
        }else if(field[2][0] == playerToCheck && field[1][1] == playerToCheck && field[0][2] == playerToCheck){
            return true;
        }else{
            return false;
        }
    }

    public boolean isWinPosition(int[][] field, int playerToCheck){
        TicTacToe ticTacToe = new TicTacToe();
        if(     ticTacToe.isWinPositionForHorizontals(field, playerToCheck) ||
                ticTacToe.isWinPositionForVerticals(field, playerToCheck)   ||
                ticTacToe.isWinPositionForDiagonals(field, playerToCheck)   ){
            return true;
        }else{
            return false;
        }
    }

    public boolean isDrawPosition(int[][] field){
        TicTacToe ticTacToe = new TicTacToe();
        for( int i = 0; i< field.length; i++){
            for( int j =0; j < field.length; j++){
                if(field[i][j] == -1){
                    return false;
                }
            }
        }
        if(ticTacToe.isWinPosition(field,0) == false && ticTacToe.isWinPosition(field,1) == false){
            return true;
        }
        return false;
    }
    public void printFieldToConsole(int[][] field) {
        // распечатайте поле на консоль в читаемом формате
        for (int i[] : field){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter 2 coordinates");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Move move = new Move(x,y);
        return move;
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
