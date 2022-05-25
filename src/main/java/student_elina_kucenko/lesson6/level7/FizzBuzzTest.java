package student_elina_kucenko.lesson6.level7;

class FizzBuzzTest {


    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();

    }

    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String fizzBuzzTest = "FizzBuzz";
        if (fizzBuzz.detect(15).equals(fizzBuzzTest)) {
            System.out.println("FizzBuzz test - OK");
        } else {
            System.out.println("FizzBuzz test failed");
        }

    }

    public void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String fizzTest = "Fizz";
        if (fizzBuzz.detect(30).equals(fizzTest)) {
            System.out.println("Fizz test - OK");
        } else {
            System.out.println("Fizz test failed");
        }


    }

    public void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String buzzTest = "Buzz";
        if (fizzBuzz.detect(5).equals(buzzTest)) {
            System.out.println("Buzz test - OK");
        } else {
            System.out.println("Buzz test failed");
        }


    }
}
