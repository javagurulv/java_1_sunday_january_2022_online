package student_aleksandrs_padalko.lesson_4.level_4;

class CalculatorTest {  public static void main(String[] args) {
 CalculatorTest calculatorTest = new CalculatorTest();
    calculatorTest.sumTest();
    calculatorTest.minTest();
    calculatorTest.mulTest();
    calculatorTest.divTest();


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
    }}










