package student_devids_kropacovs.lesson14.level3_4;

class GameOfLifeUI {
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
