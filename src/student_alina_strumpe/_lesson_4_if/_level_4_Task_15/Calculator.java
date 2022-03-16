package student_alina_strumpe._lesson_4_if._level_4_Task_15;


public class Calculator {

    int isEven;
    public int maxOfThree(int firstNumber, int secNumber, int thirdNumber) {

        if ((firstNumber > secNumber) && (firstNumber > thirdNumber)) {
            return firstNumber;
        } else if ((thirdNumber > firstNumber) && (thirdNumber > secNumber)) {
            return thirdNumber;
        } else {
            return secNumber;

            }
        }
    }

//    Добавьте в класс Calculator метод для определения
//        максимального из трёх целых чисел.
//
//        Добавьте в класс CalculatorTest тесты для этого метода.
//        Тесты должны покрывать следующие тестовые сценарии:
//        - первое число больше второго и третьего
//        - второе число больше первого и третьего
//        - третье число больше первого и второго
//        - первые два равны и больше третьего
//        - ...
//        - три числа равны
//        По одному тесту на каждый из сценариев!