package student_sergei_klunkov.lesson_4.lessoncode;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest testRunner = new CalculatorTest();
        testRunner.testMaxNumbers();
        testRunner.testIsEven();
    }

    public void testMaxNumbers(){
        Calculator subject = new Calculator();

        int expectedResult = 20;
        int actualResult = subject.max(10,20);
        if (expectedResult == actualResult){
            System.out.println("Test has passed!");
        } else {
            System.out.println("Test failed!");
            System.out.println("Expected: " + expectedResult + " but actual " + actualResult);


    }


}

public void testIsEven(){
        Calculator subject = new Calculator();
        boolean expectedResult = true;
        boolean actualResult = subject.isEven(10);
        if (actualResult) {
            System.out.println("Test has passed!");
        } else {
            System.out.println("Test failed!");
            System.out.println("Expected: true but actual " + actualResult );
        }
 }
}
