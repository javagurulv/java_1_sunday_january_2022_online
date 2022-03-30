package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_12;

public class ArrayService {


    public boolean containsInArrayTheNumber(int[] array, int numberToSearch) {
        boolean found = false;
        for (int element : array) {
            if (element == numberToSearch) {
                found = true;
                break;
            }
        }
        System.out.println(found);
        return found;
    }
}
