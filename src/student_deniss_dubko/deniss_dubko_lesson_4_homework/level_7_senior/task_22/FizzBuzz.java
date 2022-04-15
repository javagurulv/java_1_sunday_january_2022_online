package student_deniss_dubko.deniss_dubko_lesson_4_homework.level_7_senior.task_22;

class FizzBuzz {

    public String detect(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return "" + number;
        }
    }


}
