package student_yevgeniy_tolks.lesson_14_JUnit.level3_4.task10_25;

class GameOfLifeConsoleUi {

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