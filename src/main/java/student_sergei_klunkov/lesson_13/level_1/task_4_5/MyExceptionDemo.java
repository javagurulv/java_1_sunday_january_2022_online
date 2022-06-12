package student_sergei_klunkov.lesson_13.level_1.task_4_5;

class MyExceptionDemo {

    public static void main(String[] args) {

        Exception exceptionMessage1 = new MyException("First message!");
        Throwable throwableMessage2 = new MyException("Second message!");
        Object objectMessage3 = new MyException("Third message!");

    }

}
