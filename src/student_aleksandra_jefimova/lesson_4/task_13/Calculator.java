package student_aleksandra_jefimova.lesson_4.task_13;

class Calculator {
    public int number;
    boolean isEven = true;

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
