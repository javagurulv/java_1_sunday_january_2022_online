package student_aleksandrs_padalko.lesson_4.level_4;

class CalculatorTest {  public static void main(String[] args) {
 CalculatorTest calculatorTest = new CalculatorTest();
    calculatorTest.sumTest();
    calculatorTest.minTest();
    calculatorTest.mulTest();
    calculatorTest.divTest();
    calculatorTest.isEvenTest();
    calculatorTest.maxOfTwoNumbersTest();
    calculatorTest.maxOfTwoNumbersTest1();
    calculatorTest.maxOfTwoNumbersTest2();
    calculatorTest.maxOfThreeNumbersTest();
    calculatorTest.maxOfThreeNumbersTest1();
    calculatorTest.maxOfThreeNumbersTest2();
    calculatorTest.maxOfThreeNumbersTest3();
    calculatorTest.maxOfThreeNumbersTest4();
    calculatorTest.maxOfThreeNumbersTest5();
}


    public void sumTest() {
        int firstNumber = 12;
        int secondNumber = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == 18) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void minTest() {
        int firstNumber = 11;
        int secondNumber = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.min(firstNumber, secondNumber);
        if (realResult == 5) {
            System.out.println("Min test = OK");
        } else {
            System.out.println("Min test = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 12;
        int secondNumber = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == 72) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 12;
        int secondNumber = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == 2) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }
    public void isEvenTest() {
    int number =2;
    Calculator calculator = new Calculator();
    boolean realResult = calculator.isEven(number);
    if ( !calculator.isEven(1) ) {
            System.out.println("isEvenTest = OK"); }
     else
    {System.out.println("isEvenTest = FAIL");}}

    public static void maxOfTwoNumbersTest() {
        int firstNumber =2;
        int secondNumber =1;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == firstNumber) {
            System.out.println("maxOfTwoNumbers test = OK");
        }
        else
        {System.out.println("maxOfTwoNumbers = FAIL");}}

    public static void maxOfTwoNumbersTest1() {
        int firstNumber =1;
        int secondNumber =2;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == secondNumber) {
            System.out.println("maxOfTwoNumbers test 1 = OK");
        }
        else
        {System.out.println("maxOfTwoNumbers 1 = FAIL");}}

    public static void maxOfTwoNumbersTest2() {
        int firstNumber =2;
        int secondNumber =2;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == firstNumber) {
            System.out.println("maxOfTwoNumbers test 2 = OK");
        }
        else
        {System.out.println("maxOfTwoNumbers 2 = FAIL");}}

        public static void maxOfThreeNumbersTest() {
            int firstNumber =3;
            int secondNumber =2;
            int thirdNumber =1;
            Calculator calculator = new Calculator();
            int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
            if (realResult == firstNumber) {
                System.out.println("maxOfThreeNumbers test = OK");
            }
            else
            {System.out.println("maxOfThreeNumbers = FAIL");}}

    public static void maxOfThreeNumbersTest1() {
        int firstNumber =2;
        int secondNumber =3;
        int thirdNumber =1;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == secondNumber) {
            System.out.println("maxOfThreeNumbers test 1 = OK");
        }
        else
        {System.out.println("maxOfThreeNumbers test 1 = FAIL");}}

    public static void maxOfThreeNumbersTest2() {
        int firstNumber =1;
        int secondNumber =2;
        int thirdNumber =3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == thirdNumber) {
            System.out.println("maxOfThreeNumbers test 2 = OK");
        }
        else
        {System.out.println("maxOfThreeNumbers test 2 = FAIL");}}

    public static void maxOfThreeNumbersTest3() {
        int firstNumber =2;
        int secondNumber =2;
        int thirdNumber =3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == thirdNumber) {
            System.out.println("maxOfThreeNumbers test 3 = OK");
        }
        else
        {System.out.println("maxOfThreeNumbers test 3 = FAIL");}}

    public static void maxOfThreeNumbersTest4() {
        int firstNumber =2;
        int secondNumber =2;
        int thirdNumber =3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == thirdNumber) {
            System.out.println("maxOfThreeNumbers test 4 = OK");
        }
        else
        {System.out.println("maxOfThreeNumbers test 4 = FAIL");}}

    public static void maxOfThreeNumbersTest5() {
        int firstNumber =3;
        int secondNumber =3;
        int thirdNumber =3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == thirdNumber) {
            System.out.println("maxOfThreeNumbers test 5 = OK");
        }
        else
        {System.out.println("maxOfThreeNumbers test 5 = FAIL");}}

}










