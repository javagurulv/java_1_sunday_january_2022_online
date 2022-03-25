package student_yevgeniy_tolks.lesson_6.level_7.array_sort;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int [] sortArray = { 1, 2,5,3,9,32,43,12,6,9,0};
        for (int sort : sortArray){
            System.out.println(sort);

        }
        Arrays.sort(sortArray); //ascending order
        System.out.println(Arrays.toString(sortArray));
    }
}
