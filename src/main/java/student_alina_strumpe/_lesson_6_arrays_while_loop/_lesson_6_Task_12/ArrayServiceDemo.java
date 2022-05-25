package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_12;

import java.util.Arrays;

class ArrayServiceDemo {

    public static void main(String[] args) {

        ArrayService contains = new ArrayService();
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int numberToSearch = 11;
        contains.containsInArrayTheNumber(array,numberToSearch);
        contains.printArray(array,numberToSearch);

    }
}


//с булиан у меня всё плохо. я их вообще не понимаю. и while тоже !!