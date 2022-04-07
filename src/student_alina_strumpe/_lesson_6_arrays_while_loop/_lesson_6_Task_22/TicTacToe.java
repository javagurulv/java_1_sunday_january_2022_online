package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_22;



class TicTacToe {

    private int playerToCheck;
    private int freeCell = -1;



    public int[][] createAnArray(int rowLength, int columnLength) {
        return new int[rowLength][columnLength];
    }

       public void fillArray(int[][] array, int number) {
           for (int i = 0; i < array.length; i++) {
               for (int j = 0; j < array[i].length; j++) {
                   array[i][j] = number;
               }
           }
       }
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean isWinPosition = true;
        for (int i = 0; i < field.length; i++) {
            if (i == 1){
                break;
            }
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == freeCell){
                    field [i][j] = playerToCheck;
                    isWinPosition = true;

                } else {
                    isWinPosition = false;
                }
            }
        }
        return isWinPosition;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean isWinPosition = true;
        for(int i=0; i<field.length ; i++){
            for (int j=0; j<field.length; j++){
               if (field[j][i] == freeCell){
                    field[j][i] = playerToCheck;
                    isWinPosition = true;
                } else {
                   isWinPosition = false;
               }
            }
        }
        return isWinPosition;
    }
}