package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_16._lesson_6_Task_16_Reverse;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayService reversAr = new ArrayService();
        int[] myArray = reversAr.createArray(5);
        reversAr.fillArray(myArray);
        reversAr.printArray(myArray);

        reversAr.reverseArray(myArray, 0, 4);
        reversAr.printArray(myArray);

        reversAr.reverseArray(myArray, 0, 4);
        reversAr.printArray(myArray);


        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldReverseArrayInt();
        test.shouldNotReverseArrayInt();
        test.shouldCreateArray();
        test.shouldFillArray();


    }


    public void shouldReverseArrayInt() {
        ArrayService reversAr = new ArrayService();
        int[] testArray = {7,5,3,8};
        int[] expectedResult = {8,3,5,7};
        reversAr.reverseArray(testArray,0,3);
        if ( testArray[1] == expectedResult[1] ) {
            System.out.println("Test Should Reverse an Array is OK");
        } else {
            System.out.println("Test Should Reverse an Array is FAIL");
        }
    }


    public void shouldNotReverseArrayInt(){
        ArrayService reversAr = new ArrayService();
        int[] testArray = {1,2,3,4,5};
        int[] expectedResult = {1,2,3,4,5};
        reversAr.reverseArray(testArray,0,4);
        if(testArray[1]!=expectedResult[1]) {
            System.out.println("Test Should NOT to reverse array is OK");
        } else {
            System.out.println("Test Should NOT to reverse array is FAIL");
        }
    }

    public void shouldCreateArray(){
        ArrayService reversAr = new ArrayService();
        int[] arrayTest = reversAr.createArray(4);
        if (arrayTest.length == 4){
            System.out.println("Test should create the array is OK");
        } else {
            System.out.println("\"Test should create the array is FAIL\"");
        }
    }


    public void shouldFillArray(){
        ArrayService reversAr = new ArrayService();
        int[] testArray = reversAr.createArray(5);
        reversAr.fillArray(testArray);
        if(testArray[0] == 1){
            System.out.println("Test should fill an array is OK");
        } else {
            System.out.println("\"Test should fill an array is FAIL\"");
        }

    }


   /*   //  kak-to ne zadalosj s negativnim testom
    public void shouldNotFillArray(){
        ArrayService reversAr = new ArrayService();
        int[] testArray = reversAr.createArray(5);
        reversAr.fillArray(testArray);
        if(testArray[4] == 5 ){
            System.out.println("Test should  fill an array is OK");
        } else {
            System.out.println("\"Test should  fill an array is FAIL\"");
        }*/

    }



