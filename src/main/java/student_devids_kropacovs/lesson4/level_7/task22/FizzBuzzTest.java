package student_devids_kropacovs.lesson4.level_7.task22;

public class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.buzzCheck();
        fizzBuzzTest.fizzBuzzCheck();
        fizzBuzzTest.fizzCheck();
        fizzBuzzTest.numberReturnCheck();
    }

    public void fizzCheck() {
        int number = 9;
        String expectedResult = "Fizz";
        FizzBuzz f = new FizzBuzz(number);
        if (expectedResult.equals(f.fizzBuzzGame())) {
            System.out.println("Fizz Test Pass");
        } else {
            System.out.println("Fizz Test Fail");
        }
    }

    public void buzzCheck() {
        int number = 20;
        String expectedResult = "Buzz";
        FizzBuzz f = new FizzBuzz(number);
        if (expectedResult.equals(f.fizzBuzzGame())) {
            System.out.println("Buzz Test Pass");
        } else {
            System.out.println("Buzz Test Fail");
        }
    }

    public void fizzBuzzCheck() {
        int number = 30;
        String expectedResult = "FizzBuzz";
        FizzBuzz f = new FizzBuzz(number);
        if (expectedResult.equals(f.fizzBuzzGame())) {
            System.out.println("FizzBuzz Test Pass");
        } else {
            System.out.println("FizzBuzz Test Fail");
        }
    }

    public void numberReturnCheck() {
        int number = 14;
        String expectedResult = "14";
        FizzBuzz f = new FizzBuzz(number);
        if (expectedResult.equals(f.fizzBuzzGame())) {
            System.out.println("Number Test Pass");
        } else {
            System.out.println("Number Test Fail");
        }
    }
}
