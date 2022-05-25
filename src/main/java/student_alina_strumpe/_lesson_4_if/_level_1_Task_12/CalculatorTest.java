package student_alina_strumpe._lesson_4_if._level_1_Task_12;

import student_alina_strumpe._lesson_4_if._level_1_Task_11.Calculator;

public class CalculatorTest {




    public void sumTest1() {
        int firstNumber = 10;
        int secNumber = 5;
        int expectedResult = 15;

        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secNumber);
        if (realResult == expectedResult) {
            System.out.println("SUM TEST 1 is OK");
        } else {
            System.out.println("SUM TEST 1 is FAIL");
        }

    }

    public void sumTest2() {
        int firstNumber = -5;
        int secNumber = 5;
        int expectedResult = 0;

        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secNumber);
        if (realResult == expectedResult) {
            System.out.println("SUM TEST 2 is OK");
        } else {
            System.out.println("SUM TEST 2 is FAIL");

        }

    }




    public void sumTest3() {
        int firstNumber = 0;
        int secNumber = 0;
        int expectedResult = 0;

        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secNumber);
        if (realResult == expectedResult) {
            System.out.println("SUM TEST 3 is OK");
        } else {
            System.out.println("SUM TEST 3 is FAIL");
            System.out.println("-------------");
        }

    }


    public void deductionTest1(){
        int firstNumber = 5;
        int secNumber = 3;
        int expectedResult = 2;

        Calculator calculator = new Calculator();
        int realResult = calculator.deduction(firstNumber, secNumber);
        if (realResult == expectedResult){
            System.out.println("Deduction TEST 1 is OK");
        } else {
            System.out.println("Deduction TEST 1 is FAIL");

        }
    }


        public void deductionTest2(){
        int firstNumber = 0;
        int secNumber = -5;
        int expectedResult = 5;

        Calculator calculator = new Calculator();
        int realResult = calculator.deduction(firstNumber, secNumber);
        if (realResult == expectedResult){
            System.out.println("Deduction TEST 2 is OK");
        } else {
            System.out.println("Deduction TEST 2 is FAIL");
            System.out.println("-------------");
        }

     }


     public void multiplicationTest1(){
        int firstNumber = 2;
        int secNumber = 3;
        int expectedResult = 6;

        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secNumber);
        if (realResult == expectedResult){
            System.out.println("Multiplication TEST 1 is OK");
        }else {
            System.out.println("Multiplication TEST 2 is FAIL");
        }
     }


     public void multiplicationTest2(){
        int firstNumber = 0;
        int secNumber = 1;
        int expectedResult = 0;

        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secNumber);
        if (realResult == expectedResult){
            System.out.println("Multipl TEST 1 is OK");
        } else {
            System.out.println("Multipl TEST 2 is OK");
            System.out.println("-------------");
        }
     }


     public void divisionTest1(){
        int firstNumber = 5;
        int secNumber = 5;
        int expectedResult = 1;

        Calculator calculator = new Calculator();
        int realResult = calculator.division(firstNumber, secNumber);
        if (realResult == expectedResult){
            System.out.println("Division TEST 1 is OK");
        } else {
            System.out.println("Division TEST 1 is FAIL");
        }
     }



     public void divisionTest2(){
        int firsNumber = 3;
        int secNumber = -3;
        int expectedResult = -1;

        Calculator calculator = new Calculator();
        int realResult = calculator.division(firsNumber, secNumber);
        if (realResult == expectedResult){
            System.out.println("Division TEST 1 is OK");
        } else {
            System.out.println("Division TEST 2 is OK");
            System.out.println("-------------");
        }

     }



}




















// rīt pajautāšu . Tagad gulēt. ♥
