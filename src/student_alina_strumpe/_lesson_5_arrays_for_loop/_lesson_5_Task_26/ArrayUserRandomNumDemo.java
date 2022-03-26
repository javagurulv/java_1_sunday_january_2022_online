package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_26;

public class ArrayUserRandomNumDemo {

    public static void main(String[] args){

        ArrayUserRandomNum arrayUserRandomNum = new ArrayUserRandomNum();
        int userLength = arrayUserRandomNum.getArrayLengthFromUser();
        int[] newArray = arrayUserRandomNum.createNewArray(userLength);
        arrayUserRandomNum.fillArrayWithRandomNumbers(newArray);
        arrayUserRandomNum.printArray(newArray);


    }
}
