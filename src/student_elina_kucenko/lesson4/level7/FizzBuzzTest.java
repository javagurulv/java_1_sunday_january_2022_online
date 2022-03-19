package student_elina_kucenko.lesson4.level7;

class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzBuzzTest1(21);
        fizzBuzzTest.fizzBuzzTest2(10);
        fizzBuzzTest.fizzBuzzTest3(30);
        fizzBuzzTest.fizzBuzzTest4(22);
    }

    public void fizzBuzzTest1(int number) {
        String expected = fizzBuzz.detect(number);
        if (expected.equals("Fizz")) {
            System.out.println("If number can be divided to 3, say FIZZ - OK");
        } else {
            System.out.println("FIZZ check Failed");
        }
    }

    public void fizzBuzzTest2(int number) {
        String expected = fizzBuzz.detect(number);
        if (expected.equals("Buzz")) {
            System.out.println("If number can be divided to 5, say BUZZ - OK");
        } else {
            System.out.println("BUZZ check Failed");
        }
    }

    public void fizzBuzzTest3(int number) {
        String expected = fizzBuzz.detect(number);
        if (expected.equals("FizzBuzz")) {
            System.out.println("If number can be divided to 3 and 5, say FIZZBUZZ - OK");
        } else {
            System.out.println("FIZZBUZZ check Failed");
        }
    }

    public void fizzBuzzTest4(int number) {
        String expected = fizzBuzz.detect(number);
        if (expected.equals("" + number)) {
            System.out.println("Number " + number + " - OK");
        } else {
            System.out.println("Number check Failed");
        }
    }
}
