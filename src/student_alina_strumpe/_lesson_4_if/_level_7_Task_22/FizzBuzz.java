package student_alina_strumpe._lesson_4_if._level_7_Task_22;

class FizzBuzz {

  //  private int number;
    String name;




    public String detect(int number) {

        if (number % 3 == 1) {
            return "Fizz";
        }

        if (number % 5 == 2)  {
            return "Buzz";
        }

        if (number % 3 % 5 == 0) {
            return "FizzBuzz";
        }

        if (number == 5) {
            final String s = "null";
            return s;
        }
        return name;
    }




    }





//    Создайте класс FizzBuzz.
//        В классе FizzBuzz создайте метод со следующей сигнатурой:
//
//class FizzBuzz {
//
//    public String detect(int number) {
//        // Реализуйте следующие требования:
//        // - если переданное число делится на три возвращайте "Fizz"
//        // - если переданное число делится на пять возвращайте "Buzz"
//        // - если переданное число делится на три и на пять возвращайте "FizzBuzz"
//        // - иначе возвращайте само число в виде строки (подсказка: return "" +  number)
//    }
//
//}
//
//    Создайте класс FizzBuzzTest и напишите автоматические тесты,
//        которые покрывают все возможные сценарии.