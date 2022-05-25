package student_devids_kropacovs.lesson7.task9;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.powerOfNegativeNumberTest();
        powerCalculatorTest.powerOfOneTest();
        powerCalculatorTest.powerOfZeroTest();
        powerCalculatorTest.powerOfPositiveNumberTest();
    }

    public void powerOfZeroTest(){
        PowerCalculator powerCalculator = new PowerCalculator();
        double expectedResult = 1;
        double realResult =powerCalculator.powerNumber(5,0);
        if(realResult == expectedResult){
            System.out.println("Power of 0 test PASS");
        }else{
            System.out.println("Power of 0 test FAIL");
        }
    }

    public void powerOfOneTest(){
        PowerCalculator powerCalculator = new PowerCalculator();
        double expectedResult = 5;
        double realResult =powerCalculator.powerNumber(5,1);
        if(realResult == expectedResult){
            System.out.println("Power of 1 test PASS");
        }else{
            System.out.println("Power of 1 test FAIL");
        }
    }

    public void powerOfPositiveNumberTest(){
        PowerCalculator powerCalculator = new PowerCalculator();
        double expectedResult = 125;
        double realResult =powerCalculator.powerNumber(5,3);
        if(realResult == expectedResult){
            System.out.println("Power of Positive number more than 1 test PASS");
        }else{
            System.out.println("Power of positive number more than 1 test FAIL");
        }
    }

    public void powerOfNegativeNumberTest(){
        PowerCalculator powerCalculator = new PowerCalculator();
        double expectedResult = 0.008;
        double realResult =powerCalculator.powerNumber(5,-3);
        if(realResult == expectedResult){
            System.out.println("Power of Negative number test PASS");
        }else{
            System.out.println("Power of Negative number test FAIL");
        }
    }
}
