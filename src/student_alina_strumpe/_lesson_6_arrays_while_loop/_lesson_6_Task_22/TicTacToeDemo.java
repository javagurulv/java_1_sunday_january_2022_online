package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_22;

import java.util.Arrays;

public class TicTacToeDemo {

    public static  void main(String[] args){

        TicTacToe game = new TicTacToe();
        int[][] field = game.createAnArray(3,3);
        System.out.println(Arrays.deepToString(field));
        game.fillArray(field,-1);
        System.out.println(Arrays.deepToString(field));
        boolean position = game.isWinPositionForHorizontals(field,0);
        System.out.println(position);
        System.out.println(Arrays.deepToString(field));

    }
}
