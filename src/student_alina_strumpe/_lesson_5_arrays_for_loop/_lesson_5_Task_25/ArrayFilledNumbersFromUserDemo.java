package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_25;

public class ArrayFilledNumbersFromUserDemo {

    public static void main(String[] args){

        ArrayFilledNumbersFromUser arrayFilledNumbersFromUser = new ArrayFilledNumbersFromUser();

        int arrayLength = arrayFilledNumbersFromUser.getArrayLengthFromUser();
        int[] newArray = arrayFilledNumbersFromUser.newArray(arrayLength);
        arrayFilledNumbersFromUser.fillArray(newArray);
        arrayFilledNumbersFromUser.printArray(newArray);
    }
}
