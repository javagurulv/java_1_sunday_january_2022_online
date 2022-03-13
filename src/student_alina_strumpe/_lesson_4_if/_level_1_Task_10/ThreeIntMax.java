package student_alina_strumpe._lesson_4_if._level_1_Task_10;

public class ThreeIntMax {



     int number1;
     int number2;
     int number3;
    String text;



    String getMaxValue(int number1, int number2, int number3) {
        if ((number1 > number2)&&(number1 > number3)) {
            System.out.println("Max value: "+number1);
        } else if (number3 > number1 && number3 > number2) {
        System.out.println("Max value: "+number3);
        } else {
            System.out.println("Max value: "+number2);
        }

        return text;
    }


}
// Sveki! 



//    Написать программу, которая запрашивает у пользователя
//        три целых числа и выводит на консоль наибольшее из них.
//
//        PS: перед решением этой задачи распишите на бумаге
//        или в коментарии все возможные варианты (комбинации).
//        Это поможет вам правильно написать программу!












