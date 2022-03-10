package student_yevgeniy_tolks.lesson_4.level_7;

import java.util.Objects;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.noFizzBuzzTest();
    }
        public void fizzTest() {
            FizzBuzz fizzBuzz = new FizzBuzz();
            String fizz = "Fizz";
            if (fizzBuzz.detect(3).equals(fizz)) {
                System.out.println(fizz + " - test OK!");
            } else {
                System.out.println(fizz + " - test FAILED!");
            }
        }
        public void buzzTest() {
            FizzBuzz fizzBuzz = new FizzBuzz();
            String buzz = "Buzz";
            if (fizzBuzz.detect(5).equals(buzz)) {
                System.out.println(buzz + " - test OK");
            } else
                System.out.println(buzz + " - test FAILED");
        }

        public void fizzBuzzTest(){
            FizzBuzz fizzBuzz = new FizzBuzz();
            String  fizzBuzzCheck = "FizzBuzz";
            if(fizzBuzz.detect(15).equals(fizzBuzzCheck)){
                System.out.println(fizzBuzzCheck + " - test OK");
            }
            else {
                System.out.println(fizzBuzzCheck + " - test FAILED ");
            }

 }
        public void noFizzBuzzTest(){
        FizzBuzz noFizzBuzz = new FizzBuzz();
        String noFizzBuzzResult = "" + noFizzBuzz.detect(13);

        if(noFizzBuzz.detect(13).equals(noFizzBuzzResult)){
            System.out.println(noFizzBuzzResult + " - test OK ");
        }
        else{
            System.out.println(noFizzBuzzResult + " - test FAILED");
        }
    }
}
