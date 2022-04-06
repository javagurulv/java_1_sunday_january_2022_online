package student_sergei_klunkov.lesson_6.level_5;

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
        if (field[0][1] == -1 && field[1][0] == -1 && field[1][2] == -1){
            return true;
    }
        if (field[0][2] == -1 && field[2][0] == -1 && field[2][1] == -1){
            return true;
        }
        return false;
    }

}
