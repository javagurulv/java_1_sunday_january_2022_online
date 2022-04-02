package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_15;

public class ArrayService2Test {

    public static void main(String[] args){

        ArrayService2Test arrayService2Test = new ArrayService2Test();
        arrayService2Test.shouldReplaceAllNumbers();
        arrayService2Test.fillArrayTest();
    }

    public void shouldReplaceAllNumbers(){
        ArrayService2 array1= new ArrayService2();
        int[] testArray = new int[3];
        int newNumber = 10;
        if(newNumber == array1.replaceALL(testArray,6,10)){
            System.out.println("Test is Ok");
        } else {
            System.out.println("Test is FAIL");
        }
    }

    public void fillArrayTest(){
        ArrayService2 array1 = new ArrayService2();
            int[] testArray = array1.createArray(3);
        int number = array1.fillArray(testArray,78);
        if (testArray[2] == number){
            System.out.println("Test is OK");
        } else{
            System.out.println("Test is FAIL");
        }
    }

}
