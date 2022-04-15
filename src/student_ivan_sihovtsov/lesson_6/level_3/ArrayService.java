package student_ivan_sihovtsov.lesson_6.level_3;

public class ArrayService {

    boolean contains(int[] arr, int numberToSearch){

        boolean contains = false;

        for (int i : arr){
            if (i == numberToSearch){
                contains = true;
                break;
            }
        }
        return contains;
    }

}
