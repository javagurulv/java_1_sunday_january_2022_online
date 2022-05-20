package student_yevgeniy_tolks.lesson_13_exceptions.level_1.task4_5;

class MyException extends Exception {

    private String message;

    public MyException(String message) {
        this.message = message;
    }

}
