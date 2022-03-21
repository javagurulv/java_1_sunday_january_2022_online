package student_yevgeniy_tolks.lesson_6.level_4.task_21;

import java.util.Arrays;

public class TwoDimArrayDemo {

    public static void main(String[] args) {
        TwoDimArray dimArray = new TwoDimArray();
        int[][] resultOfArray = dimArray.twoDimArray(3,3);
        dimArray.fillArray(resultOfArray);
        System.out.println(Arrays.deepToString(resultOfArray));
        int resultOfSum=dimArray.sumTwoDimArray(resultOfArray);
        System.out.println("Sum = " + resultOfSum);
    }

}
