package student_alina_strumpe._lesson_6_Task_6;

 class NumberUtilsTest {

    public static void main(String[] args){
        NumberUtils numberUtils = new NumberUtils();
        boolean isEven = numberUtils.isEven(12);

        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTest1();
        numberUtilsTest.isEvenTest2();
        numberUtilsTest.isEvenTest3();
       // numberUtilsTest.isNotEvenTest4();
    }

    public void isEvenTest1(){
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.isEven(8);
        check(true,"isEven TEST 1" );
    }
    public void isEvenTest2(){

        NumberUtils numberUtils = new NumberUtils();
        boolean isEven = numberUtils.isEven(0);
        check(true,"isEven TEST 2");
    }

   /* public void isNotEvenTest4(){
        NumberUtils numberUtils = new NumberUtils();
        boolean isNotEven = numberUtils.isEven(9);
        check(false,"isNotEven TEST 4");
    }
*/

    public void check(boolean result, String name){
        if ( result == true){
            System.out.println(name+" test HAS  PASSED");
        } else {
            System.out.println(name+" test has FAILED");
            System.out.println("Expected result: "+true+"; actual result: "+ false);

        }
    }

    public void isEvenTest3(){
        NumberUtils numberUtils = new NumberUtils();
        boolean isEven = numberUtils.isEven(9);
        if (isEven == false){
            System.out.println("isEven 3 TEST HAS PASSED");
        } else {
            System.out.println("isEven 3 TEST HAS FAILED");
        }

    }
}
