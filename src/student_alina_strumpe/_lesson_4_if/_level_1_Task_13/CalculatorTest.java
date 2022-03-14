package student_alina_strumpe._lesson_4_if._level_1_Task_13;

  class CalculatorTest {

     public void main(String[] args){

     }


    public void isEvenTest() {

        boolean expectedResult = true;

        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven;
        if (realResult == true) {
            System.out.println("isEven TEST is OK");
        } else {
            System.out.println("isEven TEST is FAIL");
        }

    }



    public void isEvenTest2() {

        boolean expectedResult = false;

        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven;
        if (realResult == false){
           System.out.println("isEven TEST 2 is OK");
        } else {
            System.out.println("isEves TEST 2 is OK");
                   }

    }

}

