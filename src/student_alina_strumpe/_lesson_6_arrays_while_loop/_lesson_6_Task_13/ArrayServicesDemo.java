package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_13;

 class ArrayServicesDemo {

    public static void main(String[] args){
        ArrayServices arrayServices = new ArrayServices();
     //   int[] newArray = {11,11,11,33,55,9,6,7,8,9,10};
        int[] anArray = arrayServices.createArray(10);
        arrayServices.fillArray(anArray,11);
        int occNumbers = arrayServices.occurrenceInArray(anArray,11);
        arrayServices.printArray(anArray,occNumbers,11);
    }
}
