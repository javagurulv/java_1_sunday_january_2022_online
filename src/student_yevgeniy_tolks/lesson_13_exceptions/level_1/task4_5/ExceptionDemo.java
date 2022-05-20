package student_yevgeniy_tolks.lesson_13_exceptions.level_1.task4_5;

public class ExceptionDemo {
    public static void main(String[] args) {

        Exception exceptionMessage1 = new MyException("Message for 1st exception instance");
        Throwable exceptionMessage2 = new MyException("Message for 2st exception instance");
        Object exceptionMessage3 = new MyException("Message for 3rd exception instance");

    }
}
