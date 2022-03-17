package student_vitaly_galuzo.lesson_4.level_4;

 class CalculatorTest {

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
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.twoNumbersMaxOfThreeTest1();
        calculatorTest.twoNumbersMaxOfThreeTest2();
        calculatorTest.twoNumbersMaxOfThreeTest3();
        calculatorTest.threeNumbersEqualTest4();

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

        public void maxOfThreeNumbersTest1(){
        int num1 = 20;
        int num2 = 15;
        int num3 = 10;

        Calculator calculator = new Calculator();
        int maxNum1 = calculator.maxOfThreeNumbers(num1, num2, num3);

        if(maxNum1==num1){
            System.out.println(num1 + " is the greatest! TEST = PASS");
        }else {
            System.out.println("Test = FAIL");
        }
        }

    public void maxOfThreeNumbersTest2(){
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;

        Calculator calculator = new Calculator();
        int maxNum2 = calculator.maxOfThreeNumbers(num1, num2, num3);

        if(maxNum2==num2){
            System.out.println(num2 + " is the greatest! TEST = PASS");
        }else {
            System.out.println("Test = FAIL");
        }
        }

    public void maxOfThreeNumbersTest3(){
        int num1 = 10;
        int num2 = 15;
        int num3 = 20;

        Calculator calculator = new Calculator();
        int maxNum3 = calculator.maxOfThreeNumbers(num1, num2, num3);

        if(maxNum3==num3){
            System.out.println(num3 + " is the greatest! TEST = PASS");
        }else {
            System.out.println("Test = FAIL");
        }
        }

    public void twoNumbersMaxOfThreeTest1(){
        int num1 = 20;
        int num2 = 20;
        int num3 = 10;

        Calculator calculator = new Calculator();
        int maxTwoNum1 = calculator.maxOfThreeNumbers(num1, num2, num3);

        if(maxTwoNum1==num1 && maxTwoNum1==num2 && maxTwoNum1 > num3){
            System.out.println("Both first numbers are equal and greatest than third! TEST = PASS");
        }else {
            System.out.println("Test = FAIL");
        }
        }
    public void twoNumbersMaxOfThreeTest2(){
        int num1 = 10;
        int num2 = 20;
        int num3 = 20;

        Calculator calculator = new Calculator();
        int maxTwoNum2 = calculator.maxOfThreeNumbers(num1, num2, num3);

        if(maxTwoNum2==num2 && maxTwoNum2==num3 && maxTwoNum2 > num1){
            System.out.println("Both last numbers are equal and greatest than first! TEST = PASS");
        }else {
            System.out.println("Test = FAIL");
        }
        }

    public void twoNumbersMaxOfThreeTest3(){
        int num1 = 20;
        int num2 =10;
        int num3 = 20;

        Calculator calculator = new Calculator();
        int maxTwoNum3 = calculator.maxOfThreeNumbers(num1, num2, num3);

        if(maxTwoNum3==num1 && maxTwoNum3==num3 && maxTwoNum3 > num2){
            System.out.println("First and last numbers are equal and greatest than second! TEST = PASS");
        }else {
            System.out.println("Test = FAIL");
        }
        }

    public void threeNumbersEqualTest4(){
        int num1 = 10;
        int num2 = 10;
        int num3 = 10;

        Calculator calculator = new Calculator();
        int maxTwoNum4 = calculator.maxOfThreeNumbers(num1, num2, num3);

        if(maxTwoNum4==num1 && maxTwoNum4==num2 && maxTwoNum4==num3){
            System.out.println("All three numbers are equals! TEST = PASS");
        }else {
            System.out.println("Test = FAIL");
        }
    }
}







