package student_sergei_klunkov.lesson_4.level_7;


class FizzBuzzTest {

     public static void main(String[] args) {

         FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();

         fizzBuzzTest.fizzTest();
         fizzBuzzTest.buzzTest();
         fizzBuzzTest.fizzBuzzTest();
         fizzBuzzTest.notDividedNumber();

     }

     public void fizzTest() {

         FizzBuzz fizzBuzz = new FizzBuzz();
         int number = 9;
         String expectedResult = "Fizz";
         String actualResult = fizzBuzz.detect(number);
         if ( expectedResult == actualResult) {
             System.out.println(expectedResult + " " + "TEST = PASSED!");
         } else {
             System.out.println("TEST = FAILED!");
         }
     }

     public void buzzTest() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 20;
        String expectedResult = "Buzz";
        String actualResult = fizzBuzz.detect(number);
        if ( expectedResult == actualResult) {
            System.out.println(expectedResult + " " + "TEST = PASSED!");
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
        } else {
            System.out.println("TEST = FAILED!");
        }
     }

     public void notDividedNumber() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 11;
        String expectedResult = "" + number;
        String actualResult = fizzBuzz.detect(number);
        if ( expectedResult != actualResult) {
            System.out.println("NotDividedNumber TEST = " + "Number " +  expectedResult + " is not divided by 3 or 5, that's why TEST PASSED!");
        }
     }

}






