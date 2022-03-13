package student_alina_strumpe._lesson_4_if._level_1_Task_13;

 class CalculatorTest {


    public boolean isEvenTest() {
        int number = 10;
        boolean expectedResult = true;

        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven;
        if (realResult == expectedResult) {
            System.out.println("isEven TEST is OK");
        } else {
            System.out.println("isEven TEST is FAIL");
        }
        return true;
    }



    public boolean isEvenTest2() {
        int number = 15;
        boolean expectedResult = false;

        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven;
        if (realResult == expectedResult){
           System.out.println("isEven TEST 2 is ok");
        } else {
            System.out.println("isEves TEST 2 is OK");
            System.out.println("------------------");
        }

        return false;
    }

}

// я не знаю где у меня не правильно!!!