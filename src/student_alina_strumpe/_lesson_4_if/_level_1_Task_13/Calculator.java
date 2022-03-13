package student_alina_strumpe._lesson_4_if._level_1_Task_13;

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



//    Добавьте в класс Calculator метод для определения
//        чётное число или не чётное.
//
//        Добавьте в класс CalculatorTest тесты для этого метода.
//
//        Подсказка:
//
//class Calculator {
//
//    public boolean isEven(int number) {
//        // реализуйте этот метод:
//        // return true - если число чётное (делится на 2 без остатка)
//        // иначе return false