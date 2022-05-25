package student_vitaly_galuzo.lesson_4.level_7;

public class FizzBuzzTest {

    public static void main(String[] args) {

    FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();

    fizzBuzzTest.fizzTest();
    fizzBuzzTest.BuzzTest();
    fizzBuzzTest.fizzBuzzTest();
    fizzBuzzTest.number();




    }


    public void fizzTest() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 9;
        String expectedResult = "Fizz";
        String actualResult = fizzBuzz.detect(number);
        if ( expectedResult == actualResult) {
            System.out.println(expectedResult + " " + "TEST = PASSED!");
            System.out.println(number +" " + "can be divided by 3 so Test is ok!");
        } else {
            System.out.println("TEST = FAILED!");
        }
        }

    public void BuzzTest() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 10;
        String expectedResult = "Buzz";
        String actualResult = fizzBuzz.detect(number);
        if ( expectedResult == actualResult) {
            System.out.println(expectedResult + " " + "TEST = PASSED!");
            System.out.println(number + " " + "can be divided by 5 so Test is ok!");
        } else {
            System.out.println("TEST = FAILED!");
        }
        }

    public void fizzBuzzTest() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 15;
        String expectedResult = "FizzBuzz";
        String actualResult = fizzBuzz.detect(number);
        if ( expectedResult == actualResult) {
            System.out.println(expectedResult + " " + "TEST = PASSED!");
            System.out.println(number + " " + "can be divided by 3 and 5 so Test is ok!");
        } else {
            System.out.println("TEST = FAILED!");
        }
        }


    public void number() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 11;
        String expectedResult = "" + number;
        String actualResult = fizzBuzz.detect(number);
        if ( expectedResult == actualResult) {
            System.out.println("TEST = PASSED!");
            System.out.println(number + " " + "cant be divided by 3 and 5 so Test is ok!");
        } else {
            System.out.println("TEST = FAILED!");
        }
        }
















}
