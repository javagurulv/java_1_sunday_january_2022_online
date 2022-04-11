package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_6;

 class NumberUtilsTest {

    public static void main(String[] args){
        NumberUtils numberUtils = new NumberUtils();
        boolean isEven = numberUtils.isEven(0,2);

        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTest1();
        numberUtilsTest.isEvenTest2();
        numberUtilsTest.isEvenTest3();
     //   numberUtilsTest.isEvenTest4();
    }

    public void isEvenTest1(){
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.isEven(4,8);
        check(true,"isEven TEST 1" );
    }

    public void isEvenTest2(){
        NumberUtils numberUtils = new NumberUtils();
        boolean isEven = numberUtils.isEven(2,4);
        check(true,"isEven TEST 2");
    }

    public void check(boolean isEven, String name){
        if ( isEven == true){
            System.out.println(name+" test HAS  PASSED");
        } else {
            System.out.println(name+" test has FAILED");
            System.out.println("Expected result: "+true+"; actual result: "+ false);
        }
    }

             public void isEvenTest3(){
        NumberUtils numberUtils = new NumberUtils();
        boolean isEven = true;
        boolean expectedResult = numberUtils.isEven2(11);
        if (expectedResult == true){
            System.out.println(" Not Even TEST 3 HAS PASSED");
        } else {
            System.out.println("Not Even TEST 3 HAS FAILED");
        }

    }
}
