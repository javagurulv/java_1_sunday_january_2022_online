package student_alina_strumpe._lesson_4_if._level_4_Task_14;

 class Calculator {



     int maxOfTwoNumbers(int firstNumber, int secNumber) {

         if (firstNumber > secNumber) {
               return firstNumber;
         } else {
               return secNumber;

         }

     }


 }




//    Добавьте в класс Calculator метод для определения
//        максимального из двух целых чисел.
//
//        Добавьте в класс CalculatorTest тесты для этого метода.
//        Тесты должны покрывать следующие тестовые сценарии:
//        - первое число больше второго
//        - второе число больше первого
//        - оба числа равны
//        Создайте по одному тесту на каждый из сценариев!
//
//
//        Подсказка:
//
//class Calculator {
//
//    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
//        // реализуйте этот метод