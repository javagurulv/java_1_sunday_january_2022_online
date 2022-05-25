package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_27;

 class ArrayRanNumbAndMaxDemo {

    public static void main(String[] args){

        ArrayRanNumbAndMax arrayRanNumbAndMax = new ArrayRanNumbAndMax();
    //    int[] setArray = arrayRanNumbAndMax.setArray(8);
        int[] setArray = arrayRanNumbAndMax.newArrayWithRandomLength();
        arrayRanNumbAndMax.fillArrayWithRandomNum(setArray);
        arrayRanNumbAndMax.printArray(setArray);
     //   arrayRanNumbAndMax.findMaxInArray(setArray);
        int maxElement = arrayRanNumbAndMax.findMaxInArray(setArray);
        System.out.println("max="+maxElement);
    }
}
