package student_sergei_klunkov.lesson_14.level_3;

class GameOfLifeConsoleUI {

    public void show(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.println();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]) {
                    System.out.print("X" + " ");
                } else {
                    System.out.print("." +" ");
                }
            }

        }
        System.out.println("\n--------------------");
    }

}
