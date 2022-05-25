package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_35_36;

class ArrayUtilMaxNumberDemo {

    public static void main(String[] args){

        ArrayUtilMaxNumber arrayUtilMaxNumber = new ArrayUtilMaxNumber();
        int arrayLength = arrayUtilMaxNumber.getArrayLengthFromUser();
        int[] newArray = arrayUtilMaxNumber.newArray(arrayLength);
        arrayUtilMaxNumber.fillArrayWithRandomNumbers(newArray);
        arrayUtilMaxNumber.printArray(newArray);
        int maxNumber = arrayUtilMaxNumber.findMaxNumber(newArray);
        System.out.println("max"+maxNumber);

    }
}
