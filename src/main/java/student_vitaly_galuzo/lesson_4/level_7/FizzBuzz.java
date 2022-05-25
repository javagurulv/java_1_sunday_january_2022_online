package student_vitaly_galuzo.lesson_4.level_7;

public class FizzBuzz {


    // - если переданное число делится на три возвращайте "Fizz"
    // - если переданное число делится на пять возвращайте "Buzz"
    // - если переданное число делится на три и на пять возвращайте "FizzBuzz"
    // - иначе возвращайте само число в виде строки (подсказка: return "" +  number)


    public String detect( int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else {
            return "" + number;
        }
        }



































}
