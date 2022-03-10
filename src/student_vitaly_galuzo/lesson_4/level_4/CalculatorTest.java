package student_vitaly_galuzo.lesson_4.level_4;

public class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.test1();
        calculatorTest.test2();
        calculatorTest.test3();
        calculatorTest.test4();
        calculatorTest.evenTest();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();

    }

    public void test1() {       //1. Podgotovka testovih dannih na vvod!
        int num1 = 55;
        int num2 = 45;

        Calculator calculator = new Calculator();    //2. Vizov production code!
        int actualResult1 = calculator.sum(num1, num2);

        if (actualResult1 == 100) {                        //3. Proverka rezultata1
            System.out.println(" TEST 1 = PASS");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void test2() {
        int num1 = 55;
        int num2 = 45;

        Calculator calculator = new Calculator();
        int actualResult2 = calculator.subtraction(num1, num2);

        if (actualResult2 == 10) {
            System.out.println(" TEST 2 = PASS");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    public void test3() {
        int num1 = 55;
        int num2 = 45;

        Calculator calculator = new Calculator();
        int actualResult3 = calculator.multiplication(num1, num2);

        if (actualResult3 == 2475) {
            System.out.println(" TEST 2 = PASS");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    public void test4() {
        int num1 = 55;
        int num2 = 45;

        Calculator calculator = new Calculator();
        int actualResult4 = calculator.division(num1, num2);

        if (actualResult4 == 1) {
            System.out.println(" TEST 4 = PASS");
        } else {
            System.out.println("TEST 4 = FAIL");
        }
    }

    public void evenTest() {
        int num1 = 4;
        int num2 = 2;

        Calculator calculator = new Calculator();
        boolean sumEvenTest = calculator.isEven(calculator.sum(num1, num2));
        boolean subEvenTest = calculator.isEven(calculator.subtraction(num1, num2));
        boolean multEvenTest = calculator.isEven(calculator.multiplication(num1, num2));
        boolean divEvenTest = calculator.isEven(calculator.division(num1, num2));
        System.out.println("Sum result is even = " + sumEvenTest);
        System.out.println("Subtraction result is even = " + subEvenTest);
        System.out.println("Multiplication result is even = " + multEvenTest);
        System.out.println("Division result is even = " + divEvenTest);
    }

    public void maxOfTwoNumbersTest1() {
        int num1 = 99;
        int num2 = 55;

        Calculator calculator = new Calculator();
        int maxNum1 = calculator.maxOfTwoNumbers(num1, num2);

        if (maxNum1 == num1) {
            System.out.println(num1 + " is the greatest! TEST = PASS");
        } else {
            System.out.println("TEST = FAIL");
        }
    }

    public void maxOfTwoNumbersTest2() {
        int num1 = 15;
        int num2 = 25;

        Calculator calculator = new Calculator();
        int maxNum2 = calculator.maxOfTwoNumbers(num1, num2);

        if (maxNum2 == num2) {
            System.out.println(num2 + " is the greatest! TEST = PASS");
        } else {
            System.out.println("TEST = FAIL");
        }
    }

    public void maxOfTwoNumbersTest3() {
        int num1 = 5;
        int num2 = 5;

        Calculator calculator = new Calculator();
        int bothEqual = calculator.maxOfTwoNumbers(num1, num2);

        if (bothEqual == num1 && bothEqual == num2) {
            System.out.println("Numbers are equals! TEST = PASS");
        } else {
            System.out.println("TEST = FAIL!");
        }
        }

}







