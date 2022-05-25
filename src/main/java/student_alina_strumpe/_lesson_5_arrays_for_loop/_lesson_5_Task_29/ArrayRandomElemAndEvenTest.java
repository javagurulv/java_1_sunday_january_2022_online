package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_29;

 class ArrayRandomElemAndEvenTest {

    public static void main(String[] args){
        ArrayRandomElemAndEvenTest arrayRandomElemAndEvenTest = new ArrayRandomElemAndEvenTest();
        arrayRandomElemAndEvenTest.evenElementInArrayTest1();
    }

    public void evenElementInArrayTest1(){

        ArrayRandomElemAndEven arrayRandomElemAndEven = new ArrayRandomElemAndEven();

        int[] evenElement = {1,3,5};
        int actualResult = arrayRandomElemAndEven.printEvenElementsInArray(evenElement);

        if (actualResult % 2==0){
            System.out.println("Test Print Even elements in the array is OK");
        } else {
            System.out.println("Test Print Even elements in the array is FAILED");
        }
    }
}
